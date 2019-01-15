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

/**
 *
 * @author p1700906
 */
public class UtilisateurDAO {
        DataSource ds;
    Connection c;
    
    public void setDs(DataSource ds) {
        this.ds = ds;
    }

    public void setC(Connection c) {
        this.c = c;
    }
    
    public boolean getconnexion (String login, String mdp) {
        
        boolean correct= false;
        
           
            try {
                Statement requete;
                requete = c.createStatement();
                ResultSet resultat = requete.executeQuery("Select count(*) from User_Account where identifiant ="+login+" and password = "+mdp);
                if(resultat.getInt(1)== 1)
                {
                    correct = true;
                }
                    correct = false;
                    
            } catch (SQLException ex) {
                Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           return correct;
               
    }

}