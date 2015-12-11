package de.ostbot.sensi.control;

import de.ostbot.sensi.model.Makroelemente;
import de.ostbot.sensi.model.Mikroelemente;
import de.ostbot.sensi.model.Schema;
import de.ostbot.sensi.model.SorteMitTopf;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    
    //Die folgenden Methoden werden in der Methode 'pflanzeMitTopfInDatenbankAnlegen()' benötigt
    public List<String> getHerkunftslaender() {
        List<String> laenderListe = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String land;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            String sqlStringLaender = "SELECT * FROM herkunftslaender";
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
                resultSet.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return laenderListe;
    }
    public List<String> getSubstrate() {
        List<String> substratListe = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String substrat;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            String sqlStringSubstrate = "SELECT * FROM substrate";
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
                resultSet.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return substratListe;
    }
    //Pflanze und Medium wird erstellt
    public void pflanzeMitTopfInDatenbankAnlegen(SorteMitTopf sorteMitTopfObject) {
        PreparedStatement statementPflanze = null, statementTopf = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            String sqlStringPflanze = "INSERT INTO pflanzen (sorte, herkunftsland, indica, sativa) VALUES (?, ?, ?, ?)",
                   sqlStringTopf = "INSERT INTO medien (topfgroesse, substrat) VALUES (?, ?)";
            statementPflanze = connectionObject.prepareStatement(sqlStringPflanze);
            statementTopf = connectionObject.prepareCall(sqlStringTopf);

            statementPflanze.setString(1, sorteMitTopfObject.getSorte());
            statementPflanze.setString(2, sorteMitTopfObject.getHerkunftsland());
            statementPflanze.setInt(3, sorteMitTopfObject.getIndica());
            statementPflanze.setInt(4, sorteMitTopfObject.getSativa());
            /**/
            statementTopf.setDouble(1, sorteMitTopfObject.getTopfgroesse());
            statementTopf.setString(2, sorteMitTopfObject.getSubstrat());

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
    
    
    //Die folgenden Methoden werden in der Methode 'statusInDatenbankAnlegen()' benötigt
    public int getDuengerschemaIDLastInsert() {
        int duengerschemaID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            String sqlStringDuengerID = "SELECT pk_duengerschema_id FROM duengerschema "
                    + "ORDER BY pk_duengerschema_id DESC LIMIT 1";
            statement = connectionObject.prepareStatement(sqlStringDuengerID);

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
    public int getDuengerschemaID(double terraVegaMilliliter, double terraFloresMilliliter, 
                  double monoTracemixMilliliter, double monoStickstoffMilliliter, double monoPhosphorMilliliter, 
                  double monoKaliumMilliliter, double monoMagnesiumMilliliter, double monoKalziumMilliliter, 
                  double monoEisenMilliliter, double startMilliliter, double flushMilliliter, 
                  double acceleratorMilliliter, double pkMilliliter, double rhizotonicMilliliter, 
                  double cannazymMilliliter, boolean montag, boolean dienstag, boolean mittwoch, 
                  boolean donnerstag, boolean freitag, boolean samstag, boolean sonntag) {
        int duengerschemaID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            String sqlStringDuengerschemaID = "SELECT pk_duengerschema_id FROM duengerschema"
                    + " WHERE terra_vega_ml_woche LIKE (?) AND terra_flores_ml_woche LIKE (?)"
                    + " AND mono_tracemix_ml_woche LIKE (?) AND mono_stickstoff_ml_woche LIKE (?)"
                    + " AND mono_phosphor_ml_woche LIKE (?) AND mono_kalium_ml_woche LIKE (?)"
                    + " AND mono_magnesium_ml_woche LIKE (?) AND mono_kalzium_ml_woche LIKE (?)"
                    + " AND mono_eisen_ml_woche LIKE (?) AND start_ml_woche LIKE (?)"
                    + " AND flush_ml_woche LIKE (?) AND accelerator_ml_woche LIKE (?)"
                    + " AND pk_ml_woche LIKE (?) AND rhizotonic_ml_woche LIKE (?)"
                    + " AND cannazym_ml_woche LIKE (?) AND montag LIKE (?) AND dienstag LIKE (?)"
                    + " AND mittwoch LIKE (?) AND donnerstag LIKE (?) AND freitag LIKE (?)"
                    + " AND samstag LIKE (?) AND sonntag LIKE (?)";
            statement = connectionObject.prepareStatement(sqlStringDuengerschemaID);
            
            statement.setDouble(1, terraVegaMilliliter); statement.setDouble(2, terraFloresMilliliter); 
            statement.setDouble(3, monoTracemixMilliliter); statement.setDouble(4, monoStickstoffMilliliter); 
            statement.setDouble(5, monoPhosphorMilliliter); statement.setDouble(6, monoKaliumMilliliter);
            statement.setDouble(7, monoMagnesiumMilliliter); statement.setDouble(8, monoKalziumMilliliter); 
            statement.setDouble(9, monoEisenMilliliter); statement.setDouble(10, startMilliliter); 
            statement.setDouble(11, flushMilliliter); statement.setDouble(12, acceleratorMilliliter);
            statement.setDouble(13, pkMilliliter); statement.setDouble(14, rhizotonicMilliliter);
            statement.setDouble(15, cannazymMilliliter);  
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
    public int getNahrungID(int wasserID, int duengerschemaID) {
        int nahrungID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            String sqlStringNahrungID = "SELECT pk_nahrung_id FROM nahrung "
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
    public int getNahrungIDLastInsert() {
        int nahrungID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            String sqlStringDuengerID = "SELECT pk_nahrung_id FROM nahrung "
                    + "ORDER BY pk_nahrung_id DESC LIMIT 1";
            statement = connectionObject.prepareStatement(sqlStringDuengerID);

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
    public int getPflanzeID(String sorte) {
        int pflanzeID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            String sqlStringPflanzeID = "SELECT pk_pflanze_id FROM pflanzen "
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
    public int getMediumID(double topfgroesse, String substrat) {
        int mediumID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            String sqlStringMediumID = "SELECT pk_medium_id FROM medien "
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
    public int getPhaseID(String phase) {
        int phaseID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            String sqlStringPhaseID = "SELECT pk_phase_id FROM phasen "
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
    public int getZyklusID(int woche, String phase) {
        int zyklusID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            String sqlStringZyklusID = "SELECT pk_zyklus_id FROM zyklen "
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
    public int getZyklusIDLastInsert() {
        int zyklusID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            String sqlStringDuengerID = "SELECT pk_zyklus_id FROM zyklen "
                    + "ORDER BY pk_zyklus_id DESC LIMIT 1";
            statement = connectionObject.prepareStatement(sqlStringDuengerID);

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
    public int getWasserID(double pHWert, double literProTag) {
        int wasserID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            String sqlStringWasserID = "SELECT pk_wasser_id FROM wasser "
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
    public int getWasserIDLastInsert() {
        int wasserID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            String sqlStringDuengerID = "SELECT pk_wasser_id FROM wasser "
                    + "ORDER BY pk_wasser_id DESC LIMIT 1";
            statement = connectionObject.prepareStatement(sqlStringDuengerID);

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
    public List<String> getPhasen() {
        List<String> phasenListe = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String phase;
        

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            String sqlStringPhasen = "SELECT phase FROM phasen";
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
                resultSet.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return phasenListe;
    }
    public List<String> getSorten() {
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<String> sortenListe = new ArrayList<>();
        String sorte;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            String sqlStringSorten = "SELECT sorte FROM pflanzen";
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
                resultSet.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return sortenListe;
    }
    public List<String> getTopfgroessenMitSubstrat() {
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<String> topfgroessenMitSubstratListe = new ArrayList<>();
        String topfgroesseMitSubstrat;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            String sqlStringTopfgroessenMitSubstrat = "SELECT topfgroesse, substrat FROM medien";
            statement = connectionObject.prepareStatement(sqlStringTopfgroessenMitSubstrat);

            resultSet = statement.executeQuery();
            connectionObject.commit();

            while (resultSet.next()) {
                topfgroesseMitSubstrat = String.valueOf(resultSet.getDouble("topfgroesse"));
                topfgroesseMitSubstrat += "L (";
                topfgroesseMitSubstrat += resultSet.getString("substrat");
                topfgroesseMitSubstrat += ")";
                topfgroessenMitSubstratListe.add(topfgroesseMitSubstrat);
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
                resultSet.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return topfgroessenMitSubstratListe;
    }
    public Map<String, List> getSortenUndTopfgroessenMitSubstrat() {

        PreparedStatement statementSorte = null, statementTopfgroessenMitSubstrat = null;
        ResultSet resultSetSorte = null, resultSetTopfgreossenMitSubstrat = null;
        List<String> topfgroessenMitSubstratListe = new ArrayList<>(), sortenListe = new ArrayList<>();
        Map<String, List> sortenUndTopfgroessenMitSubstratMap = new HashMap<>();
        String sorte, topfgroesseMitSubstrat;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            String sqlStringSorte = "SELECT sorte FROM pflanzen",
                   sqlStringTopfgroessenMitSubstrat = "SELECT topfgroesse, substrat FROM medien";
            statementSorte = connectionObject.prepareStatement(sqlStringSorte);
            statementTopfgroessenMitSubstrat = connectionObject.prepareStatement(sqlStringTopfgroessenMitSubstrat);

            resultSetSorte = statementSorte.executeQuery();
            resultSetTopfgreossenMitSubstrat = statementTopfgroessenMitSubstrat.executeQuery();
            connectionObject.commit();

            while (resultSetTopfgreossenMitSubstrat.next()) {
                topfgroesseMitSubstrat = String.valueOf(resultSetTopfgreossenMitSubstrat.getDouble("topfgroesse"));
                topfgroesseMitSubstrat += "L (";
                topfgroesseMitSubstrat += resultSetTopfgreossenMitSubstrat.getString("substrat");
                topfgroesseMitSubstrat += ")";
                topfgroessenMitSubstratListe.add(topfgroesseMitSubstrat);
            }
            while (resultSetSorte.next()) {
                sorte = resultSetSorte.getString("sorte");
                sortenListe.add(sorte);
            }
            sortenUndTopfgroessenMitSubstratMap.put("sortenListe", sortenListe);
            sortenUndTopfgroessenMitSubstratMap.put("topfgroessenMitSubstratListe", topfgroessenMitSubstratListe);
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
                statementSorte.close();
                statementTopfgroessenMitSubstrat.close();
                resultSetSorte.close();
                resultSetTopfgreossenMitSubstrat.close();
                connectionObject.setAutoCommit(true);
                connectionObject.close();
            } catch (SQLException ex) {
                Logger.getLogger(Datenbankoperationen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return sortenUndTopfgroessenMitSubstratMap;
    }
    public void zyklusInDatenbankAnlegen(int woche, String phase) {
        PreparedStatement statement = null;

        try {
            String sqlStringZyklusInDatenbankAnlegen = "INSERT INTO zyklen"
                    + " (fk_phase_id, woche)"
                    + " SELECT phasen.pk_phase_id, ? FROM phasen WHERE phasen.phase LIKE (?)";

            verbindenZurDB();
            connectionObject.setAutoCommit(false);
            statement = connectionObject.prepareStatement(sqlStringZyklusInDatenbankAnlegen);

            statement.setInt(1, woche);
            statement.setString(2, phase);

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
    public void wasserInDatenbankAnlegen(double pHWert, double literProTag) {
        PreparedStatement statement = null;

        try {
            String sqlStringWasserInDatenbankAnlegen = "INSERT INTO wasser"
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
    public void nahrungInDatenbankAnlegen(int wasserID, int duengerschemaID) {
        PreparedStatement statement = null;

        try {
            String sqlStringNahrungInDatenbankAnlegen = "INSERT INTO nahrung"
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
    public void duengerschemaInDatenbankAnlegen(double terraVegaMilliliter, double terraFloresMilliliter, 
                  double monoTracemixMilliliter, double monoStickstoffMilliliter, double monoPhosphorMilliliter, 
                  double monoKaliumMilliliter, double monoMagnesiumMilliliter, double monoKalziumMilliliter, 
                  double monoEisenMilliliter, double startMilliliter, double flushMilliliter, 
                  double acceleratorMilliliter, double pkMilliliter, double rhizotonicMilliliter, 
                  double cannazymMilliliter, 
                  boolean montag, boolean dienstag, boolean mittwoch, boolean donnerstag, boolean freitag, boolean samstag, boolean sonntag) {
        PreparedStatement statement = null;

        try {
            String sqlStringDuengerschemaInDatenbankAnlegen = "INSERT INTO duengerschema "
                    + "(terra_vega_ml_woche, terra_flores_ml_woche, mono_tracemix_ml_woche, "
                    + "mono_stickstoff_ml_woche, mono_phosphor_ml_woche, mono_kalium_ml_woche, "
                    + "mono_magnesium_ml_woche, mono_kalzium_ml_woche, "
                    + "mono_eisen_ml_woche, start_ml_woche, flush_ml_woche, accelerator_ml_woche, pk_ml_woche, "
                    + "rhizotonic_ml_woche, cannazym_ml_woche, "
                    + "montag, dienstag, mittwoch, donnerstag, freitag, samstag, sonntag) "
                    + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            verbindenZurDB();
            connectionObject.setAutoCommit(false);
            statement = connectionObject.prepareStatement(sqlStringDuengerschemaInDatenbankAnlegen);

            statement.setDouble(1, terraVegaMilliliter); statement.setDouble(2, terraFloresMilliliter); 
            statement.setDouble(3, monoTracemixMilliliter); statement.setDouble(4, monoStickstoffMilliliter); 
            statement.setDouble(5, monoPhosphorMilliliter); statement.setDouble(6, monoKaliumMilliliter);
            statement.setDouble(7, monoMagnesiumMilliliter); statement.setDouble(8, monoKalziumMilliliter); 
            statement.setDouble(9, monoEisenMilliliter); statement.setDouble(10, startMilliliter); 
            statement.setDouble(11, flushMilliliter); statement.setDouble(12, acceleratorMilliliter);
            statement.setDouble(13, pkMilliliter); statement.setDouble(14, rhizotonicMilliliter);
            statement.setDouble(15, cannazymMilliliter); 
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
    //Status wird erstellt
    public void statusInDatenbankAnlegen(Schema schemaObject) {
        PreparedStatement statement = null;
        //Setzen und holen der Variablen die für das Anlegen des Status erforderlich sind
        int pflanzeID = getPflanzeID(schemaObject.getSorte());
        int mediumID = getMediumID(schemaObject.getTopfgroesse(), schemaObject.getSubstrat());
        zyklusInDatenbankAnlegen(schemaObject.getWoche(), schemaObject.getPhase());
        wasserInDatenbankAnlegen(schemaObject.getpHWert(), schemaObject.getLiterProTag());
        duengerschemaInDatenbankAnlegen(schemaObject.getTerraVegaMilliliter(), schemaObject.getTerraFloresMilliliter(), 
                schemaObject.getMonoTracemixMilliliter(), schemaObject.getMonoStickstoffMilliliter(),
                schemaObject.getMonoPhosphorMilliliter(), schemaObject.getMonoKaliumMilliliter(), 
                schemaObject.getMonoMagnesiumMilliliter(), schemaObject.getMonoKalziumMilliliter(),
                schemaObject.getMonoEisenMilliliter(), schemaObject.getStartMilliliter(), 
                schemaObject.getFlushMilliliter(), schemaObject.getAcceleratorMilliliter(), 
                schemaObject.getPkMilliliter(), schemaObject.getRhizotonicMilliliter(), 
                schemaObject.getCannazymMilliliter(), schemaObject.isMontag(), schemaObject.isDienstag(), 
                schemaObject.isMittwoch(), schemaObject.isDonnerstag(), schemaObject.isFreitag(), 
                schemaObject.isSamstag(), schemaObject.isSonntag());
        //int zyklusID = getZyklusID(schemaObject.getWoche(), schemaObject.getPhase());
        int zyklusID = getZyklusIDLastInsert();
        //Ersetzen durch lastInsertID
        //int wasserID = getWasserID(schemaObject.getpHWert(), schemaObject.getLiterProTag());
        int wasserID = getWasserIDLastInsert();
        //Ersetzen durch lastInsertID
        /*int duengerschemaID = getDuengerschemaID(schemaObject.getTerraVegaMilliliter(), schemaObject.getTerraFloresMilliliter(), 
                schemaObject.getMonoTracemixMilliliter(), schemaObject.getMonoStickstoffMilliliter(),
                schemaObject.getMonoPhosphorMilliliter(), schemaObject.getMonoKaliumMilliliter(), 
                schemaObject.getMonoMagnesiumMilliliter(), schemaObject.getMonoKalziumMilliliter(),
                schemaObject.getMonoEisenMilliliter(), schemaObject.getStartMilliliter(), 
                schemaObject.getFlushMilliliter(), schemaObject.getAcceleratorMilliliter(), 
                schemaObject.getPkMilliliter(), schemaObject.getRhizotonicMilliliter(), 
                schemaObject.getCannazymMilliliter(), schemaObject.isMontag(), schemaObject.isDienstag(), 
                schemaObject.isMittwoch(), schemaObject.isDonnerstag(), schemaObject.isFreitag(), 
                schemaObject.isSamstag(), schemaObject.isSonntag());*/
        int duengerschemaID = getDuengerschemaIDLastInsert();
        //Ersetzen durch lastInsertID
        nahrungInDatenbankAnlegen(wasserID, duengerschemaID);
        //Ersetzen durch lastInsertID
        //int nahrungID = getNahrungID(wasserID, duengerschemaID);
        int nahrungID = getNahrungIDLastInsert();
        

        //Status wird in der Datenbank mit den oben geholten Variablen angelegt
        try {
            String sqlStringStatusInDatenbankAnlegen = "INSERT INTO status"
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

    //Die folgenden Methoden werden in der Methode 'umgebungInDatenbankAnlegen()' benötigt
    public int getTemperaturID(double temperaturAmTag, double temperaturInDerNacht) {
        int temperaturID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            String sqlStringTemperaturID = "SELECT pk_temperatur_id FROM temperatur "
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
    public int getTemperaturIDLastInsert() {
        int temperaturID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            String sqlStringDuengerID = "SELECT pk_temperatur_id FROM temperatur "
                    + "ORDER BY pk_temperatur_id DESC LIMIT 1";
            statement = connectionObject.prepareStatement(sqlStringDuengerID);

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
    public int getLuftfeuchtigkeitID(int luftfeuchtigkeitAmTag, int luftfeuchtigkeitInDerNacht) {
        int luftfeuchtigkeitID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            String sqlStringLuftfeuchtigkeitID = "SELECT pk_luftfeuchtigkeit_id FROM luftfeuchtigkeit "
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
    public int getLuftfeuchtigkeitIDLastInsert() {
        int luftfeuchtigkeitID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            String sqlStringDuengerID = "SELECT pk_luftfeuchtigkeit_id FROM luftfeuchtigkeit "
                    + "ORDER BY pk_luftfeuchtigkeit_id DESC LIMIT 1";
            statement = connectionObject.prepareStatement(sqlStringDuengerID);

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
    public int getKlimaID(int temperaturID, int luftfeuchtigkeitID) {
        int klimaID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            String sqlStringKlimaID = "SELECT pk_klima_id FROM klima "
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
    public int getKlimaIDLastInsert() {
        int klimaID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);

            String sqlStringDuengerID = "SELECT pk_klima_id FROM klima "
                    + "ORDER BY pk_klima_id DESC LIMIT 1";
            statement = connectionObject.prepareStatement(sqlStringDuengerID);

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
    public void temperaturInDatenbankAnlegen(double temperaturAmTag, double temperaturInDerNacht) {
        PreparedStatement statement = null;

        try {
            String sqlStringTemperaturInDatenbankAnlegen = "INSERT INTO temperatur"
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
        PreparedStatement statement = null;

        try {
            String sqlStringLuftfeuchtigkeitInDatenbankAnlegen = "INSERT INTO luftfeuchtigkeit"
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
        PreparedStatement statement = null;

        try {
            String sqlStringKlimaInDatenbankAnlegen = "INSERT INTO klima"
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
    //Umgebung wird erstellt
    public void umgebungInDatenbankAnlegen(Schema schemaObject) {
        PreparedStatement statement = null;
        
        double beleuchtungsflaeche = schemaObject.getBeleuchtungsflaeche();
        int leistung = schemaObject.getLeistung();
        
        temperaturInDatenbankAnlegen(schemaObject.getTemperaturAmTag(), schemaObject.getTemperaturInderNacht());
        luftfeuchtigkeitInDatenbankAnlegen(schemaObject.getLuftfeuchtigkeitAmTag(), schemaObject.getLuftfeuchtigkeitInDerNacht());
        //Ersetzen durch lastInsertID
        //int temperaturID = getTemperaturID(schemaObject.getTemperaturAmTag(), schemaObject.getTemperaturInderNacht());
        int temperaturID = getTemperaturIDLastInsert();
        //Ersetzen durch lastInsertID
        //int luftfeuchtigkeitID = getLuftfeuchtigkeitID(schemaObject.getLuftfeuchtigkeitAmTag(), schemaObject.getLuftfeuchtigkeitInDerNacht());
        int luftfeuchtigkeitID = getLuftfeuchtigkeitIDLastInsert();
        
        klimaInDatenbankAnlegen(temperaturID, luftfeuchtigkeitID);
        //Ersetzen durch lastInsertID
        //int klimaID = getKlimaID(temperaturID, luftfeuchtigkeitID);
        int klimaID = getKlimaIDLastInsert();

        try {
            String sqlStringStatusInDatenbankAnlegen = "INSERT INTO umgebungen"
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
    
    
    
    
    //Die folgenden Methoden werden in der Methode 'growInDatenbankAnlegen()' benötigt
    //Getter für pk_bodenfeuchtigkeit_id
    //Getter für pk_makroelemente_id
    //Getter für pk_mikroelemente_id
    //Getter für pk_status_id
    //Getter für pk_umgebung_id
    //Bodenfeuchtigkeit wird erstellt (Setter)

    //Makroelemente werden erstellt (Setter)
    public void makroelementeInDatenbankAnlegen(Makroelemente makroelementeObject) {
        PreparedStatement statement = null;
        int nMangel = makroelementeObject.getNMangel(), 
            pMangel = makroelementeObject.getPMangel(), 
            kMangel = makroelementeObject.getKMangel(), 
            sMangel = makroelementeObject.getSMangel(), 
            caMangel = makroelementeObject.getCaMangel(), 
            mgMangel = makroelementeObject.getMgMangel();

        try {
            String sqlStringMakroelementeInDatenbankAnlegen = "INSERT INTO makroelemente "
                    + "(n_mangel, p_mangel, k_mangel, s_mangel, ca_mangel, mg_mangel) "
                    + "VALUES(?,?,?,?,?,?)";

            verbindenZurDB();
            connectionObject.setAutoCommit(false);
            statement = connectionObject.prepareStatement(sqlStringMakroelementeInDatenbankAnlegen);

            statement.setInt(1, nMangel); statement.setInt(2, pMangel); 
            statement.setInt(3, kMangel); statement.setInt(4, sMangel); 
            statement.setInt(5, caMangel); statement.setInt(6, mgMangel);

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
    //Mikroelemente werden erstellt (Setter)
    public void mikroelementeInDatenbankAnlegen(Mikroelemente mikroelementeObject) {
        PreparedStatement statement = null;
        int borMangel = mikroelementeObject.getBorMangel(),
            eisenMangel = mikroelementeObject.getEisenMangel(),
            kupferMangel = mikroelementeObject.getKupferMangel(),
            manganMangel = mikroelementeObject.getManganMangel(),
            molybdaenMangel = mikroelementeObject.getMolybdaenMangel(),
            chlorMangel = mikroelementeObject.getChlorMangel(),
            selen = mikroelementeObject.getSelenMangel(),
            silizium = mikroelementeObject.getSiliziumMangel(),
            zink = mikroelementeObject.getZinkMangel();
                    
        try {
            String sqlStringMikroelementeInDatenbankAnlegen = "INSERT INTO mikroelemente "
                    + "(bor_mangel, eisen_mangel, kupfer_mangel, mangan_mangel, molybdaen_mangel, chlor_mangel, "
                    + "selen_mangel, silizium_mangel, zink_mangel)"
                    + "VALUES(?,?,?,?,?,?,?,?,?)";

            verbindenZurDB();
            connectionObject.setAutoCommit(false);
            statement = connectionObject.prepareStatement(sqlStringMikroelementeInDatenbankAnlegen);

            statement.setInt(1, borMangel); statement.setInt(2, eisenMangel); 
            statement.setInt(3, kupferMangel); statement.setInt(4, manganMangel); 
            statement.setInt(5, molybdaenMangel); statement.setInt(6, chlorMangel);
            statement.setInt(7, selen); statement.setInt(8, silizium);
            statement.setInt(9, zink);

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
    //Grow wird erstellt
    
    //Die folgenden Methoden werden in der Methode 'ernteInDatenbankAnlegen()' benötigt
    //Getter für pk_energiekosten_id
    //Getter für pk_grow_id
    //Ernte wird erstellt 
}
