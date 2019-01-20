<%-- 
    Document   : erreurMdp
    Created on : 20 janv. 2019, 13:43:56
    Author     : LY Vichith
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
            
            <!-- Message d'erreur -->
            <div class="alert alert-secondary" role="alert">
                <h1>Identifiant ou mot de passe incorrect !</h1>
                <a href="Connexion.jsp" class="btn btn-link">Veuillez les ressaisir ici.</a>
            </div>        
                
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
