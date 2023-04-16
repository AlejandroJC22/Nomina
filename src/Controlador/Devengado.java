
package Controlador;

import Modelo.Empleado;


/**
 *
 * @author Alejandro José Castilla Cuello
 */
public class Devengado {
    //Definimos los Atributos
    public static int aux_transporte;
    public static int dev;
    
    //Creamos el constructor de la clase
    public Devengado(int dev){
        //definimos el valor del auxilio de transporte
        aux_transporte = 140606;
        //Almacenamos en la variable el valor suministrado por texto
        dev = Empleado.salariobase;
        //Condicionamos si la variable es mayor a 2 SMLV no aplique y devuelva 0
        if (dev > 2320000){ //2 SMLV año 2023 (SMLV = 1160000)
            //Asignamos el valor en la variable
            this.dev = 0;
        }
        //Si la variable es menor a 2 SMLV le sumamos el auxilio de transporte
        else
            //Asignamos el valor de auxilio de transporte a la variable
            this.dev = aux_transporte;
            
       
        }
   
    //Definimos un Getter para obtener la informacion
    public static int getAux_transporte() {
        //Retornamos la variable
        return dev;
    }
    
    }


