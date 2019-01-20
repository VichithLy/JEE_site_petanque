package Controleur.Action;

import DAO.MatchDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import metierLogique.Match;
import metierLogique.VerifListeMatch;

public class actionMatch extends Action{
    
    @Override
    public String execute(HttpServletRequest request)
    {
        VerifListeMatch vlm = new VerifListeMatch();
        
        request.setAttribute("match", vlm.verifMatch());
        
        return "Planning.jsp";
    }
    
}
