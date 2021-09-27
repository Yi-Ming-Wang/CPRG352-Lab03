<%-- 
    Document   : agecalculator
    Created on : 25-Sep-2021, 5:30:57 PM
    Author     : adamw
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
        <link rel="stylesheet" href="Style/main.css" type="text/css"/>    
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="POST">
             <label>Enter your age:</label>
            <input type="text" name="age" value="${AGE}">
            <br>
            <input type="submit" value="Age next birthday">     
        </form>
            <p><i>${MESSAGE}</i></p>    
        <p><a href='arithmetic'>Arithmetic Calculator</a></p>
    </body>
</html>
