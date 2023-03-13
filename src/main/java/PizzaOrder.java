import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/pizza-order")
public class PizzaOrder extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/PizzaOrder.jsp").forward(req,resp);;
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] toppings = req.getParameterValues("toppings");
        System.out.println("The toppings are: ");
        for (String topping : toppings){
            System.out.println(topping);
        }
        String crust = req.getParameter("crust");
        System.out.println("The crust is " + crust);
        String size = req.getParameter("size");
        System.out.println("The size of the pizza is " + size);
        String sauce = req.getParameter("sauce");
        System.out.println("The sauce of the pizza is " + sauce);
        String address = req.getParameter("address");
        System.out.println("The address of the pizza is " + address);




//        System.out.printf("Your Pizza has %s for toppings, your crust is %s, the size of the pizza is %s, the sauce of choice is %s! Your order is being sent to %s"),toppings,crust,size,sauce,address;
//        System.out.printf("Your Pizza has %s for toppings, your crust is %s, the size of the pizza is %s, the sauce of choice is %s! Your order is being sent to %s", Arrays.toString(toppings), crust, size, sauce, address);
    }



}
