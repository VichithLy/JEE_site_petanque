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
            <h1>Hello World!</h1>
            
        <% 
            
            List<Match> lm = (List)request.getAttribute("match");
            out.println(lm.size());
            for(Match f : lm) {
                
        %>   
        
                <%= f.getId()%>
                <%= f.getNomMatch()%>
                <%= f.getDescription()%>
                  
        <% } %>
        
        
        </main>
        
        <footer class="footer">
            <%@include file="footer.jsp"%>
        </footer>
    </body>

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        
</html>
