<%-- 
    Document   : Actualite
    Created on : 20 janv. 2019, 16:35:21
    Author     : Sorrenti.J
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
        </main>
    </body>
</html>
