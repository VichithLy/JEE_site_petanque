<%-- 
    Document   : Connexion
    Created on : 14 janv. 2019, 11:20:25
    Author     : p1700906
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   <%--  <%@ include file="header_co.jsp"%>--%>
    <body>
         <form method ="post" action="Controleur">
              <input type="hidden" name ="todo" value="Connexion"/>
            <input type="text" name="identifiant" placeholder="identifiant"/>
            <br/>
            <input type="password" name ="mdp" placeholder="mot de passe" />
            <br/>
            <input type ="submit" value ="Connexion"/>
       
        </form>
    </body>
  <%-- <%@ include file="footer.jsp"%>--%>
</html>
