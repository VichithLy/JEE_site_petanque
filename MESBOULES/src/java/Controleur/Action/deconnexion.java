/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur.Action;
import javax.servlet.http.HttpServletRequest;
/**
 * Resumé :
 * Recupère la variable de session nom et l'enleve,
 * Afin de faire la déconnexion
 */
 public class deconnexion extends Action {
    public String execute(HttpServletRequest request)
    {
       
    request.getSession().removeAttribute("nom"); // Deconnexion
        return "Accueil.jsp";
    }

 }