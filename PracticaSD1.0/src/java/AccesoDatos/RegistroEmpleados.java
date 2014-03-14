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
 * @author jesuskfc
 */
public class RegistroEmpleados extends Conexion {
    
    
    public RegistroEmpleados(){
        Conectar();
    }
    
    public void Agregar(String dni, String nombre, String apellidos, String user, String pw, String departamental, String sucursal ) throws Exception{

        try{
            getStmt();//estado de la comunicacion
            stmt.executeUpdate("INSERT INTO empleados VALUES ('"+dni +"','"+nombre+"','"+apellidos+"','"+user+"','"+pw+"','"+departamental+"','"+sucursal+"')" );//consulta a la bd
        }catch (SQLException ex){
            System.err.println("Excepcion SQL: " +ex.getMessage());
        }
       
    }
}
