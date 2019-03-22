<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 19/03/2019
  Time: 10:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<head>
    <title>Simpe Dictionary</title>
    <style type="text/css">
    input[type=text] {
    width: 300px;
    font-size: 16px;
    border: 2px solid #ccc;
    border-radius: 4px;
    padding: 12px 10px 12px 10px;
    }
    #submit {
    border-radius: 2px;
    padding: 10px 32px;
    font-size: 16px;
    }
    </style>

</head>
<body>
<h2>Vietnamese Dictionary</h2>
<form method="post" action="dictionary.jsp" >
        <input type="text" name="search" placeholder="Enter your Word:">
        <input type="submit" id="submit" value="Search">
</form>

</body>
</html>
