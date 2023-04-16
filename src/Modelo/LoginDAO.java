
package Modelo;

//Importamos librerias necesarias para establecer conexion con la base de datos
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDAO {
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    public login ingreso(int documento, String contraseña){
        //Mostramos la interfaz ingreso
        login n1 = new login();
        String sql = "Select * from datosingreso where Documento = ? and Contraseña = ?"; //Consultamos los datos en la base de datos
        try{ //Establecemos conexion con la base de datosingreso
            conn = cn.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, documento);
            ps.setString(2, contraseña);
            rs = ps.executeQuery();
            
            if (rs.next()){ //recuperamos los datos que se encuentran en datosingreso 
                n1.setDocumento(rs.getInt("Documento"));
                n1.setUsuario(rs.getString("Usuario"));
                n1.setContraseña(rs.getString("Contraseña"));
                n1.setPrivilegio(rs.getString("Privilegio"));
            }
        }catch (Exception e){
            
        }
        return n1;
    }
    //Creamos un metodo para registrar los nuevos usuarios
    public boolean Registrar(login registro){
        String sql = "Insert into datosingreso (Documento, Usuario, Contraseña, Privilegio) values (?,?,?,?)"; //Consultamos los datos en la base de datos
        try{ //Establecemos conexion con la base de datosingreso
           conn = cn.getConnection();
           ps = conn.prepareStatement(sql);
           //Asignamos en cada casilla los datos ingresados en la ventana registrar
           ps.setInt(1,registro.getDocumento());
           ps.setString(2,registro.getUsuario());
           ps.setString(3,registro.getContraseña());
           ps.setString(4,registro.getPrivilegio());
           ps.execute(); //Guardamos la informacion
           return true;
        }catch(SQLException e){
            
            return false;
        }
        
        
        
    }
    //Creamos un metodo para eliminar los usuarios
    public boolean EliminarUsuario(int doc){
        String sql = "Delete from datosingreso where Documento=?";//Consultamos los datos en la base de datos
        try{ //Establecemos conexion con la base de datosingreso
            ps = conn.prepareStatement(sql);
            //Eliminamos el usuario
            ps.setInt(1, doc);
            ps.execute(); //Guardamos la informacion
            return true;
        }catch (SQLException e){
            System.out.println(e.toString());
            return false;
        }finally{
            try{
                conn.close();
            }catch (SQLException ex){
                System.out.println(ex.toString());
            }
        }
        
    }
}
