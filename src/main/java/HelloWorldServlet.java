import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    //USER GOES TO LOCALHOST 8080/hello and sees hello world
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//        res.getWriter().println("hello world");
        String name = req.getParameter("name");
        PrintWriter out = res.getWriter();
        if (name == null){
            out.println("<h1> Hello World!<h1>");
        } else {
            out.printf("<h1> Hello! %s <h1>",name);
        }


     }
}
