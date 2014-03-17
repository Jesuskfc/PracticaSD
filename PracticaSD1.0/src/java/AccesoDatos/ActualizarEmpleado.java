/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AccesoDatos;

import java.sql.*;
import AccesoDatos.*;
import java.util.logging.*;//para trabajar con la bd

/**
 *
 * @author USUARIO
 */
public class ActualizarEmpleado extends Conexion {
    private String user;
    private String password;
    private ResultSet result;//devuelve un grupo de datos

    public ActualizarEmpleado() {
        Conectar();
    }
    
        
    
    public void Actualizar(String user, String pw, String dni, String nombre, String apellidos, String departamento, String sucursal) throws Exception{
        try{
            getStmt();//estado de la comunicacion
            
            stmt.executeUpdate("UPDATE empleados SET DNI= '" + dni + "', apellidos='" + apellidos + "', nombre='" + nombre + "' ,password ='" + pw + "', departamento ='" + departamento + "', sucursal ='" + sucursal + "' WHERE USUARIO='"+user+"'" );//consulta a la bd
            System.out.println("Este es el resultado: " + result);  
            
            //stmt.executeUpdate("UPDATE empleados SET DNI= '" + dni + "', apellidos='" + apellidos + "', nombre='" + nombre + "' ,password ='" + pw + "', departamento ='" + departamento + "', sucursal ='" + sucursal + "'" );
            
//return result;//devuelve los resultados
        }catch (SQLException ex){
            System.err.println("Excepcion SQL: " +ex.getMessage());
           // return null;
        }   
    }
}

