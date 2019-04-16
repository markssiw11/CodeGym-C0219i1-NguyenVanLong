<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/03/2019
  Time: 11:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<form method="post" action="calculator">
   <fieldset>
       <legend>Calculator</legend>
       <br>
           <tr>
               <input type="text" name="firstOperand" value="${first}">
               <input type="text" name="secondOperand" value="${second}">
           </tr>
            <br></br>
           <tr>
               <input type="submit" name="operator" value="Addition">
               <input type="submit" name="operator" value="Subtraction" >.
               <input type="submit" name="operator" value="Multiplication" >
               <input type="submit" name="operator" value="Division">
           </tr>
            <br>

       </table>
   </fieldset>
</form>
<h1>Resul ${operator}: ${result}</h1>
</body>
</html>
