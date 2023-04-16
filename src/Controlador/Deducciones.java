
package Controlador;

import Modelo.Empleado;

/**
 *
 * @author Alejandro José Castilla Cuello
 */
public class Deducciones {
    //Definimos los atributos
    public static double salud;
    public static double pension;
    public static double deduccion;

    //Creamos el constructor de la clase
    public Deducciones(double deduc) {
        //Asignamos el valor de 0 para poder operar la variable
        deduc = 0;
        //Operamos el salario del empleado por el 4% para sacar el porcentaje de ahorro de salud
        this.salud = Empleado.salario * 0.04;
        //Operamos el salario del empleado por el 4% para sacar el porcentaje de ahorro de pension
        this.pension = Empleado.salario * 0.04;
        //Asignamos a la variable la suma del valor de estos dos porcentajes
        this.deduccion = salud + pension;
            
    }
    //Definimos un Getter para obtener la informacion
    public static double getDeduc() {
        //Retornamos la informacion
        return deduccion;
    }
    
    
    
}
