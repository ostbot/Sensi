package de.ostbot.sensi.control;

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
    
    public void pflanzeMitTopfInDatenbankAnlegen(SorteMitTopf pflanzeObject) {

        String sqlStringPflanze;
        String sqlStringTopf;
        PreparedStatement statementPflanze = null;
        PreparedStatement statementTopf = null;
        
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
    
    public List<String> getTopfgroessen() {
        
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
    
    public List<String> getDuenger() {
        
        String sqlStringDuenger, duenger;
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