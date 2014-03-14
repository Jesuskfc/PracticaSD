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
                
            </tr>
            
        </table>
                        </form>

             <form method="post" action="SrvAgregar">   
                <ul>

       <li>

            <h2>Registrate</h2>

       </li>

       <li>
           <label>Nombre:</label>
           <input type="text" name="nombre"   required />
       </li>

       <li>
           <label>Apellidos</label>
           <input type="apellidos" name="apellidos" required />
       </li>

       <li>
           <label >DNI</label>
           <input type="text" name="dni" required />
       </li>
       
       <li>
           <label>Departamento</label>
           <input type="text" name="departamento" required />
       </li>
       
       <li>
           <input type="radio" name="sucursal" value= "teruel" checked> teruel<br>
            <input type="radio" name="sucursal" value= "soria"> soria<br>
            
       </li>
       
       <li>
           <label>Usuario</label>
           <input type="text" name="user" required />
       </li>
       
       <li>
           <label>Contraseña</label>
           <input type="password" name="pw" required />
       </li>
       
        <li>

          <button class="submit" type="submit">Enviar</button>

        </li>
    </ul>
    
             </form>
                 
    </body>
</html>
