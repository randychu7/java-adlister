<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="Products.Products" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %><%--
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

  Created by IntelliJ IDEA.
  User: randychu
  Date: 3/10/23
  Time: 10:37 AM
  To change this template use File | Settings | File Templates.
  In jsp-and-jstl-exercise branch, add the following...

- Create a package in java folder called `model`
- Create a Product class in the `model` package
- Add properties for the name of the product and costInCents (int)
- Add constructor and getters and setters

Create a products.jsp file that defines at least three products.

Display each product in it's own div that looks like this:

<div>
	<h3>NAME_OF_PRODUCT_HERE</h3>
	<h3>$COST_IN_CENTS HERE</h3>
</div>
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Products p1 = new Products("Coffee",1000);
    Products p2 = new Products("Hamburger",5000);
    Products p3 = new Products("Coke",2000);

    ArrayList<Products> products = new ArrayList<>(Arrays.asList(
            p1,
            p2,
            p3
    ));
    request.setAttribute("products",products);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>


        <c:forEach var="product" items="${products}">
        <div>
            <h3>Product name: ${product.name}</h3>
            <h3>Cost in Cents: ${product.costInCents}</h3>
        </div>
        </c:forEach>




</body>
</html>
