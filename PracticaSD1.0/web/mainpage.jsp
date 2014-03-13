<%-- 
    Document   : mainpage
    Created on : 12-mar-2014, 17:13:58
    Author     : jesuskfc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Acceso</title>
    </head>
    <body>
            <form method="post" action="SrvEmpleados">
            
        <table>
            <tr>
                <td>User</td>
                <td>Password</td>
            </tr>
            <tr>
                <td><input type="text" name="USUARIO"></td>
                <td><input type="password" name="PASSWORD"></td>
                <td><input type="submit" value="buscar"></td>
                <input type="radio" name="group1" value= "teruel" checked> teruel<br>
                <input type="radio" name="group1" value= "soria"> soria<br>
            </tr>
            
        </table>
        </form>
    </body>
</html>
