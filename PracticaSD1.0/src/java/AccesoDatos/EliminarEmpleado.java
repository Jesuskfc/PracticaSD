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
public class EliminarEmpleado extends Conexion{
    
    public EliminarEmpleado() {
        Conectar();
    }
    
    public void Eliminar(String user) throws Exception{
        try{
            getStmt();//estado de la comunicacion
            
            stmt.executeUpdate("DELETE FROM empleados WHERE usuario='"+user+"'");
            
            //st.executeUpdate("DELETE FROM contacto WHERE id="+id);
            
            System.out.println("Este es el resultado: ");  
            
        }catch (SQLException ex){
            System.err.println("Excepcion SQL: " +ex.getMessage());
           // return null;
        }   
    }
    
    
}
