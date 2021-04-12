<%@ include file = "/navbar_footer/Nav.jsp" %>

<p> Texte brut </p>

<%@ include file = "/navbar_footer/Footer.jsp" %>

<!-- Tag de directive -->
<!-- <modulo@ directive attribut = "valeur" %> -->
<%@ include file = "/navbar_footer/Footer.jsp" %>
<!-- Tag de déclaration-->
<%! String test = "Je suis le tag de déclaration"; %>
<%! int nombre = 5; %>
<%! 
	int add(int nb1, int nb2){return nb1 + nb2 ;}
 %>
<!-- Tag d'expression-->
<%= nombre %> <!-- pas de ; à la fin-->
<%= add(5, 12) %>

<!-- Tag de Scriptlet--> <!-- A éviter !!!-->
<%
	for(int index = 0; index < 5; index++){ %>
		<p>Salut index de : <%= index %></p>
	<%}
%>
