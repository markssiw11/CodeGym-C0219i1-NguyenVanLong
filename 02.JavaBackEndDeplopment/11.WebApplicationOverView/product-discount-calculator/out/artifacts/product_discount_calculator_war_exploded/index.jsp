<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 19/03/2019
  Time: 17:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount Calculator</title>
    <style type="text/css">
        input[type=text] {
            width: 400px;
            font-size: 16px;
            border: 2px solid #ccc;
            border-radius: 4px;
            padding: 12px 10px 12px 10px;
        }

        #submit {
            padding: 13px;
            margin: 13px;
        }
    </style>
</head>
<body>
<form method="post" action="index">
    <input type="text" name="productDescription" placeholder="Enter your description"/></br>
    <input type="text" name="listPrice" placeholder="List price:"/></br>
    <input type="text" name="discountPercent" placeholder="Discount percent: "/><label>%</label>></br>
    <input type="submit" id="submit" value="DiscountPercent">
</form>
</body>
</html>
