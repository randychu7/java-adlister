
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Fighters</title>
</head>
<body>

<c:forEach items="${fighters}" var="fighter">
   <div>
    <h1>${fighter.name}</h1>
       <ul>
           <li>HP:${fighter.hitPoints}</li>
           <li>Max Damage:${fighter.maxDamage}</li>
       </ul>
       <c:forEach items="${fighter.Weapons}" var = "weapon">
           <h3>Name: ${weapon.name} - Damage: ${weapon.damage} -Type: ${weapon.type}</h3>
       </c:forEach>

   </div>
</c:forEach>




</body>
</html>
