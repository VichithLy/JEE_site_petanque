<%-- 
    Document   : header
    Created on : 14 janv. 2019, 11:50:47
    Author     : p1619278
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- Fixed navbar -->

  <nav class="navbar navbar-expand-md navbar-light ">
	<a class="navbar-brand" href="#">
            <img src="resources/images/boulepetanque3.png" class="logo" alt="logo">
        </a>
            
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarCollapse">
            <ul class="navbar-nav m-auto">
                    <li class="nav-item active">
                      <a class="nav-link" href="Controleur?todo=Accueil">Accueil<span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="Controleur?todo=Actu">Actualités</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="Controleur?todo=Planning">Planning des matchs</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="Controleur?todo=A_propos">À propos</a>
                    </li>
            </ul>
            
            <ul class="navbar-nav ml-auto">
                  <li class="nav-item">
                    <a class="nav-link" href="Controleur?todo=Login">Connexion</a>
                  </li>
            </ul>
	  
	</div>
  </nav>
