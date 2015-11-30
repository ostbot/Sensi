package de.ostbot.sensi.control;

import de.ostbot.sensi.model.Schema;
import de.ostbot.sensi.model.SorteMitTopf;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Datenbankoperationen {

    Connection connectionObject;

    public Datenbankoperationen() {

    }

    private void verbindenZurDB() {

        this.connectionObject = null;

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connectionObject = DriverManager.getConnection("jdbc:mysql://localhost/sensi", "root", "");
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Diese Methode schreibt die Daten aus dem Frame 'SorteMitTopf' in die Datenbank
    //Pflanze und Topf werden aus der Combobox gezogen (die Werte wurden in einem anderen Frame definiert)
    //und werden dann übergeben an die unten folgende Funktion
    public void pflanzeMitTopfInDatenbankAnlegen(SorteMitTopf pflanzeObject) {

        String sqlStringPflanze, sqlStringTopf;
        PreparedStatement statementPflanze = null, statementTopf = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            sqlStringPflanze = "INSERT INTO pflanzen (sorte, herkunftsland, indica, sativa) VALUES (?, ?, ?, ?)";
            sqlStringTopf = "INSERT INTO medien (topfgroesse, substrat) VALUES (?, ?)";
            statementPflanze = connectionObject.prepareStatement(sqlStringPflanze);
            statementTopf = connectionObject.prepareCall(sqlStringTopf);

            statementPflanze.setString(1, pflanzeObject.getSorte());
            statementPflanze.setString(2, pflanzeObject.getHerkunftsland());
            statementPflanze.setInt(3, pflanzeObject.getIndica());
            statementPflanze.setInt(4, pflanzeObject.getSativa());
            /**/
            statementTopf.setDouble(1, pflanzeObject.getTopfgroesse());
            statementTopf.setString(2, pflanzeObject.getSubstrat());

            statementPflanze.executeUpdate();
            statementTopf.executeUpdate();
            connectionObject.commit();

        } catch (SQLException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);

            if (connectionObject != null) {
                try {
                    System.err.print("Transaction is being rolled back.");
                    connectionObject.rollback();
                } catch (SQLException excep) {
                    Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, excep);
                }
            }
        } finally {
            try {
                statementPflanze.close();
                statementTopf.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //VORGANG ZUM ERSTELLEN DES STATUS BEGINNT
    //Zyklus wird aus Woche und Phase angelegt
    //Im DB-Modell erwartet er keine 'String phase' sondern dessen ID
    //in der Methode wird aber die Methode 'getPhaseID' aufgerufen
    //welche den 'String phase' entgegen nimmt und die passende phaseID zurück gibt
    public void zyklusInDatenbankAnlegen(int woche, String phase) {
        String sqlStringZyklusInDatenbankAnlegen;
        int phaseID = getPhaseID(phase);
        PreparedStatement statement = null;

        try {
            sqlStringZyklusInDatenbankAnlegen = "INSERT INTO zyklen"
                    + " (fk_phase_id, woche)"
                    + " VALUES(?,?)";

            verbindenZurDB();
            connectionObject.setAutoCommit(false);
            statement = connectionObject.prepareStatement(sqlStringZyklusInDatenbankAnlegen);

            statement.setInt(1, phaseID);
            statement.setInt(2, woche);

            statement.executeUpdate();
            connectionObject.commit();

        } catch (SQLException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);

            if (connectionObject != null) {
                try {
                    System.err.print("Transaction is being rolled back.");
                    connectionObject.rollback();
                } catch (SQLException excep) {
                    Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, excep);
                }
            }
        } finally {
            try {
                statement.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //Duengerschema erwartet im DB-Modell keinen 'String duenger' sondern dessen ID
    //in der Methode wird aber die Methode 'getDunegerID' aufgerufen
    //welche den 'String duenger' entgegen nimmt und die passende duengerID zurück gibt
    //Duenger ist eine statische Tabelle die nicht vom Benutzer verändert werden kann
    public void duengerschemaInDatenbankAnlegen(double terra_vega_ml_woche, double terra_flores_ml_woche,
            double mono_tracemix_ml_woche, double mono_stickstoff_ml_woche, double mono_phosphor_ml_woche,
            double mono_kalium_ml_woche, double mono_magnesium_ml_woche, double mono_kalizum_ml_woche,
            double mono_eisen_ml_woche, double start_ml_woche, double flush_ml_woche,
            double accelerator_ml_woche, double pk_ml_woche, double rhizotonic_ml_woche, double cannazym_ml_woche, 
            boolean montag, boolean dienstag, boolean mittwoch, boolean donnerstag, boolean freitag, boolean samstag, boolean sonntag) {

        String sqlStringDuengerschemaInDatenbankAnlegen;
        PreparedStatement statement = null;

        try {
            sqlStringDuengerschemaInDatenbankAnlegen = "INSERT INTO duengerschema "
                    + "(terra_vega_ml_woche, terra_flores_ml_woche, mono_tracemix_ml_woche, "
                    + "mono_stickstoff_ml_woche, mono_phosphor_ml_woche, mono_kalium_ml_woche, "
                    + "mono_magnesium_ml_woche, mono_kalizum_ml_woche, "
                    + "mono_eisen_ml_woche, start_ml_woche, flush_ml_woche, accelerator_ml_woche, pk_ml_woche, "
                    + "rhizotonic_ml_woche, cannazym_ml_woche, "
                    + "montag, dienstag, mittwoch, donnerstag, freitag, samstag, sonntag) "
                    + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            verbindenZurDB();
            connectionObject.setAutoCommit(false);
            statement = connectionObject.prepareStatement(sqlStringDuengerschemaInDatenbankAnlegen);

            statement.setDouble(1, terra_vega_ml_woche); statement.setDouble(2, terra_flores_ml_woche); 
            statement.setDouble(3, mono_tracemix_ml_woche); statement.setDouble(4, mono_stickstoff_ml_woche); 
            statement.setDouble(5, mono_phosphor_ml_woche); statement.setDouble(6, mono_kalium_ml_woche);
            statement.setDouble(7, mono_magnesium_ml_woche); statement.setDouble(8, mono_kalizum_ml_woche); 
            statement.setDouble(9, mono_eisen_ml_woche); statement.setDouble(10, start_ml_woche); 
            statement.setDouble(11, flush_ml_woche); statement.setDouble(12, accelerator_ml_woche);
            statement.setDouble(13, pk_ml_woche); statement.setDouble(14, rhizotonic_ml_woche); statement.setDouble(15, cannazym_ml_woche);  
            statement.setBoolean(16, montag);
            statement.setBoolean(17, dienstag);
            statement.setBoolean(18, mittwoch);
            statement.setBoolean(19, donnerstag);
            statement.setBoolean(20, freitag);
            statement.setBoolean(21, samstag);
            statement.setBoolean(22, sonntag);

            statement.executeUpdate();
            connectionObject.commit();

        } catch (SQLException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);

            if (connectionObject != null) {
                try {
                    System.err.print("Transaction is being rolled back.");
                    connectionObject.rollback();
                } catch (SQLException excep) {
                    Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, excep);
                }
            }
        } finally {
            try {
                statement.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //Wasser in Datenbank anlegen aus pH-Wert und den Litern pro Tag
    //(Werte werden aus dem Slider und dem Spinner gezogen)
    public void wasserInDatenbankAnlegen(double pHWert, double literProTag) {
        String sqlStringWasserInDatenbankAnlegen;
        PreparedStatement statement = null;

        try {
            sqlStringWasserInDatenbankAnlegen = "INSERT INTO wasser"
                    + " (pH_wert, liter_pro_tag)"
                    + " VALUES(?,?)";

            verbindenZurDB();
            connectionObject.setAutoCommit(false);
            statement = connectionObject.prepareStatement(sqlStringWasserInDatenbankAnlegen);

            statement.setDouble(1, pHWert);
            statement.setDouble(2, literProTag);

            statement.executeUpdate();
            connectionObject.commit();

        } catch (SQLException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);

            if (connectionObject != null) {
                try {
                    System.err.print("Transaction is being rolled back.");
                    connectionObject.rollback();
                } catch (SQLException excep) {
                    Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, excep);
                }
            }
        } finally {
            try {
                statement.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //Nahrung wird angelegt aus den Fremdschlüsseln von Wasser und Duengerschema
    //(Diese werden beim Speichern des Status aus ihren Tabellen gezogen (nachdem sie angelegt wurden)
    //-> und der Methode unten übergben.) 
    //Danach übernimmt die Tabelle 'Status' die nahrungID
    //Dies geschieht alles in einem Zug wie man der Methode 'statusInDatenbankAnlegen' entnehmen kann
    public void nahrungInDatenbankAnlegen(int wasserID, int duengerschemaID) {
        String sqlStringNahrungInDatenbankAnlegen;
        PreparedStatement statement = null;

        try {
            sqlStringNahrungInDatenbankAnlegen = "INSERT INTO nahrung"
                    + " (fk_wasser_id, fk_duengerschema_id)"
                    + " VALUES(?,?)";

            verbindenZurDB();
            connectionObject.setAutoCommit(false);
            statement = connectionObject.prepareStatement(sqlStringNahrungInDatenbankAnlegen);

            statement.setInt(1, wasserID);
            statement.setInt(2, duengerschemaID);

            statement.executeUpdate();
            connectionObject.commit();

        } catch (SQLException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);

            if (connectionObject != null) {
                try {
                    System.err.print("Transaction is being rolled back.");
                    connectionObject.rollback();
                } catch (SQLException excep) {
                    Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, excep);
                }
            }
        } finally {
            try {
                statement.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //Status für Grow anlegen da T.Grow die ID von der T.Status erwartet
    public void statusInDatenbankAnlegen(Schema schemaObject) {
        String sqlStringStatusInDatenbankAnlegen;
        PreparedStatement statement = null;
        //Setzen und holen der Variablen die für das Anlegen des Status erforderlich sind
        int pflanzeID = getPflanzeID(schemaObject.getSorte());
        int mediumID = getMediumID(schemaObject.getTopfgroesse(), schemaObject.getSubstrat());
        zyklusInDatenbankAnlegen(schemaObject.getWoche(), schemaObject.getPhase());
        wasserInDatenbankAnlegen(schemaObject.getpHWert(), schemaObject.getLiterProTag());
        duengerschemaInDatenbankAnlegen(schemaObject.getTerraVega_ml_woche(), schemaObject.getTerra_flores_ml_woche(), 
                schemaObject.getMono_tracemix_ml_woche(), schemaObject.getMono_stickstoff_ml_woche(),
                schemaObject.getMono_phosphor_ml_woche(), schemaObject.getMono_kalium_ml_woche(), 
                schemaObject.getMono_magnesium_ml_woche(), schemaObject.getMono_kalizum_ml_woche(),
                schemaObject.getMono_eisen_ml_woche(), schemaObject.getStart_ml_woche(), 
                schemaObject.getFlush_ml_woche(), schemaObject.getAccelerator_ml_woche(), 
                schemaObject.getPk_ml_woche(), schemaObject.getRhizotonic_ml_woche(), 
                schemaObject.getCannazym_ml_woche(), schemaObject.isMontag(), schemaObject.isDienstag(), 
                schemaObject.isMittwoch(), schemaObject.isDonnerstag(), schemaObject.isFreitag(), 
                schemaObject.isSamstag(), schemaObject.isSonntag());
        int zyklusID = getZyklusID(schemaObject.getWoche(), schemaObject.getPhase());
        int wasserID = getWasserID(schemaObject.getpHWert(), schemaObject.getLiterProTag());
        int duengerschemaID = getDuengerschemaID(schemaObject.getTerraVega_ml_woche(), schemaObject.getTerra_flores_ml_woche(), 
                schemaObject.getMono_tracemix_ml_woche(), schemaObject.getMono_stickstoff_ml_woche(),
                schemaObject.getMono_phosphor_ml_woche(), schemaObject.getMono_kalium_ml_woche(), 
                schemaObject.getMono_magnesium_ml_woche(), schemaObject.getMono_kalizum_ml_woche(),
                schemaObject.getMono_eisen_ml_woche(), schemaObject.getStart_ml_woche(), 
                schemaObject.getFlush_ml_woche(), schemaObject.getAccelerator_ml_woche(), 
                schemaObject.getPk_ml_woche(), schemaObject.getRhizotonic_ml_woche(), 
                schemaObject.getCannazym_ml_woche(), schemaObject.isMontag(), schemaObject.isDienstag(), 
                schemaObject.isMittwoch(), schemaObject.isDonnerstag(), schemaObject.isFreitag(), 
                schemaObject.isSamstag(), schemaObject.isSonntag());
        nahrungInDatenbankAnlegen(wasserID, duengerschemaID);
        int nahrungID = getNahrungID(wasserID, duengerschemaID);

        //Status wird in der Datenbank mit den oben geholten Variablen angelegt
        try {
            sqlStringStatusInDatenbankAnlegen = "INSERT INTO status"
                    + " (fk_medium_id, fk_zyklus_id, fk_nahrung_id, fk_pflanze_id)"
                    + " VALUES (?,?,?,?)";

            verbindenZurDB();
            connectionObject.setAutoCommit(false);
            statement = connectionObject.prepareStatement(sqlStringStatusInDatenbankAnlegen);

            statement.setInt(1, mediumID);
            statement.setInt(2, zyklusID);
            statement.setInt(3, nahrungID);
            statement.setInt(4, pflanzeID);

            statement.executeUpdate();
            connectionObject.commit();

        } catch (SQLException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);

            if (connectionObject != null) {
                try {
                    System.err.print("Transaction is being rolled back.");
                    connectionObject.rollback();
                } catch (SQLException excep) {
                    Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, excep);
                }
            }
        } finally {
            try {
                statement.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //VORGANG ZUM ERSTELLEN DES STATUS ABGESCHLOSSEN
    //VORGANG ZUM ERSTELLEN DER UMGEBUNG BEGINNT
    public void temperaturInDatenbankAnlegen(double temperaturAmTag, double temperaturInDerNacht) {
        String sqlStringTemperaturInDatenbankAnlegen;
        PreparedStatement statement = null;

        try {
            sqlStringTemperaturInDatenbankAnlegen = "INSERT INTO temperatur"
                    + " (tag, nacht)"
                    + " VALUES(?,?)";

            verbindenZurDB();
            connectionObject.setAutoCommit(false);
            statement = connectionObject.prepareStatement(sqlStringTemperaturInDatenbankAnlegen);

            statement.setDouble(1, temperaturAmTag);
            statement.setDouble(2, temperaturInDerNacht);

            statement.executeUpdate();
            connectionObject.commit();

        } catch (SQLException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);

            if (connectionObject != null) {
                try {
                    System.err.print("Transaction is being rolled back.");
                    connectionObject.rollback();
                } catch (SQLException excep) {
                    Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, excep);
                }
            }
        } finally {
            try {
                statement.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void luftfeuchtigkeitInDatenbankAnlegen(int luftfeuchtigkeitAmTag, int luftfeuchtigkeitInDerNacht) {
        String sqlStringLuftfeuchtigkeitInDatenbankAnlegen;
        PreparedStatement statement = null;

        try {
            sqlStringLuftfeuchtigkeitInDatenbankAnlegen = "INSERT INTO luftfeuchtigkeit"
                    + " (tag, nacht)"
                    + " VALUES(?,?)";

            verbindenZurDB();
            connectionObject.setAutoCommit(false);
            statement = connectionObject.prepareStatement(sqlStringLuftfeuchtigkeitInDatenbankAnlegen);

            statement.setInt(1, luftfeuchtigkeitAmTag);
            statement.setInt(2, luftfeuchtigkeitInDerNacht);

            statement.executeUpdate();
            connectionObject.commit();

        } catch (SQLException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);

            if (connectionObject != null) {
                try {
                    System.err.print("Transaction is being rolled back.");
                    connectionObject.rollback();
                } catch (SQLException excep) {
                    Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, excep);
                }
            }
        } finally {
            try {
                statement.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void klimaInDatenbankAnlegen(double temperaturID, double luftfeuchtigkeitID) {
        String sqlStringKlimaInDatenbankAnlegen;
        PreparedStatement statement = null;

        try {
            sqlStringKlimaInDatenbankAnlegen = "INSERT INTO klima"
                    + " (fk_temperatur_id, fk_luftfeuchtigkeit_id)"
                    + " VALUES(?,?)";

            verbindenZurDB();
            connectionObject.setAutoCommit(false);
            statement = connectionObject.prepareStatement(sqlStringKlimaInDatenbankAnlegen);

            statement.setDouble(1, temperaturID);
            statement.setDouble(2, luftfeuchtigkeitID);

            statement.executeUpdate();
            connectionObject.commit();

        } catch (SQLException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);

            if (connectionObject != null) {
                try {
                    System.err.print("Transaction is being rolled back.");
                    connectionObject.rollback();
                } catch (SQLException excep) {
                    Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, excep);
                }
            }
        } finally {
            try {
                statement.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //Umgebung für Grow anlegen da T.Grow die ID von der T.Umgebung erwartet
    public void umgebungInDatenbankAnlegen(Schema schemaObject) {
        String sqlStringStatusInDatenbankAnlegen;
        PreparedStatement statement = null;
        double beleuchtungsflaeche = schemaObject.getBeleuchtungsflaeche();
        int leistung = schemaObject.getLeistung();
        //Setzen und holen der Variablen die für das Anlegen der Umgebung erforderlich sind
        temperaturInDatenbankAnlegen(schemaObject.getTemperaturAmTag(), schemaObject.getTemperaturInderNacht());
        luftfeuchtigkeitInDatenbankAnlegen(schemaObject.getLuftfeuchtigkeitAmTag(), schemaObject.getLuftfeuchtigkeitInDerNacht());
        int temperaturID = getTemperaturID(schemaObject.getTemperaturAmTag(), schemaObject.getTemperaturInderNacht());
        int luftfeuchtigkeitID = getLuftfeuchtigkeitID(schemaObject.getLuftfeuchtigkeitAmTag(), schemaObject.getLuftfeuchtigkeitInDerNacht());
        klimaInDatenbankAnlegen(temperaturID, luftfeuchtigkeitID);
        int klimaID = getKlimaID(temperaturID, luftfeuchtigkeitID);

        //Status wird in der Datenbank mit den oben geholten Variablen angelegt
        try {
            sqlStringStatusInDatenbankAnlegen = "INSERT INTO umgebungen"
                    + " (fk_klima_id, beleuchtungsflaeche, leistung)"
                    + " VALUES (?,?,?)";

            verbindenZurDB();
            connectionObject.setAutoCommit(false);
            statement = connectionObject.prepareStatement(sqlStringStatusInDatenbankAnlegen);

            statement.setInt(1, klimaID);
            statement.setDouble(2, beleuchtungsflaeche);
            statement.setInt(3, leistung);

            statement.executeUpdate();
            connectionObject.commit();

        } catch (SQLException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);

            if (connectionObject != null) {
                try {
                    System.err.print("Transaction is being rolled back.");
                    connectionObject.rollback();
                } catch (SQLException excep) {
                    Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, excep);
                }
            }
        } finally {
            try {
                statement.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //Getter für pk_medium_id
    public int getMediumID(double topfgroesse, String substrat) {
        String sqlStringMediumID;
        int mediumID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            sqlStringMediumID = "SELECT pk_medium_id FROM medien "
                    + "WHERE topfgroesse LIKE (?) AND substrat LIKE (?)";
            statement = connectionObject.prepareStatement(sqlStringMediumID);
            statement.setDouble(1, topfgroesse);
            statement.setString(2, substrat);

            resultSet = statement.executeQuery();
            connectionObject.commit();

            resultSet.next();
            mediumID = resultSet.getInt("pk_medium_id");

        } catch (SQLException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);

            if (connectionObject != null) {
                try {
                    System.err.print("Transaction is being rolled back.");
                    connectionObject.rollback();
                } catch (SQLException excep) {
                    Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, excep);
                }
            }
        } finally {
            try {
                statement.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mediumID;
    }

    //Getter für pk_phase_id
    public int getPhaseID(String phase) {
        String sqlStringPhaseID;
        int phaseID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            sqlStringPhaseID = "SELECT pk_phase_id FROM phasen "
                    + "WHERE phase LIKE (?)";
            statement = connectionObject.prepareStatement(sqlStringPhaseID);
            statement.setString(1, phase);

            resultSet = statement.executeQuery();
            connectionObject.commit();

            resultSet.next();
            phaseID = resultSet.getInt("pk_phase_id");

        } catch (SQLException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);

            if (connectionObject != null) {
                try {
                    System.err.print("Transaction is being rolled back.");
                    connectionObject.rollback();
                } catch (SQLException excep) {
                    Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, excep);
                }
            }
        } finally {
            try {
                statement.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return phaseID;
    }

    //Getter für pk_zyklus_id
    public int getZyklusID(int woche, String phase) {
        String sqlStringZyklusID;
        int zyklusID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            sqlStringZyklusID = "SELECT pk_zyklus_id FROM zyklen "
                    + "WHERE fk_phase_id LIKE (?) AND woche LIKE (?)";
            statement = connectionObject.prepareStatement(sqlStringZyklusID);
            statement.setInt(1, getPhaseID(phase));
            verbindenZurDB();
            connectionObject.setAutoCommit(false);
            statement.setInt(2, woche);

            resultSet = statement.executeQuery();
            connectionObject.commit();

            resultSet.next();
            zyklusID = resultSet.getInt("pk_zyklus_id");

        } catch (SQLException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);

            if (connectionObject != null) {
                try {
                    System.err.print("Transaction is being rolled back.");
                    connectionObject.rollback();
                } catch (SQLException excep) {
                    Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, excep);
                }
            }
        } finally {
            try {
                statement.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return zyklusID;
    }

    //Getter für pk_wasser_id
    public int getWasserID(double pHWert, double literProTag) {
        String sqlStringWasserID;
        int wasserID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            sqlStringWasserID = "SELECT pk_wasser_id FROM wasser "
                    + "WHERE pH_wert LIKE (?) AND liter_pro_tag LIKE (?)";
            statement = connectionObject.prepareStatement(sqlStringWasserID);
            statement.setDouble(1, pHWert);
            statement.setDouble(2, literProTag);

            resultSet = statement.executeQuery();
            connectionObject.commit();

            resultSet.next();
            wasserID = resultSet.getInt("pk_wasser_id");

        } catch (SQLException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);

            if (connectionObject != null) {
                try {
                    System.err.print("Transaction is being rolled back.");
                    connectionObject.rollback();
                } catch (SQLException excep) {
                    Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, excep);
                }
            }
        } finally {
            try {
                statement.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return wasserID;
    }

    //Getter für pk_duenger_id
    public int getDuengerID(String duenger) {
        String sqlStringDuengerID;
        int duengerID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            sqlStringDuengerID = "SELECT pk_duenger_id FROM duenger "
                    + "WHERE duenger LIKE (?)";
            statement = connectionObject.prepareStatement(sqlStringDuengerID);
            statement.setString(1, duenger);

            resultSet = statement.executeQuery();
            connectionObject.commit();

            resultSet.next();
            duengerID = resultSet.getInt("pk_duenger_id");

        } catch (SQLException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);

            if (connectionObject != null) {
                try {
                    System.err.print("Transaction is being rolled back.");
                    connectionObject.rollback();
                } catch (SQLException excep) {
                    Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, excep);
                }
            }
        } finally {
            try {
                statement.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return duengerID;
    }

    //Getter für pk_duengerschema_id
    public int getDuengerschemaID(double terraVega_ml_woche, double terra_flores_ml_woche, 
           double mono_tracemix_ml_woche, double mono_stickstoff_ml_woche, double mono_phosphor_ml_woche, 
           double mono_kalium_ml_woche, double mono_magnesium_ml_woche, double mono_kalizum_ml_woche, 
           double mono_eisen_ml_woche, double start_ml_woche, double flush_ml_woche, 
           double accelerator_ml_woche, double pk_ml_woche, double rhizotonic_ml_woche, 
           double cannazym_ml_woche, boolean montag, boolean dienstag, boolean mittwoch, 
           boolean donnerstag, boolean freitag, boolean samstag, boolean sonntag) {
        String sqlStringDuengerschemaID;
        int duengerschemaID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            sqlStringDuengerschemaID = "SELECT pk_duengerschema_id FROM duengerschema"
                    + " WHERE terra_vega_ml_woche LIKE (?) AND terra_flores_ml_woche LIKE (?)"
                    + " AND mono_tracemix_ml_woche LIKE (?) AND mono_stickstoff_ml_woche LIKE (?)"
                    + " AND mono_phosphor_ml_woche LIKE (?) AND mono_kalium_ml_woche LIKE (?)"
                    + " AND mono_magnesium_ml_woche LIKE (?) AND mono_kalizum_ml_woche LIKE (?)"
                    + " AND mono_eisen_ml_woche LIKE (?) AND start_ml_woche LIKE (?)"
                    + " AND flush_ml_woche LIKE (?) AND accelerator_ml_woche LIKE (?)"
                    + " AND pk_ml_woche LIKE (?) AND rhizotonic_ml_woche LIKE (?)"
                    + " AND cannazym_ml_woche LIKE (?) AND montag LIKE (?) AND dienstag LIKE (?)"
                    + " AND mittwoch LIKE (?) AND donnerstag LIKE (?) AND freitag LIKE (?)"
                    + " AND samstag LIKE (?) AND sonntag LIKE (?)";
            statement = connectionObject.prepareStatement(sqlStringDuengerschemaID);
            
            statement.setDouble(1, terraVega_ml_woche); statement.setDouble(2, terra_flores_ml_woche); 
            statement.setDouble(3, mono_tracemix_ml_woche); statement.setDouble(4, mono_stickstoff_ml_woche); 
            statement.setDouble(5, mono_phosphor_ml_woche); statement.setDouble(6, mono_kalium_ml_woche);
            statement.setDouble(7, mono_magnesium_ml_woche); statement.setDouble(8, mono_kalizum_ml_woche); 
            statement.setDouble(9, mono_eisen_ml_woche); statement.setDouble(10, start_ml_woche); 
            statement.setDouble(11, flush_ml_woche); statement.setDouble(12, accelerator_ml_woche);
            statement.setDouble(13, pk_ml_woche); statement.setDouble(14, rhizotonic_ml_woche); statement.setDouble(15, cannazym_ml_woche);  
            statement.setBoolean(16, montag);
            statement.setBoolean(17, dienstag);
            statement.setBoolean(18, mittwoch);
            statement.setBoolean(19, donnerstag);
            statement.setBoolean(20, freitag);
            statement.setBoolean(21, samstag);
            statement.setBoolean(22, sonntag);

            resultSet = statement.executeQuery();
            connectionObject.commit();

            resultSet.next();
            duengerschemaID = resultSet.getInt("pk_duengerschema_id");

        } catch (SQLException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);

            if (connectionObject != null) {
                try {
                    System.err.print("Transaction is being rolled back.");
                    connectionObject.rollback();
                } catch (SQLException excep) {
                    Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, excep);
                }
            }
        } finally {
            try {
                statement.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return duengerschemaID;
    }

    //Getter für pk_nahrung_id
    public int getNahrungID(int wasserID, int duengerschemaID) {
        String sqlStringNahrungID;
        int nahrungID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            sqlStringNahrungID = "SELECT pk_nahrung_id FROM nahrung "
                    + "WHERE fk_wasser_id LIKE (?) AND fk_duengerschema_id LIKE (?)";
            statement = connectionObject.prepareStatement(sqlStringNahrungID);
            statement.setInt(1, wasserID);
            statement.setInt(2, duengerschemaID);

            resultSet = statement.executeQuery();
            connectionObject.commit();

            resultSet.next();
            nahrungID = resultSet.getInt("pk_nahrung_id");

        } catch (SQLException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);

            if (connectionObject != null) {
                try {
                    System.err.print("Transaction is being rolled back.");
                    connectionObject.rollback();
                } catch (SQLException excep) {
                    Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, excep);
                }
            }
        } finally {
            try {
                statement.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return nahrungID;
    }

    //Getter für pk_pflanze_id
    public int getPflanzeID(String sorte) {
        String sqlStringPflanzeID;
        int pflanzeID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            sqlStringPflanzeID = "SELECT pk_pflanze_id FROM pflanzen "
                    + "WHERE sorte LIKE (?)";
            statement = connectionObject.prepareStatement(sqlStringPflanzeID);
            statement.setString(1, sorte);

            resultSet = statement.executeQuery();
            connectionObject.commit();

            resultSet.next();
            pflanzeID = resultSet.getInt("pk_pflanze_id");

        } catch (SQLException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);

            if (connectionObject != null) {
                try {
                    System.err.print("Transaction is being rolled back.");
                    connectionObject.rollback();
                } catch (SQLException excep) {
                    Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, excep);
                }
            }
        } finally {
            try {
                statement.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return pflanzeID;
    }

    //Getter für pk_bodenfeuchtigkeit_id
    //Getter für pk_duengerschema_id
    //Getter für pk_energiekosten_id
    //Getter für pk_ernte_id
    //Getter für pk_grow_id
    //Getter für pk_klima_id
    public int getKlimaID(int temperaturID, int luftfeuchtigkeitID) {
        String sqlStringKlimaID;
        int klimaID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            sqlStringKlimaID = "SELECT pk_klima_id FROM klima "
                    + "WHERE fk_temperatur_id LIKE (?) AND fk_luftfeuchtigkeit_id LIKE (?)";
            statement = connectionObject.prepareStatement(sqlStringKlimaID);
            statement.setInt(1, temperaturID);
            statement.setInt(2, luftfeuchtigkeitID);

            resultSet = statement.executeQuery();
            connectionObject.commit();

            resultSet.next();
            klimaID = resultSet.getInt("pk_klima_id");

        } catch (SQLException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);

            if (connectionObject != null) {
                try {
                    System.err.print("Transaction is being rolled back.");
                    connectionObject.rollback();
                } catch (SQLException excep) {
                    Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, excep);
                }
            }
        } finally {
            try {
                statement.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return klimaID;
    }

    //Getter für pk_luftfeuchtigkeit_id
    public int getLuftfeuchtigkeitID(int luftfeuchtigkeitAmTag, int luftfeuchtigkeitInDerNacht) {
        String sqlStringLuftfeuchtigkeitID;
        int luftfeuchtigkeitID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            sqlStringLuftfeuchtigkeitID = "SELECT pk_luftfeuchtigkeit_id FROM luftfeuchtigkeit "
                    + "WHERE tag LIKE (?) AND nacht LIKE (?)";
            statement = connectionObject.prepareStatement(sqlStringLuftfeuchtigkeitID);
            statement.setInt(1, luftfeuchtigkeitAmTag);
            statement.setInt(2, luftfeuchtigkeitInDerNacht);

            resultSet = statement.executeQuery();
            connectionObject.commit();

            resultSet.next();
            luftfeuchtigkeitID = resultSet.getInt("pk_luftfeuchtigkeit_id");

        } catch (SQLException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);

            if (connectionObject != null) {
                try {
                    System.err.print("Transaction is being rolled back.");
                    connectionObject.rollback();
                } catch (SQLException excep) {
                    Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, excep);
                }
            }
        } finally {
            try {
                statement.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return luftfeuchtigkeitID;
    }

    //Getter für pk_makroelemente_id
    //Getter für pk_mikroelemente_id
    //Getter für pk_status_id
    //Getter für pk_temperatur_id
    public int getTemperaturID(double temperaturAmTag, double temperaturInDerNacht) {
        String sqlStringTemperaturID;
        int temperaturID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            sqlStringTemperaturID = "SELECT pk_temperatur_id FROM temperatur "
                    + "WHERE tag LIKE (?) AND nacht LIKE (?)";
            statement = connectionObject.prepareStatement(sqlStringTemperaturID);
            statement.setDouble(1, temperaturAmTag);
            statement.setDouble(2, temperaturInDerNacht);

            resultSet = statement.executeQuery();
            connectionObject.commit();

            resultSet.next();
            temperaturID = resultSet.getInt("pk_temperatur_id");

        } catch (SQLException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);

            if (connectionObject != null) {
                try {
                    System.err.print("Transaction is being rolled back.");
                    connectionObject.rollback();
                } catch (SQLException excep) {
                    Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, excep);
                }
            }
        } finally {
            try {
                statement.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return temperaturID;
    }
    //Getter für pk_umgebung_id

    //Anzeiger für ComboBox
    public List<String> getHerkunftslaender() {

        String sqlStringLaender, land;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List laenderListe = new ArrayList();

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            sqlStringLaender = "SELECT * FROM herkunftslaender";
            statement = connectionObject.prepareStatement(sqlStringLaender);

            resultSet = statement.executeQuery();
            connectionObject.commit();

            while (resultSet.next()) {
                land = resultSet.getString("herkunftsland");
                laenderListe.add(land);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);

            if (connectionObject != null) {
                try {
                    System.err.print("Transaction is being rolled back.");
                    connectionObject.rollback();
                } catch (SQLException excep) {
                    Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, excep);
                }
            }
        } finally {
            try {
                statement.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return laenderListe;
    }

    //Anzeiger für ComboBox
    public List<String> getSubstrate() {

        String sqlStringSubstrate, substrat;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List substratListe = new ArrayList();

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            sqlStringSubstrate = "SELECT * FROM substrate";
            statement = connectionObject.prepareStatement(sqlStringSubstrate);

            resultSet = statement.executeQuery();
            connectionObject.commit();

            while (resultSet.next()) {
                substrat = resultSet.getString("substrat");
                substratListe.add(substrat);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);

            if (connectionObject != null) {
                try {
                    System.err.print("Transaction is being rolled back.");
                    connectionObject.rollback();
                } catch (SQLException excep) {
                    Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, excep);
                }
            }
        } finally {
            try {
                statement.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return substratListe;
    }

    //Anzeiger für ComboBox
    public List<String> getSorten() {

        String sqlStringSorten, sorte;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List sortenListe = new ArrayList();

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            sqlStringSorten = "SELECT sorte FROM pflanzen";
            statement = connectionObject.prepareStatement(sqlStringSorten);

            resultSet = statement.executeQuery();
            connectionObject.commit();

            while (resultSet.next()) {
                sorte = resultSet.getString("sorte");
                sortenListe.add(sorte);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);

            if (connectionObject != null) {
                try {
                    System.err.print("Transaction is being rolled back.");
                    connectionObject.rollback();
                } catch (SQLException excep) {
                    Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, excep);
                }
            }
        } finally {
            try {
                statement.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return sortenListe;
    }

    //Anzeiger für ComboBox
    public List<String> getTopfgroessenMitSubstrat() {

        String sqlStringTopfgroessenMitSubstrat, topfgroesseMitSubstrat;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List topfgroessenMtSubstratListe = new ArrayList();

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            sqlStringTopfgroessenMitSubstrat = "SELECT topfgroesse, substrat FROM medien";
            statement = connectionObject.prepareStatement(sqlStringTopfgroessenMitSubstrat);

            resultSet = statement.executeQuery();
            connectionObject.commit();

            while (resultSet.next()) {
                topfgroesseMitSubstrat = String.valueOf(resultSet.getDouble("topfgroesse"));
                topfgroesseMitSubstrat += "L (";
                topfgroesseMitSubstrat += resultSet.getString("substrat");
                topfgroesseMitSubstrat += ")";
                topfgroessenMtSubstratListe.add(topfgroesseMitSubstrat);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);

            if (connectionObject != null) {
                try {
                    System.err.print("Transaction is being rolled back.");
                    connectionObject.rollback();
                } catch (SQLException excep) {
                    Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, excep);
                }
            }
        } finally {
            try {
                statement.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return topfgroessenMtSubstratListe;
    }

    //Anzeiger für ComboBox
    public List<String> getPhasen() {

        String sqlStringPhasen, phase;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List phasenListe = new ArrayList();

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            sqlStringPhasen = "SELECT phase FROM phasen";
            statement = connectionObject.prepareStatement(sqlStringPhasen);

            resultSet = statement.executeQuery();
            connectionObject.commit();

            while (resultSet.next()) {
                phase = resultSet.getString("phase");
                phasenListe.add(phase);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);

            if (connectionObject != null) {
                try {
                    System.err.print("Transaction is being rolled back.");
                    connectionObject.rollback();
                } catch (SQLException excep) {
                    Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, excep);
                }
            }
        } finally {
            try {
                statement.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return phasenListe;
    }
}
