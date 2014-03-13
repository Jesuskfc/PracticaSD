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
public class AccesoEmpleados extends Conexion{
    private String user;
    private String password;
    private ResultSet result;//devuelve un grupo de datos
    
    public AccesoEmpleados(){
        Conectar();
    }
    
    public ResultSet Listar() throws Exception{

        try{
            getStmt();//estado de la comunicacion
            result= stmt.executeQuery("SELECT * FROM empleados");//consulta a la bd
            return result;//devuelve los resultados
        }catch (SQLException ex){
            System.err.println("Excepcion SQL: " +ex.getMessage());
            return null;
        }
       
    }
    
    public ResultSet Buscar(String user, String pw){

     try{
            getStmt();//estado de la comunicacion
            result= stmt.executeQuery("SELECT * FROM empleados WHERE (USUARIO LIKE'" + user+"%') AND (PASSWORD LIKE'"+pw+"%') ");//consulta a la bd
            return result;//devuelve los resultados
        }catch (SQLException ex){
            System.err.println("Excepcion SQL: " +ex.getMessage());
            return null;
        }   
    }
}
