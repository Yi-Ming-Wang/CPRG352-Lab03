<%-- 
    Document   : arithmeticcalculator
    Created on : 25-Sep-2021, 8:30:52 PM
    Author     : adamw
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
        <link rel="stylesheet" href="Style/main.css" type="text/css"/>    
    </head>
    <body>
         <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="POST">
             <label>First:</label>
            <input type="text" name="first" value="${FIRST}">
            <br>
             <label>Second:</label>
            <input type="text" name="second" value="${SECOND}">
             <br>
            <input type="submit" name="action" value="+"/>
            <input type="submit" name="action" value="-"/>
            <input type="submit" name="action" value="*"/>
            <input type="submit" name="action" value="%"/>
        </form>
            <p><i>Result: ${MESSAGE}</i></p>    
        <p><a href='age'>Arithmetic Calculator</a></p>
    </body>
</html>
