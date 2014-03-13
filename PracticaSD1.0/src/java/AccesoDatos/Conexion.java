/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AccesoDatos;

/**
 *
 * @author jesuskfc
 */

import java.sql.*;

public class Conexion {
    protected Connection con;
    protected Statement stmt;
    private String serverName ="localhost";
    private String portNumber="3306";
    private String databaseName="sddb";
    private String url="jdbc:mysql://localhost:3306/" + databaseName;//ojete
    private String userName="root";
    private String password="admin";
    //para selecionar un servidor u otro
    //private String selectMethod = "cursor";
    private String errString;
    
    
    public Conexion(){
        
    }
    
    private String getConnectionUrl(){
        return url;
    }
    
    public Connection Conectar(){
        con=null;

        try{
            Class.forName("org.gjt.mm.mysql.Driver");//utiliza el driver de mysql para conectar con la bbdd
            con= DriverManager.getConnection(getConnectionUrl(),userName,password);//establece la conexion
            stmt= con.createStatement();//
            System.out.println(errString);
        }catch(Exception e){
            errString= "Error de conexion";
            System.out.println(errString);
            return null;
        }
        
        return con;
    }
    
    public void Desconectar(){
        try{
            stmt.close();
            con.close();
        }catch (SQLException e){
            errString="Error de Desconexion";
        }
        
    }
    
    public Statement  getStmt(){
        return this.stmt;
    }
}

