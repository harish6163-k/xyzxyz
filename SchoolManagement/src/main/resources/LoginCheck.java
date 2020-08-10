import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginCheck() {
        super();
    }

	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("uname");
		String password = request.getParameter("upass");
		RequestDispatcher dispatcher=null;
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		if(username.equals("admin") && password.equals("password")) {
			
			HttpSession session = request.getSession();
			
			session.setMaxInactiveInterval(30*60);
			
			if(session!=null) {
				session.invalidate();
			}
			
			Cookie uname = new Cookie("uname", "username");
			uname.setMaxAge(30*60);
			response.addCookie(uname);
			
			
			response.sendRedirect("Classes.jsp");
			
			
		}else {
			writer.println("<h3 style='color:red'>Invalid Credentials...try again</h3>");
			dispatcher = request.getRequestDispatcher("Adminlogin.jsp");
			dispatcher.include(request, response);
		}
	}


}