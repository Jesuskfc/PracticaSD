/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AccesoDatos;
import java.sql.*;
import AccesoDatos.*;
import java.util.logging.*;
/**
 *
 * @author jesuskfc
 */
public class ActualizarEmpleado extends Conexion{
    
    public ActualizarEmpleado(){
        Conectar();
    }
    
    public void Actualizar(String dni, String nombre, String apellidos, String user, String pw, String departamental, String sucursal, String olduser) throws Exception{

        try{
            getStmt();//estado de la comunicacion
            stmt.executeUpdate("UPDATE empleados SET dni='"+dni+"',nombre='"+nombre+"'");//consulta a la bd
            //UPDATE  `sddb`.`empleados` SET  `apellidos` =  'Gonzalez' WHERE  `empleados`.`usuario` =  'xaxo93';
        }catch (SQLException ex){
            System.err.println("Excepcion SQL: " +ex.getMessage());
        }
     //UPDATE empleados SET dni='121',nombre='asf'
        
        //,apellidos='"+apellidos+"',usuario='"+user+"',password='"+pw+"',departamento='"+departamental+"',sucursal='"+sucursal+"'
    }
}
