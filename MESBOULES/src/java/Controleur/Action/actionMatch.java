package Controleur.Action;

import DAO.MatchDAO;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import metierLogique.Match;

public class actionMatch extends Action{
    
    @Override
    public String execute(HttpServletRequest request)
    {
        MatchDAO m=new MatchDAO();
        ArrayList<Match> lm = m.getMatch();
        
        for(Match temp : lm) 
        {
            request.setAttribute("id", temp.getId());
            request.setAttribute("heureDebut", temp.getHeureDebut());
            request.setAttribute("heureFin", temp.getHeureFin());
            request.setAttribute("description", temp.getDescription());
            request.setAttribute("lieu", temp.getLieu());
            request.setAttribute("equipe1", temp.getEquipe1());
            request.setAttribute("equipe2", temp.getEquipe2());
        }
    
        return "Planning.jsp";
    }
    
}
