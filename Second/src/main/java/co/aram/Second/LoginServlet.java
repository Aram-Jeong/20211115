package co.aram.Second;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		String id =request.getParameter("id");
		String password = request.getParameter("password");
		String message = null;
		if(id.equals("hong") && password.equals("1234")) {
			message = "홍길동님 환영합니다";
		}else {
			message = "아이디 또는 패스워드가 틀렸습니다.";
		}
		response.sendRedirect("loginResult.jsp?msg="+message);
	}

}
