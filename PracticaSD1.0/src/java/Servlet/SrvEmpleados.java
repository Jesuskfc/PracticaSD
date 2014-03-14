/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import AccesoDatos.*;
import java.sql.*;
import java.util.logging.*;
/**
 *
 * @author jesuskfc
 */
@WebServlet(name = "SrvEmpleados", urlPatterns = {"/SrvEmpleados"})
public class SrvEmpleados extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            
            String us = request.getParameter("USUARIO");
            String pw = request.getParameter("PASSWORD");
            
            ResultSet res;
            AccesoEmpleados empleado = new AccesoEmpleados();
            ActualizarEmpleado newempleado = new ActualizarEmpleado();
            String usuario = "";
            String password ="";
            String dni="";
            String nombre="";
            String apellidos="";
            String departamento="";
            String sucursal="";
            
            System.out.println("Antes de out.talbas");
            
            out.println("<head>");
            out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
            out.println("<title>Acceso</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<td>User</td>");
            out.println("<td>Password</td>");
            out.println("<td>DNI</td>");
            out.println("<td>Nombre</td>");
            out.println("<td>Apellidos</td>");
            out.println("<td>Departamento</td>");
            out.println("<td>Sucursal</td>");
            out.println("</tr>");
            
            
            res = empleado.Listar();
            
            
            if((request.getParameter("USUARIO")!=""))
                res = empleado.Listar();
                //res= empleado.Buscar(request.getParameter("USUARIO"),request.getParameter("PASSWORD"));
            if((request.getParameter("USUARIO")=="") && (request.getParameter("PASSWORD")==""))
                res= empleado.Listar();
              
            
            while (res.next()) { //mientras encuentre resultados en la tabla
                
                usuario = res.getString("usuario");
                
                password = res.getString("password");
                dni= res.getString("dni");
                nombre= res.getString("nombre");
                apellidos= res.getString("apellidos");
                departamento= res.getString("departamento");
                sucursal=res.getString("sucursal");
                
                System.out.println("<td><input type=\"submit\" value=\"Actualizar\" "
                        + "onclick= res= empleado.Buscar(request.getParameter(\"USUARIO\"),request.getParameter(\"PASSWORD\"))></td>");
                
                System.out.println(res);
                
                if (usuario.equalsIgnoreCase(request.getParameter("USUARIO"))){
                    
                    out.println("<form method=\"post\" action=\"SrvActualizar\">");
                    
                    out.println("<td><input type=\"text\" name=\"USUARIO\""
                            + " value=" + res.getString("usuario")+"></td>");
                    out.println("<td><input type=\"password\" name=\"PASSWORD\""
                            + " value=" + res.getString("password")+"></td>");
                    out.println("<td><input type=\"text\" name=\"DNI\""
                            + " value=" + res.getString("dni")+"></td>");
                    out.println("<td><input type=\"text\" name=\"NOMBRE\""
                            + " value=" + res.getString("nombre")+"></td>");
                    out.println("<td><input type=\"text\" name=\"APELLIDOS\""
                            + " value=" + res.getString("apellidos")+"></td>");
                    out.println("<td><input type=\"text\" name=\"DEPARTAMENTO\""
                            + " value=" + res.getString("departamento")+"></td>");
                    out.println("<td><input type=\"text\" name=\"SUCURSAL\""
                            + " value=" + res.getString("sucursal")+"></td>");
                    out.println("<td><input type=\"submit\" value=\"Actualizar\"></td>");
                                        
                    newempleado.Actualizar(dni, nombre, apellidos, us, pw, departamento, sucursal,request.getParameter("USUARIO"));
                }
                else{    
                    out.println("<tr>");
                    out.println("<td>"+ usuario +"</td>");
                    out.println("<td>"+ password +"</td>");
                    out.println("<td>"+ dni +"</td>");
                    out.println("<td>"+ nombre +"</td>");
                    out.println("<td>"+ apellidos +"</td>");
                    out.println("<td>"+ departamento +"</td>");
                    out.println("<td>"+ sucursal +"</td>");
                }
                                               
                out.println("</tr>");
                
            }
            
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
            out.close();
            
        } catch (Exception e) {
            Logger.getLogger(SrvEmpleados.class.getName()).log(Level.SEVERE, null, e);
        }
        
        
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
