package lesServlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Form")
public class form extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public form() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: about").append(request.getContextPath());
		request.getRequestDispatcher("/form.jsp").forward(request, response);
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Recup données du form
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String mail = request.getParameter("mail");
		String tel = request.getParameter("tel");
		String message = request.getParameter("message");
		
		if(prenom.equals("cedric")) {
			request.setAttribute("aff", "Bravo "+ prenom);
		}else {
			request.setAttribute("aff", "Dommage tu ne peux pas te connecter");
		}
		request.getRequestDispatcher("/form.jsp").forward(request, response);
	}

}
