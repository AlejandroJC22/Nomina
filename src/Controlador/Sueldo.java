
package Controlador;

import Modelo.Empleado;

/**
 *
 * @author Alejandro José Castilla Cuello
 */
public class Sueldo {
    //Definimos los atributos
    public static double devengado;
    public static double deduccion;
    public static double salario;
    public static double sueldo;
    
    //Creamos un constructor
    public Sueldo(double sueldo) {
        //Asignamos el valor de 0 para empezar a operar
        sueldo = 0;
        //Asignamos los valores correspondientes a cada variable
        this.devengado =  Devengado.dev;
        this.deduccion = Deducciones.deduccion;
        this.salario = Empleado.salariobase;
        //Operamos cada variable para obtener el sueldo a pagar del empleado
        this.sueldo = (salario + devengado) - deduccion;
        
        
    }
    //Definimos un Getter para obtener la informacion
    public static double getSueldo() {
        //retornamos la informacion
        return sueldo;
    }
    
    
}
