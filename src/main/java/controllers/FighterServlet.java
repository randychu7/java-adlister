package controllers;

import models.Fighter;
import models.FighterFactory;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/fighter")
public class FighterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Fighter> fighters = new FighterFactory().generateFighters();

        if (fighters != null) {
            request.setAttribute("fighters", fighters);
            request.getRequestDispatcher("/partials/fighters.jsp").forward(request, response);
        }
    }

}
