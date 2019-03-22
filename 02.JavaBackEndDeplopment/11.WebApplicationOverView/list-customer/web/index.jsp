<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 21/03/2019
  Time: 10:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<!-- Khai báo sử dụng JSTL Core Tags -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List Customer</title>
    <style type="text/css">
        tr {
            background-color: blanchedalmond;
            color: red;
        }
        th{
            color: blue;
        }
    </style>
</head>
<body>

<fieldset>
    <legend>Danh sach khach hang</legend>
<table border="3" width="1000px">
    <tr>
        <th>Name</th>
        <th>Day of Birth</th>
        <th>Address</th>
    </tr>
    <c:forEach items="${customer}" var="cus">
        <tr>
            <td>${cus.name}</td>
            <td>${cus.dayOfBird}</td>
            <td>${cus.address}</td>
        </tr>
    </c:forEach>
</table>
</fieldset>
</body>
</html>