<%@ include file = "/a_jamais/nav.jsp" %>

<div class="container" id="form_inscrip">
	<h1>Inscription: </h1>
	<form class="formulaire_tableau" method="post" action="<%= request.getContextPath()%>/blog">
		
			<label>Nom :</label>
			<input type="text" name="nom" required>	
		
			<label>Prénom :</label>
			<input type="text" name="prenom" required>
		
			<label>Email :</label>
			<input type="email" name="mail" required>
		
			<label>Mot de Passe :</label>
			<input type="password" name="pwd" required>
		
			<a class="btn btn-primary" href="<%= request.getContextPath()+"/login" %>" role="button">S'inscrire</a>
		
	</form>
</div>

<div class="container" id="form_connex">
	<h1>Connexion: </h1>
	<form class="formulaire_tableau" method="post" action="<%= request.getContextPath()%>/login">
		
			<label>Email :</label>
			<input type="email" name="mail" required>
		
			<label>Mot de Passe :</label>
			<input type="password" name="pwd" required>
		
			<a class="btn btn-primary" href="<%= request.getContextPath()+"/login" %>" role="button">Se Connecter</a>
	</form>
</div>

<p class="alert alert-primary" role="alert">
	  ${message}
</p>
<p>
	${aff}
</p>

<%@ include file = "/a_jamais/footer.jsp" %>