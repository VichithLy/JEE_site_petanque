/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import metierLogique.Match;
import oracle.jdbc.pool.OracleDataSource;

/**
 * Résume : 
 * 
 *
 */
public class MatchDAO {
    
    OracleDataSource ds;
    Connection c; 
    ArrayList<Match> listeMatch = new ArrayList<Match>();
    
    public void setDs(OracleDataSource ds) {
        this.ds = ds;
    }

    public void setC(Connection c) {
        this.c = c;
    }
    
    public ArrayList<Match> getMatch() {
        
            try {
                Statement requete;
                requete = c.createStatement();      
                ResultSet resultat = requete.executeQuery("select * from match"); 
                
                while(resultat.next())
                {
                    int id=resultat.getInt(1);
                    String nomMatch=resultat.getString("NOMMATCH");
                    Date heureDebut=resultat.getDate("HORAIRE_DEBUT");
                    Date heureFin=resultat.getDate("HORAIRE_FIN");
                    String equipe1=resultat.getString("ADVERSAIRE_1");
                    String equipe2=resultat.getString("ADVERSAIRE_2");
                    String lieu=resultat.getString("LIEU");
                    String description=resultat.getString("DESCRIPTION");  
                    
                    listeMatch.add(new Match(id, nomMatch, heureDebut, heureFin, equipe1, equipe2, lieu, description));
                }
                               
                if (requete != null) requete.close();
                if (resultat != null) resultat.close();
                if (c != null) c.close(); 

            } catch (SQLException ex) {
                Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    return listeMatch;
    }
}
