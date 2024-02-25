import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculatorServlet extends HttpServlet {
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      int num1 = Integer.parseInt(request.getParameter("num1"));
      int num2 = Integer.parseInt(request.getParameter("num2"));
      String operator = request.getParameter("operator");

      double result = 0;
      switch (operator) {
         case "add":
            result = num1 + num2;
            break;
         case "subtract":
            result = num1 - num2;
            break;
         case "multiply":
            result = num1 * num2;
            break;
         case "divide":
            if (num2 != 0) {
               result = (double) num1 / num2;
            } else {
               result = Double.POSITIVE_INFINITY;
            }
            break;
      }

      request.setAttribute("result", result);

      RequestDispatcher dispatcher = request.getRequestDispatcher("calculator.jsp");
      dispatcher.forward(request, response);
   }
}
