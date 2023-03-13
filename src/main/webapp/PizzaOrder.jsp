<%--
  Created by IntelliJ IDEA.
  User: randychu
  Date: 3/10/23
  Time: 4:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>

<form action="/pizza-order" method="post" >
    <h2>Toppings</h2>
    <label>
        <input type="checkbox" name="toppings" value="pepperoni">
        Pepperoni
    </label>

    <label>
        <input type="checkbox" name="toppings" value="chicken">
        Chicken
    </label>

    <label>
        <input type="checkbox" name="toppings" value="olives">
        Olives
    </label>


    <label for="crust">Crust Type:</label>
    <select id="crust" name="crust">
        <option value ="Thin" >Thin</option>
        <option value ="Pan" >Pan</option>
        <option value ="Handmade" >Handmade</option>
    </select>

    <label for="size">Size Type:</label>
    <select id="size" name="size">
        <option value="Small">Small</option>
        <option value="Medium">Medium</option>
        <option value="Large">Large</option>
    </select>

    <label for="sauce">Sauce Type:</label>
    <select id="sauce" name="sauce">
        <option value="Red">Red</option>
        <option value="White">White</option>
        <option value="Black">Black</option>
    </select>


    <label for="text">Address:</label>
    <input type="text" id="text" name="address">

    <button>Submit</button>

</form>

</body>
</html>
