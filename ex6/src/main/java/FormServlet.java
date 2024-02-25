import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;

   protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      String titre = request.getParameter("titre");
      String description = request.getParameter("description");

      if (titre != null && description != null && !titre.isEmpty() && !description.isEmpty()) {
         ArrayList<Element> elements = (ArrayList<Element>) getServletContext().getAttribute("elements");
         if (elements == null) {
            elements = new ArrayList<>();
            getServletContext().setAttribute("elements", elements);
         }

         elements.add(new Element(titre, description));

         request.getRequestDispatcher("index.jsp").forward(request, response);
      } else {
         response.setContentType("text/html");
         response.getWriter().println("Erreur : Veuillez remplir tous les champs.");
      }
   }
}
