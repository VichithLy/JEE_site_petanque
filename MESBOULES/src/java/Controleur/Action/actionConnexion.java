/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur.Action;

import metierLogique.Utilisateur;
import metierLogique.VerificationCo;
import javax.servlet.http.HttpServletRequest;
/**
 *
 * @author p1700906
 */
public class actionConnexion extends Action {
    @Override
    public String execute(HttpServletRequest request)
    {
       String identifiant = request.getParameter("identifiant");
       String password = request.getParameter("mdp");
       Utilisateur u1 = new Utilisateur(identifiant,password);
       VerificationCo v1 = new VerificationCo();
       
      if(v1.verification(u1) == true)
      {
          request.getSession().setAttribute("nom",identifiant);
          return "Accueil.jsp";
      }
       else
      { 
        return "erreurMdp.jsp";
      }
    }
  
}
