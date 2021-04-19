		
		<!--	Inclusion	-->
		
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>

						<!--	A  Modifier		-->
						
		<!--	Titre	-->
		
		
<title>Exo Article J2E</title>


		<!--	Meta	-->
		
		
<meta charset="UTF-8">



		<!--	Liens CSS, BootStrap,etc... 	-->
		
		
		
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<link href="<%= request.getContextPath()+"/css/style.css" %>" rel="stylesheet">




<!-- Début -->
</head>

<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<div class="container-fluid">
	<!-- Liens -->
		<a class="navbar-brand" href="<%= request.getContextPath()+"/Home" %>">Acceuil</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item">
					<a class="nav-link active" aria-current="page" href="#">Home</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="<%= request.getContextPath()+"/About" %>">A Propos</a>
				</li>
				 <li class="nav-item">
					<a class="nav-link" href="<%= request.getContextPath()+"/Form" %>">Formulaire</a>
				</li>
			</ul>
			<!-- Session -->
			<ul>
				<li>
					<c:if test="${empty utilisateur}">
						<a class="btn btn-success" href="<%= request.getContextPath()+"/inscription" %>" role="button">Se Connecter</a>
					</c:if>
					<c:if test="${not empty utilisateur}">
						<span id="utilnom">${utilisateur}</span>  <a class="btn btn-danger" href="<%= request.getContextPath()+"/logout" %>" role="button">Se Déconnecter</a>
					</c:if>
				</li>
			</ul>
		</div>
	</div>
</nav>


