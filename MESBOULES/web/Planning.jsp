<%-- 
    Document   : Planning
    Created on : 14 janv. 2019, 11:20:42
    Author     : p1700906
--%>

<%@page import="java.util.List"%>
<%@page import="DAO.MatchDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="metierLogique.Match"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="config.jsp"%>
        <title>MesBoules</title>
        
        <!-- Custom styles for this template -->
        <link href="resources/css/headfoot.css" rel="stylesheet">
        
    </head>
    
    <body>
        
        <% String header;
        if(  session.getAttribute("nom") != null )
        {
            header = "header_co.jsp";
        }
        else 
        {
            header="header.jsp";
        }
        %> 
        
        <jsp:include page="<%=header%>"/>
 
        
        <main role="main" class="container">
            
            <div class="h1">
                <h1>Planning des matchs</h1>
                <br>
            </div>
            
            <div class="h3">
                <p><small>Veuillez contacter notre administrateur Jean-Roger afin de planifier un match :</small></p>
                <p><small>Son adresse MSN : <strong>DiddlDora@hotmail.fr</strong></small></p>
                <br>
                <br>
            </div>
        
            <table class="table table-hover table-fixed">
                <thead>
                    <tr>
                      <th>Intitulé du match</th>
                      <th>Horaire de début</th>
                      <th>Horaire de fin</th>
                      <th>Lieu</th>
                      <th>Equipe 1</th>
                      <th>Equipe 2</th>
                      <th>Description</th>  
                    </tr>
                    
                    <% 
                        List<Match> lm = (List)request.getAttribute("match");
                        for(Match f : lm) {
                    %>   

                </thead>
                
                <tbody> 
                    <tr> 
                        <td><%= f.getNomMatch()%></td>
                        <td><%= f.getHeureDebut()%></td>
                        <td><%= f.getHeureFin()%></td>
                        <td><%= f.getEquipe1()%></td>
                        <td><%= f.getLieu()%></td>
                        <td><%= f.getDescription()%></td>
                        <td><%= f.getEquipe2()%></td>
                        
                        

                        <% } %>
                    </tr>
                
                </tbody>
            </table>
                
        </main>
        
        <footer class="footer">
            <%@include file="footer.jsp"%>
        </footer>
    </body>

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        
</html>

