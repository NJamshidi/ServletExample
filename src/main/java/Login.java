import service.UserService;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Login extends HttpServlet {

        UserService userService=new UserService();

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String name=request.getParameter("name");
            String family=request.getParameter("family");
            String age=request.getParameter("age");


            userService.saveUser(name,family,age);
            out.println("<br>Your Information has been inserted");


        }
    }