package server;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Controller")
public class Controller extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	String username = request.getParameter("username");
    	String password = request.getParameter("password");
    	String page = request.getParameter("page");
    	if(page.equals("login")) {
    		response.sendRedirect(request.getContextPath() + "/login.jsp"); //buena practica para enviar a otra pagina
    	}else if(page.equals("singup")){
    		getServletContext().getRequestDispatcher("/SingUp.jsp").forward(request, response); // buena practica para enviar desde el mismo programa a otra clase obcjeto
    		
    	}else if(username.equals("angelemilio") && password.equals("gato123")){
    		request.getSession().invalidate();
    		HttpSession newSession = request.getSession(true);
    		newSession.setMaxInactiveInterval(300);
    		response.sendRedirect(request.getContextPath() + "/inicio.jsp");
    	}else{
    		response.sendRedirect(request.getContextPath() + "/NoFound.jsp");
    	}
    	

    }
    	
}

