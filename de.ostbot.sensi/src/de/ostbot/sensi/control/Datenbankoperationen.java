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
    
    //Pflanze und Topf werden aus der Combobox gezogen (die Werte wurden in einem anderen Frame definiert)
    //und werden dann übergeben an die unten folgende Funktion
    public void pflanzeMitTopfInDatenbankAnlegen(SorteMitTopf pflanzeObject) {

        String sqlStringPflanze = "", sqlStringTopf ="";
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
    //Zyklus wird aus Woche und Phase angelegt
    //Im DB-Modell erwartet er keine 'String phase' sondern dessen ID
    //in der Methode wird aber die Methode 'getPhaseID' aufgerufen
    //welche den 'String phase' entgegen nimmt und die passende phaseID zurück gibt
    public void zyklusInDatenbankAnlegen(int woche, String phase) {
        String sqlStringZyklusInDatenbankAnlegen = "";
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
                System.out.println("phaseID in 'zyklusInDatenbankAnlegen()'");
            statement.setInt(2, woche);
                System.out.println("woche in 'zyklusInDatenbankAnlegen()'");
                
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
    public void duengerschemaInDatenbankAnlegen(String duenger, double milliliter, boolean montag, boolean dienstag, boolean mittwoch, boolean donnerstag, boolean freitag, boolean samstag, boolean sonntag) {
        String sqlStringDuengerschemaInDatenbankAnlegen = "";
        PreparedStatement statement = null;
        int duengerID = getDuengerID(duenger);
       
        try {
            sqlStringDuengerschemaInDatenbankAnlegen = "INSERT INTO duengerschema"
                                          + " (fk_duenger_id, milliliter, montag, dienstag, mittwoch, donnerstag, freitag, samstag, sonntag)"
                                          + " VALUES(?,?,?,?,?,?,?,?,?)";
            
            verbindenZurDB();
            connectionObject.setAutoCommit(false);
            statement = connectionObject.prepareStatement(sqlStringDuengerschemaInDatenbankAnlegen);
            
            statement.setInt(1, duengerID);
            statement.setDouble(2, milliliter);
            statement.setBoolean(3, montag);
            statement.setBoolean(4, dienstag);
            statement.setBoolean(5, mittwoch);
            statement.setBoolean(6, donnerstag);
            statement.setBoolean(7, freitag);
            statement.setBoolean(8, samstag);
            statement.setBoolean(9, sonntag);
                
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
        String sqlStringWasserInDatenbankAnlegen = "";
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
        String sqlStringNahrungInDatenbankAnlegen = "";
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
    //Umgebung für Grow anlegen da T.Grow die ID von der T.Umgebung erwartet
    public void umgebungInDatenbankAnlegen(Schema schemaObject) {
        
    }
    //Status für Grow anlegen da T.Grow die ID von der T.Status erwartet
    public void statusInDatenbankAnlegen(Schema schemaObject) {
        String sqlStringStatusInDatenbankAnlegen = "";
        PreparedStatement statement = null;
        //ID stammt aus dem 'schemaObject' und dessen Daten stammen aus dem jPanel
            //Wird für die SQLQuery benötigt
            int pflanzeID = getPflanzeID(schemaObject.getSorte());
            //ID stammt aus dem 'schemaObject' und dessen Daten stammen aus dem jPanel
            //Wird für die SQLQuery benötigt
            int mediumID = getMediumID(schemaObject.getTopfgroesse(), schemaObject.getSubstrat());
            //Bevor die zyklusID in der T.Status gesetzt werden kann muss sie erst erzeugt,
            //weil sie vorher nicht gesetzt wird, sondern in dem Ausführen des Button 'Speichern'
            zyklusInDatenbankAnlegen(schemaObject.getWoche(), schemaObject.getPhase());
                //Nachdem anlegen wird die zyklusID sofort in die Variable geschrieben
                //Wird für die SQLQuery benötigt
                int zyklusID = getZyklusID(schemaObject.getWoche(), schemaObject.getPhase());
            //Bevor die nahrungID gesetzt werden kann muss ich mir die wasserID und die DuengerschemaID holen
            //Auch die nahrungID wird für die unten folgende SQLQuery benötigt
            wasserInDatenbankAnlegen(schemaObject.getpHWert(), schemaObject.getLiterProTag());
                //Wird benötigt für die nahrungID
                int wasserID = getWasserID(schemaObject.getpHWert(), schemaObject.getLiterProTag());
            duengerschemaInDatenbankAnlegen(schemaObject.getDuenger(), schemaObject.getMilliliter(), schemaObject.isMontag(), schemaObject.isDienstag(), schemaObject.isMittwoch(), schemaObject.isDonnerstag(), schemaObject.isFreitag(), schemaObject.isSamstag(), schemaObject.isSonntag());
                //Wird benötigt für die nahrungID
                int duengerschemaID = getDuengerschemaID(schemaObject.getDuenger(), schemaObject.getMilliliter(), schemaObject.isMontag(), schemaObject.isDienstag(), schemaObject.isMittwoch(), schemaObject.isDonnerstag(), schemaObject.isFreitag(), schemaObject.isSamstag(), schemaObject.isSonntag());
            nahrungInDatenbankAnlegen(wasserID, duengerschemaID);
                 int nahrungID = getNahrungID(wasserID, duengerschemaID);
        
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
    
    //Getter für pk_medium_id
    public int getMediumID(double topfgroesse, String substrat) {
        String sqlStringMediumID = "";
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
        String sqlStringPhaseID = "";
        int phaseID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);
            
            sqlStringPhaseID= "SELECT pk_phase_id FROM phasen "
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
        String sqlStringZyklusID = "";
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
        String sqlStringWasserID = "";
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
        String sqlStringDuengerID = "";
        int duengerID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);
            
            sqlStringDuengerID= "SELECT pk_duenger_id FROM duenger "
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
    public int getDuengerschemaID(String duenger, double milliliter, boolean montag, boolean dienstag, boolean mittwoch, boolean donnerstag, boolean freitag, boolean samstag, boolean sonntag) {
        String sqlStringDuengerschemaID = "";
        int duengerschemaID = 0;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);
            
            sqlStringDuengerschemaID = "SELECT pk_duengerschema_id FROM duengerschema "
                                + "WHERE fk_duenger_id LIKE (?) AND milliliter LIKE (?) AND montag LIKE (?) AND dienstag LIKE (?)"
                                + " AND mittwoch LIKE (?) AND donnerstag LIKE (?) AND freitag LIKE (?)"
                                + " AND samstag LIKE (?) AND sonntag LIKE (?)";
            statement = connectionObject.prepareStatement(sqlStringDuengerschemaID);
            statement.setInt(1, getDuengerID(duenger));
            verbindenZurDB();
            connectionObject.setAutoCommit(false);
            statement.setDouble(2, milliliter);
            statement.setBoolean(3, montag);
            statement.setBoolean(4, dienstag);
            statement.setBoolean(5, mittwoch);
            statement.setBoolean(6, donnerstag);
            statement.setBoolean(7, freitag);
            statement.setBoolean(8, samstag);
            statement.setBoolean(9, sonntag);          
            
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
        String sqlStringNahrungID = "";
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
        String sqlStringPflanzeID = "";
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
    //Getter für fk_grow_id
    //Getter für fk_klima_id
    //Getter für fk_luftfeuchtigkeit_id
    //Getter für fk_makroelemente_id
    //Getter für fk_mikroelemente_id
    //Getter für fk_status_id
    //Getter für fk_temperatur_id
    //Getter für fk_umgebung_id
    
    //Anzeiger für ComboBox
    public List<String> getHerkunftslaender() {
        
        String sqlStringLaender = "", land = "";
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
            
            while(resultSet.next()) {
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
        
        String sqlStringSubstrate = "", substrat = "";
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
            
            while(resultSet.next()) {
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
        
        String sqlStringSorten = "", sorte = "";
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
            
            while(resultSet.next()) {
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
        
        String sqlStringTopfgroessenMitSubstrat = "", topfgroesseMitSubstrat = "";
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
            
            while(resultSet.next()) {
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
        
        String sqlStringPhasen = "", phase = "";
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
            
            while(resultSet.next()) {
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
    //Anzeiger für ComboBox
    public List<String> getDuenger() {
        
        String sqlStringDuenger = "", duenger = "";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List duengerListe = new ArrayList();
        
        try {
            verbindenZurDB();
            connectionObject.setAutoCommit(false);
            
            sqlStringDuenger = "SELECT duenger FROM duenger";
            statement = connectionObject.prepareStatement(sqlStringDuenger);
            
            resultSet = statement.executeQuery();
            connectionObject.commit();
            
            while(resultSet.next()) {
                duenger = resultSet.getString("duenger");
                duengerListe.add(duenger);
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
        return duengerListe;
    }
}