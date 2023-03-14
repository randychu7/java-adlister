package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/login1")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    Ads ListAdsDao = DaoFactory.getAdsDao();
//    List<Ad> ads = ListAdsDao.all();
//    request.setAttribute("ads",ads);
    request.getRequestDispatcher("/login.jsp").forward(request,response);
//    request.getRequestDispatcher("/ads/index.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            if (username.equals("admin") && password.equals("password")) {
//                Ads ListAdsDao = DaoFactory.getAdsDao();
//                List<Ad> ads = ListAdsDao.all();
//                request.setAttribute("ads",ads);
                response.sendRedirect("/profile");
//                request.getRequestDispatcher("/profile").forward(request,response);
            }else {
                response.sendRedirect("/login1");
            }

    }
}
