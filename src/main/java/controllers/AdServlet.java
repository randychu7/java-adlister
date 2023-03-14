package controllers;

import dao.Ads;
import dao.DaoFactory;
import models.Ad;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/ads")
public class AdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Ads ListAdsDao = DaoFactory.getAdsDao();
        List<Ad> ads = ListAdsDao.all();
        request.setAttribute("ads",ads);
        request.getRequestDispatcher("ads/index.jsp").forward(request,response);
    }
}
