<%@ include file = "/a_jamais/nav.jsp" %>
<c:import url="/a_jamais/nav.jsp"></c:import>


<h3>
	<c:out value="test jstl"></c:out> 
</h3>

<c:set var = "x" value="${2}"/>
<c:out value="${x}"></c:out> 

<c:if test="${x < 5}">
	le x est inférieur à 5 
</c:if>

<c:out value="${quinexistepas}" default="Ternaire v1"></c:out> 
<c:out value="${x}">Ternaire v2</c:out> 

<c:forEach items="${tableauNom}" var="element">
	<c:out value="${tableauNom['nom']}"></c:out>
</c:forEach>

<c:url value="/Home" var="nomLien"></c:url>
<a href="${nomLien}">Cliquez-Ici</a>
<c:import url="/a_jamais/footer.jsp"></c:import>