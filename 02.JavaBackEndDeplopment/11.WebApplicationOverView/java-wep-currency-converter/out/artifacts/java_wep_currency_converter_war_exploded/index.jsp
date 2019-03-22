<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 19/03/2019
  Time: 13:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
    <style type="text/css">
        input[type=text]{
            width: 300px;
            font-size: 16px;
            border: 2px solid #ccc;
            border-radius: 4px;
            padding: 12px 10px 12px 10px;
        }
        #submit {
            padding:13px; margin:13px
        }
    </style>
</head>
<body>
<h2>Currency Converter</h2>
<form action="currencyConverter.jsp" method="post">
        <label>Rate:</label><br/>
        <input type="text" name="rate" placeholder="Rate" value="22000"/><br/>
        <label>USD:</label><br/>
        <input type="text" name="usd" placeholder="USD" value="0"/><br/>
        <input type="submit" value="converter" id="submit">
</form>
</body>
</html>
