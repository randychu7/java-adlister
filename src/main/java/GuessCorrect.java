import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Scanner;

@WebServlet("/correct")
public class GuessCorrect extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      request.setAttribute("message","You're Right!");
      request.getRequestDispatcher("/correct.jsp").forward(request,response);
    }
}
