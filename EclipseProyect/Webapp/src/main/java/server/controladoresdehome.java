package server;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/home")
public class controladoresdehome extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle GET request
        String page = request.getParameter("page");
        page = page.toLowerCase();
        switch(page) {
        case "Clientes":
        	request.getRequestDispatcher("clientes.jsp").forward(request, response);
        	break;
        case "Sobre":
        	request.getRequestDispatcher("sobre.jsp").forward(request, response);
        	default:
        		request.getRequestDispatcher("index.jsp").forward(request, response);
        }
}
}