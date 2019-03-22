<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 19/03/2019
  Time: 15:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple dictionary</title>
    <style type="text/css">
        input[type=text] {
            width: 300px;
            font-size: 16px;
            border: 2px solid #cccccc;
            border-radius: 4px ;
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
<h2>Vietnamese</h2>
<form method="post" action="index">
    <input type="text" name="search" placeholder="Enter your word: "/>
    <input type="submit" id="submit" value="Search"/>
</form>

</body>
</html>
