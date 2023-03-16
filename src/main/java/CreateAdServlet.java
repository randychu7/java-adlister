import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CreateAdServlet", urlPatterns = "/ads/create")
public class CreateAdServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/ads/create.jsp")
            .forward(request, response);
    }

        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String title = req.getParameter("title");
            String description = req.getParameter("description");
            Ad ad = new Ad(1, title, description); // hardcoded user id for now
            DaoFactory.getAdsDao().insert(ad);
            // Redirect the user back to the ads index page
            resp.sendRedirect("/ads");
        }
    }
//}
