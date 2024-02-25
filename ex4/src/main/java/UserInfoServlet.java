import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class UserInfoServlet extends HttpServlet {
   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      response.setContentType("text/html");

      String name = request.getParameter("name");
      int age = Integer.parseInt(request.getParameter("age"));

      PrintWriter out = response.getWriter();
      out.println("<html><head><title>Welcome</title></head><body>");
      out.println("<h1>Welcome, " + name + "!</h1>");
      out.println("<p>Your age is: " + age + "</p>");
      out.println("</body></html>");
   }
}
