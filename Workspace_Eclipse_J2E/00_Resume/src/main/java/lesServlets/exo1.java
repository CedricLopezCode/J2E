package lesServlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.crypto.bcrypt.BCrypt;

import bean.User;
import dao.Userdao;

/**
 * Servlet implementation class exo1
 */
@WebServlet("/exo1")
public class exo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public exo1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("/exo1/Exo1scription.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//Recup données du form
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String mail = request.getParameter("mail");
		String mdp = request.getParameter("pwd");
		
		String hashpwd = BCrypt.hashpw(mdp, BCrypt.gensalt(10));
		
		User user = new User(nom, prenom, mail, hashpwd);
		Userdao udao = new Userdao();
		
		if(udao.create(user)) {
			request.setAttribute("message", "Bravo "+ prenom);
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}else {
			request.setAttribute("message", "Dommage tu ne peux pas te connecter");
		}
		request.getRequestDispatcher("/exo1/Exo1scription.jsp").forward(request, response);
	}

}
