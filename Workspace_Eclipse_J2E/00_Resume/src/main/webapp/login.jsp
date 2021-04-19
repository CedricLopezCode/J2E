<%@ include file = "/navbar_footer/Nav.jsp" %>

<h3>Formulaire typique: </h3>
		<div class="formulaire_tableau">
			<form method="post" action="<%= request.getContextPath()%>/login">
			
				<label>Email :</label>
				<input type="email" name="mail" required><br>

				<label>Mot de passe :</label>
				<input type="password" name="pwd" required><br>
				
				<input type="submit" name="submit" value="Envoyer">
			</form>
		</div>
<p>
	${aff}
</p>
<%@ include file = "/navbar_footer/Footer.jsp" %>