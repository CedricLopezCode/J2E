<%@ include file = "/a_jamais/nav.jsp" %>

<h1>Liste Article</h1>
<table>
			<tr>
				<th>id</th>
				<th>Titre</th>
				<th>Résumé</th>
				<th>created_at</th>
				<th>auteur</th>
				<th></th>
			</tr>
			<tr>
				<td>id</td>
				<td>Titre</td>
				<td>Résumé</td>
				<td>date</td>
				<td>auteur</td>
			</tr>


<c:out value="${quinexistepas}" default="Ternaire v1"></c:out> 
<c:out value="${x}">Ternaire v2</c:out> 

<c:forEach items="${liste_article}" var="element">
	<c:out value="${liste_article['nom']}"></c:out>
</c:forEach>
</table>

<%@ include file = "/a_jamais/footer.jsp" %>
