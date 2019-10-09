package modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GATO
 */
public class PersonaDAO implements Validar{
Connection con;
Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r=0;
    @Override
    public int Validar(Persona per) {
        String sql="Select * from persona where nombres = ? and password=? ";
        try {
            con = cn.getConnection();
             ps = con.prepareStatement(sql);
             ps.setString(1, per.getUsuario());
             ps.setString(2, sql);
             rs = ps.executeQuery();
             while(rs.next())
             {
                
                 System.out.println(rs.getString("USUARIO"));
            r=r+1;
                 per.setUsuario(rs.getString("Usuarios"));
             per.setPassword(rs.getString("Passwords"));
             }
             if(r==1)
             {
             return 1;
             } else 
             {
             return 0;
             }
        } catch (Exception e) {
        return 0;
        }
    }
    
}
