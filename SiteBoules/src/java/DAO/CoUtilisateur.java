/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
 
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import metierLogique.*;  
/**
 *
 * @author Sorrenti.J
 */
public class CoUtilisateur {
    public static final String NOM_CONNEXION = "ATTRIBUT_CONNEXION";
    
      // Sock Connection dans l'attribut de la demande.
     public static void storeConnexion(ServletRequest request, Connection co) {
        request.setAttribute(NOM_CONNEXION, co);
    }
     
     //L'objet de connexion a été enregistré dans l'attribut de la demande.
     public static Connection getStoredConnexion(ServletRequest request) {
        Connection co = (Connection) request.getAttribute(NOM_CONNEXION);
        return co;
    }
         // Conservez les informations de l'utilisateur en Session.
         public static void storeLoginedUser(HttpSession session, Utilisateur loginedUser) {
        // Sur JSP l'utilisateur peut accéder via ${loginedUser}
        session.setAttribute("loginedUser", loginedUser);
    }
        // Obtenez les informations de l'utilisateur stockées dans la Session.
        public static Utilisateur getLoginedUser(HttpSession session) {
        Utilisateur loginedUser = (Utilisateur) session.getAttribute("loginedUser");
        return loginedUser;
    }
    
}
