<%@ include file = "/a_jamais/head.jsp" %>

<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	 <div class="container-fluid">
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
	<li class="nav-item dropdown">
	  <a class="nav-link dropdown-toggle" href="<%= request.getContextPath()+"/Test" %>" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
	    Déroulant
	  </a>
	  <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
	    <li><a class="dropdown-item" href="#">Action</a></li>
	    <li><a class="dropdown-item" href="#">Autre Action</a></li>
	    <li><hr class="dropdown-divider"></li>
	    <li><a class="dropdown-item" href="#">Encore Autre Chose</a></li>
	  </ul>
	</li>
	<li class="nav-item">
	  <a class="nav-link disabled" href="<%= request.getContextPath()+"/Test" %>" tabindex="-1" aria-disabled="true">Désactivé</a>
	  </li>
	</ul>
	<ul>
		<li>
			<c:if test="${empty utilisateur}">
	<a class="btn btn-success" href="<%= request.getContextPath()+"/login" %>" role="button">Se Connecter</a>
	</c:if>
	<c:if test="${not empty utilisateur}">
	<span id="utilnom">${utilisateur}</span>  <a class="btn btn-danger" href="<%= request.getContextPath()+"/logout" %>" role="button">Se Déconnecter</a>
	</c:if>
	      	</li>
	      </ul>
	      <form class="d-flex">
	        <input class="form-control me-2" type="search" placeholder="Chercher" aria-label="Search">
	        <button class="btn btn-outline-success" type="submit">Chercher</button>
	      </form>
	    </div>
	  </div>
</nav>


