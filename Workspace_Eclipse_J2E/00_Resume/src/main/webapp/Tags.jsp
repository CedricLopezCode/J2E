<!-- Tag de directive -->

<!-- <modulo@ directive attribut = "valeur" %> -->
<%@ include file = "/navbar_footer/Footer.jsp" %>



<!-- Tag de d�claration-->

<%! String test = "Je suis le tag de d�claration"; %>
<%! int nombre = 5; %>
<%! 
	int add(int nb1, int nb2){return nb1 + nb2 ;}
 %>
 
 
 
<!-- Tag d'expression-->

<%= nombre %> <!-- pas de ; � la fin-->
<%= add(5, 12) %>


<!-- Expressions language-->

${2+2}
${"test"}


<!-- --><!-- A �viter-->

<% for(int i = 0; i < 5; i++){%>
		<p> 
			Salut, tour de boucle :  <%= i %> 
		</p>
	<%}%>

