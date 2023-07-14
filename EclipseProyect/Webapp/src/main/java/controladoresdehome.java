import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import Model.usermodel;
import entity.user;

@WebServlet("/home")
public class controladoresdehome extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    @Resource(name = "jdbc/project")
    private DataSource dataSource;
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle GET request
        String page = request.getParameter("page");
        page = page.toLowerCase();
        
        switch (page) {
            case "clientes":
                List<user> listuser = new usermodel().listuser(dataSource);
                request.setAttribute("listuser", listuser);
                request.getRequestDispatcher("clientes.jsp").forward(request, response);
                break;
            case "sobre":
                request.getRequestDispatcher("sobre.jsp").forward(request, response);
                break;
            default:
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
        }
    }
}
