/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import Controleur.Action.Action;
import Controleur.Action.actionConnexion;
import Controleur.Action.actionMatch;
import Controleur.Action.deconnexion;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author p1619278
 */
@WebServlet(name = "Controleur", urlPatterns = {"/Controleur"})
public class Controleur extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String todo = request.getParameter("todo");
        RequestDispatcher rd =null;
        Action ac = null;
        String vue="";
        switch(todo){
            
            case "Connexion" :
                ac = new actionConnexion();
                vue = ac.execute(request);
                rd = request.getRequestDispatcher(vue);
                break;
                
            case "Login":
                vue= "Connexion.jsp";
                rd = request.getRequestDispatcher(vue);
                break;
                
            case "Accueil" :
                vue = "Accueil.jsp";
                rd = request.getRequestDispatcher(vue); 
                break;
                
            case "Planning":
                ac = new actionMatch();
                vue= ac.execute(request);
                rd=request.getRequestDispatcher(vue);
                break;
                
            case "A_propos":
                vue="A_propos.jsp";
                rd = request.getRequestDispatcher(vue);
                break;
                
            case "Actu":
                vue="Actualite.jsp";
                rd = request.getRequestDispatcher(vue);
                break;
            case "Deco":
                ac= new deconnexion();
                vue=ac.execute(request);
                rd = request.getRequestDispatcher(vue);
                
            default :
                rd = request.getRequestDispatcher(vue);
                
                
        }
        rd.forward(request, response);
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
