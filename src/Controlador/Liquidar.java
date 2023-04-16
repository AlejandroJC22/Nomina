
package Controlador;



/**
 *
 * @author Alejandro José Castilla Cuello
 */
public class Liquidar {
    
    //Atributos
    private int salario_base;
    private int comision;
    private int hora_extra;
    private int valor_hora;
    public static int enteroLiquidado;
    
    
    

    
    public Liquidar(int salario_base, int comision, int hora_extra, int valor_hora) {
        this.salario_base = salario_base;
        this.comision = comision;
        int horas_extra = hora_extra * valor_hora; //Valor hora extra diurna
        int salariominimo = 1160000;
        int aux = salario_base <= (salariominimo * 2) ? 140606 : 0;
        int totaldev = salario_base + horas_extra + comision + aux;
        double deduccion = totaldev *0.08;
        double netopagado = totaldev - deduccion;
        double aportesSalud = (salario_base+comision+horas_extra)*0.085;
        double aportesPension = (salario_base+comision+horas_extra)*0.12;
        double totalSeguridadSocial = aportesSalud + aportesPension;
        double cesantias = totaldev * 0.083;
        double impuestoCesantias = cesantias *0.12;
        double prima = cesantias;
        double vacaciones = salario_base * 0.0417;
        double cajaCompensacion = (salario_base + horas_extra + comision)*0.04;
        double icbf = (salario_base + horas_extra + comision)*0.03;
        double sena = (salario_base + horas_extra + comision)*0.02;
        double aportesParafiscales = cajaCompensacion + icbf + sena;
        double arl = (salario_base + horas_extra + comision)*0.00522;
        double totalApropiado = cesantias + impuestoCesantias + prima + vacaciones + aportesParafiscales + arl;

        double liquidacionTotal = totaldev + totalSeguridadSocial + totalApropiado;
        this.enteroLiquidado =(int) liquidacionTotal;
         
    }

    public int getEnteroLiquidado() {
        return enteroLiquidado;
    }
    
    
    
    
    
    
}
