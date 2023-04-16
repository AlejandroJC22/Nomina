
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    //Creamos un objeto connection para conectarnos a la base de datos
    Connection con;
    
    
    public Conexion(){
        con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver"); //Conectamos con la base de datos
            con = DriverManager.getConnection("jdbc:mysql://localhost/bd_nomina","root",""); //Establecemos conexion con la base de datos
            if(con!=null){
                //Si la conexión no es nula, establecemos conexión
            }
        }catch(Exception e){
            
        }
    }
    //Definimos un Getter para obtener la informacion
    public Connection getConnection(){
        //Retornamos la informacion
        return con;
    }

    
}
