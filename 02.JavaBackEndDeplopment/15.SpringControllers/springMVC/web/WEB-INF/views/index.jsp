<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 27/03/2019
  Time: 16:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Sandwich Condiment</title>
  </head>
  <body>
  <h1>Sanwid condiment</h1>
  <form method="post" action="condiment">
    <tr>
      <input type="checkbox" name="condiment" value="Lettuce"> Lettuce
      <input type="checkbox" name="condiment" value="Tomato"> Tomato
      <input type="checkbox" name="condiment" value="Mustard"> Mustard
      <input type="checkbox" name="condiment" value="Sprouts" > Sprouts
      <input type="hidden" name="condiment" value="hidden">
    </tr>
    <tr>
        <hr></hr>
        <td><input type="submit" value="save"></td>
    </tr>
  </form>
  </body>
</html>
