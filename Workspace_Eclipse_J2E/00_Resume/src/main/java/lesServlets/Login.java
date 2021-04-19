package lesServlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Userdao;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String email_saisi = request.getParameter("mail");
		String pwd_saisi = request.getParameter("pwd");
		
		Userdao usDao = new Userdao();
		
		if(usDao.login(email_saisi, pwd_saisi) != null) {
			String prenom = usDao.login(email_saisi, pwd_saisi).getPrenom();
			
			HttpSession session = request.getSession();
			session.setAttribute("utilisateur", prenom);
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("/form.jsp").forward(request, response);
		}
		
	}

}
