/*
package metierLogique;




import DAO.MatchDAO;
import DAO.OracleDataSourceDAO;
import DAO.UtilisateurDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class VerifListeMatch {
    
    public boolean getVerifMatch(ArrayList<Match> listeMatch) throws SQLException
    {
        if(listeMatch!=null)
        {
            return true; 
        }
        return false;
    }
    
    public boolean verificationMatch()
    {
        boolean res;
        ArrayList<Match> md=new ArrayList<Match>();
        md.getMatch();
        
        try {
            res = getVerifMatch(md);
        } catch (SQLException ex) {
            Logger.getLogger(VerificationCo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       boolean rep = user.getconnexion(identifiant,password);
       
     return rep;
    }
    
    
}
*/