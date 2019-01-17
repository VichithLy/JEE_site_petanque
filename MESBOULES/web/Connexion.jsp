<%-- 
    Document   : Connexion
    Created on : 14 janv. 2019, 11:20:25
    Author     : p1700906
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="fr">
    <head>
        <%@include file="config.jsp"%>
        <title>Connexion</title>
        
        <!-- Custom styles for this template -->
        <link href="resources/css/headfoot.css" rel="stylesheet">
    </head>
    
   <%--  <%@ include file="header_co.jsp"%>--%>
    <body>
        <%@include file="header.jsp"%>
        
        <!-- Begin page content -->
        <main role="main" class="container">
            
            <!-- Formulaire de connexion -->
            <form method ="post" action="Controleur">
                
                <div class="form-group"> 
                    
                    <input type="hidden" name ="todo" value="Connexion"/>
                    
                    <div class="form-group">
                        <label for="email">Identifiant :</label>
                        <input type="text" class="form-control" name="identifiant"/>
                    </div>
                    
                    <div class="form-group">
                        <label for="pwd">Mot de passe :</label>
                        <input type="password" class="form-control" name ="mdp"/>
                    </div>
                    
                    <input type ="submit" class="btn btn-dark" value ="Connexion"/>
                
                </div>
             </form>
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
