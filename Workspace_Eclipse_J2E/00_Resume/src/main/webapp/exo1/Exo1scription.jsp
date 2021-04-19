<%@ include file = "/navbar_footer/Nav.jsp" %>

<h3>Formulaire exo1: </h3>
		<div class="formulaire_tableau">
			<form method="post" action="<%= request.getContextPath()%>/exo1">
				<label>Nom :</label>
				<input type="text" name="nom" required> <br>	

				<label>Prénom :</label>
				<input type="text" name="prenom" required><br>

				<label>Email :</label>
				<input type="email" name="mail" required><br>

				<label>Mot de Passe :</label>
				<input type="password" name="pwd" required><br>

				<input type="submit" name="submit" value="Envoyer">
			</form>
		</div>
<div class="alert alert-primary" role="alert">
  ${message}
</div>
<%@ include file = "/navbar_footer/Footer.jsp" %>