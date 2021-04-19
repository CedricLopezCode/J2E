<%@ include file = "/navbar_footer/Nav.jsp" %>

<h3>Formulaire typique: </h3>
		<div class="formulaire_tableau">
			<form method="post" action="<%= request.getContextPath()%>/Form">
				<label>Nom :</label>
				<input type="text" name="nom" required> <br>	

				<label>Prénom :</label>
				<input type="text" name="prenom" required><br>

				<label>Téléphone :</label>
				<input type="tel" name="tel" required><br>

				<label>Email :</label>
				<input type="email" name="mail" required><br>

				<label>Votre question: </label>
				<textarea name="message" rows="10" cols="100" required ></textarea><br>

				<input type="submit" name="submit" value="Envoyer">
			</form>
		</div>
<p>
	${aff}
</p>
<%@ include file = "/navbar_footer/Footer.jsp" %>