<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 20/03/2019
  Time: 08:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<br>
<h2>Simple Calculator</h2>
<br>
<form method="post" action="index">
    <fieldset>
        <legend>calculator</legend>
        <table>
            <label>First operand</label>
            <input type="text" name="firstOperand"> <br></br>
            <label>Operator</label>
            <select name="operator">
                <option value="+">Addition</option>
                <option value="-">Subtraction</option>
                <option value="*">Multiplication</option>
                <option value="/">Divition</option>
            </select><br></br>
            <label>Second operand</label>
            <input type="text" name="secondOperand"><br></br>
            <input type="submit" id="submit" value="calcutate">
        </table>
    </fieldset>
</form>
</body>
</html>
