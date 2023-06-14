package server;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Controller")
public class Controller extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	String page = request.getParameter("page");
    	if(page.equals("login")) {
    		response.sendRedirect(request.getContextPath() + "/login.jsp");
    	}else if(page.equals("singup")){
    		response.sendRedirect(request.getContextPath() + "/SingUp");
    	}

    	

    }
    	
}

