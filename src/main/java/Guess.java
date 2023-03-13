import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Scanner;

@WebServlet("/guess")
public class Guess extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      request.getRequestDispatcher("/guess-form.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userGuess = request.getParameter("guess");
        int correctNum = (int) (Math.random() * 3) + 1;
        if (userGuess != null && Integer.parseInt(userGuess) == correctNum){
            response.sendRedirect("/correct");
        } else {
            response.sendRedirect("/loss");
        }
    }
}
