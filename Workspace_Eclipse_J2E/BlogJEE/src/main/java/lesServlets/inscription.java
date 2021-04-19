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

@WebServlet("/inscription")
public class inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public inscription() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/session/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Recup données du form
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String mail = request.getParameter("mail");
		String mdp = request.getParameter("pwd");
		
		//Hashing mdp
		String hashpwd = BCrypt.hashpw(mdp, BCrypt.gensalt(10));
		
		//Creation User
		User user = new User(nom, prenom, mail, hashpwd);
		Userdao udao = new Userdao();
		
		//Vérif & Redirection
		if(udao.create(user)) {
			request.setAttribute("message", "Bravo "+ prenom);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}else {
			request.setAttribute("message", "Dommage tu ne peux pas t'inscrire");
		}
	}

}
