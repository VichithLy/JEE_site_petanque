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
    
    public MatchDAO connexionMatch()throws SQLException
    {
        OracleDataSourceDAO ds = OracleDataSourceDAO.getOracleDataSourceDAO();
        Connection c = ds.getConnection();
        MatchDAO match=new MatchDAO();
        match.setDs(ds);
        match.setC(c);
        
        return match;
    }
    
    public ArrayList<Match> verifMatch(){
        
        ArrayList<Match> liste=new ArrayList<Match>();
        MatchDAO m;
        try {           
            m=connexionMatch();
            liste = m.getMatch();
        } catch (SQLException ex) {
            Logger.getLogger(VerifListeMatch.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        return liste;
    }
}
