/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metierLogique;

import DAO.OracleDataSourceDAO;
import DAO.UtilisateurDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LY Vichith
 */
public class VerifListeMatch {
    
    public UtilisateurDAO connexion()throws SQLException
    {
        OracleDataSourceDAO ds = OracleDataSourceDAO.getOracleDataSourceDAO();
        Connection c = ds.getConnection();
        UtilisateurDAO user = new UtilisateurDAO();
        user.setDs(ds);
        user.setC(c);
        return user;
    }
    public boolean verification(Utilisateur u1)
    {
        
       String identifiant = u1.getIdentifiant();
       String password = u1.getPassword();
       UtilisateurDAO user = null;
        try {
            user = connexion();
        } catch (SQLException ex) {
            Logger.getLogger(VerificationCo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       boolean rep = user.getconnexion(identifiant,password);
       
     return rep;
    }
    
    
}
