
package Modelo;
/**
 *
 * @author Alejandro José Castilla Cuello
 */
public class Empleado {
    
    //Atributos
    private String nombre;
    public int documento;
    public static int salario;
    private int dias_trabajados;
    public static int salariobase;
    


    //Constructor
    public Empleado(String nombre, int documento, int dias_trabajados, int salario) {
        //asignamos los valores suministrados en cada atributo
        this.nombre = nombre;
        this.documento = documento;
        this.dias_trabajados = dias_trabajados;
        this.salario = salario;
        //Calculamos el Salario base del trabajador por los dias trabajados
        this.salariobase = (salario * dias_trabajados) / 30;
  
    }

    //Definimos los Getters para obtener la informacion
    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public int getSalario() {
        return salario;
    }

    
    public int getDias_trabajados() {
        return dias_trabajados;
    }
    
    public int getBase(){
        return salariobase;
    }
    
    
    
}
