/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataSource;
import java.sql.Connection;
import javax.activation.DataSource;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author p1700906
 */
public class UtilisateurDAO {
    
    OracleDataSource ds;
    Connection c;
    
    public void setDs(OracleDataSource ds) {
        this.ds = ds;
    }

    public void setC(Connection c) {
        this.c = c;
    }
    
    public boolean getconnexion(String login, String mdp) {
        
        boolean correct= true;
        
           
            try {
                Statement requete;
                requete = c.createStatement();      
                ResultSet resultat = requete.executeQuery("select count(*) from user_account where identifiant ='"+login+"' and password = '"+mdp+"'"); 
                resultat.next();
                if(resultat.getInt(1)== 1)
                {
                    correct = true;
                }
                else
                {
                     correct = false;
                }
                if (requete != null) requete.close();
                if (resultat != null) resultat.close();
                if (c != null) c.close(); 

            } catch (SQLException ex) {
                Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
    return correct;
    }

    public void setDataSource(OracleDataSource dataSource) {
       
     this.ds = dataSource;
        
        
    }

    public void setConnection(Connection co) {
        
     this.c = co;
        
    }
}