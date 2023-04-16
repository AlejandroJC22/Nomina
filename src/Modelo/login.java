
package Modelo;

public class login {

    //Definimos los atributos
    private int documento;
    private String usuario;
    private String contraseña;
    private String privilegio;
    

    public login() {
    }
    
    //Creamos un constructor que obtiene todos los datos para ingresar
    public login(int documento, String usuario, String contraseña, String privilegio) {
        //Asignamos los valores correspondientes a cada variable
        this.documento = documento;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.privilegio = privilegio;
    }
    //Definimos los Getters and Setters para obtener la informacion
    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(String privilegio) {
        this.privilegio = privilegio;
    }
   
    
}
