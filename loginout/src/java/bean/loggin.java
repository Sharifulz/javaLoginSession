package bean;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loggin")
public class loggin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String usern = request.getParameter("user");
        String passw = request.getParameter("pass");

        if (usern.equals("admin") && passw.equals("admin")) {
            HttpSession session = request.getSession();
            session.setAttribute("username", usern);
            response.sendRedirect("welcome.jsp");
        } else {
            response.sendRedirect("login.jsp");
        }
    }

}
