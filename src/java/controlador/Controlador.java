/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Persona;
import modelo.PersonaDAO;
/**
 *
 * @author GATO
 */
public class Controlador extends HttpServlet{
    PersonaDAO dao = new PersonaDAO();
    int r;
Persona p= new Persona();    
    protected void processRequest(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException
    {
    response.setContentType("text/html;charset=UTF-8");
    String accion = request.getParameter("accion");
    if(accion.equals("Ingresar"))
    {
    String usuario= request.getParameter("user");
    String password = request.getParameter("password");
    p.setUsuario(usuario);
    p.setPassword(password);
   r = dao.Validar(p);  
    if(r==1)
    {
    request.getRequestDispatcher("index.html");
    } else
    {
    request.getRequestDispatcher("Ingresar.html");
    }
    }
    }
    
    
    
    
}
