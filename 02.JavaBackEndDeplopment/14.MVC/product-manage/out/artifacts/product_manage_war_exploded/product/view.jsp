<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 25/03/2019
  Time: 13:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Product</title>
</head>
<body>
<h1>Customer details</h1>
<p>
    <a href="/products">Back to customer list</a>
</p>
<table>
    <tr>
        <td>Name:</td>
        <td>${requestScope["product"].getName()}</td>
    </tr>
    <tr>
        <td>Email:</td>
        <td>${requestScope["product"].getEmail()}</td>
    </tr>
    <tr>
        <td>Address:</td>
        <td>${requestScope["product"].getAddress()}</td>
    </tr>
</table>

</body>
</html>
