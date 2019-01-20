<%-- 
    Document   : Actualite
    Created on : 20 janv. 2019, 16:35:21
    Author     : Sorrenti.J
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="config.jsp"%>
        <%@include file="config.jsp"%>  
        
        <title>Actualité</title>
        
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
                <h1>Actualités</h1>
            </div>
            
            <br>
            
            <table class="table table-hover">
                
            <thead>
                <tr>
                  <th id=date scope="col">Lundi 21 janvier 2019</th>

                </tr>
            </thead>
            <tbody>
                <tr>
                    <th scope="row">
                        <p>Le site MesBoules.com est devenu aujourd'hui le premier site visité de France. </p>
                        <p>Selon M.Boule, le fondateur, la surprise est grande mais surtout logique car la pétanque fédère le peuple.</p>
                </th>
                
                </tr>
                <tr>

                </tr>
                <tr>

                </tr>
            </tbody>
          </table>
            
            
            
            
            
            
        </main>
     
    <footer class="footer">
            <%@include file="footer.jsp"%>
    </footer>
        
        <!-- JavaScript mis à la fin pour charger la page plus vite -->
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        
    </body>
</html>
