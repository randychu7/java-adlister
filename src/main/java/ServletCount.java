import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletCount", value = "/count")
public class ServletCount extends HttpServlet {
    public int count = 1;
    //views counter
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String reset = request.getParameter("reset");
        count++;
        if (reset != null){
            count = 0;
        }
        response.getWriter().printf("Your view count is %d",count);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
