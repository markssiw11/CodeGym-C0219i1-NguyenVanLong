<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>


<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 27/03/2019
  Time: 17:15 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Selection</title>
</head>
<body>
    <h1>Your Selection</h1>
    <fieldset>
        <h1> <legend>your selection is: </legend></h1>
        <h1>
            <c:forEach items="${condiment}" var="result">
                ${result}
            </c:forEach>
        </h1>
    </fieldset>
</body>
</html>
