/***
 * Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados.
 * Por cada empleado se debe solicitar el nombre, numero de días trabajados y costo del día trabajo. 
 * Calcular el valor a cancelar por la empresa para cada empleado. 
 * Presentar un reporte como el siguiente:
 * Nombre 1	10	$2.5	$25
 * Nombre 2	11	$2	$22
 * Nombre 3	9	$3	$27
 * Nombre 4	5	$4	$20
 * Nombre 5	12	$2	$24
 *////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
public class Problema3_ProgramaJava {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int cont = 1;
        while (cont <= 5) {
            System.out.println("DAME EL NOMBRE DEL EMPLEADO:");
            String nomEmpleado = tcl.next();
            System.out.println("DAME EL NUMERO DE DIAS TRABAJADOS:");
            int numDiaTrabajado = tcl.nextInt();
            System.out.println("DAME EL COSTO POR DIA TRABAJADO:");
            double costoDiaTrabajado = tcl.nextDouble();
            double resultado = numDiaTrabajado * costoDiaTrabajado;
            System.out.println("Empleado: " + nomEmpleado);
            System.out.println("Dias trabajados: " + numDiaTrabajado);
            System.out.println("Costo por día: $" + costoDiaTrabajado);
            System.out.println("Total a pagar: $" + resultado);
            cont++;
            break;
        }
    }
}

/**********************************
 DAME EL NOMBRE DEL EMPLEADO:
* Nombre1
DAME EL NUMERO DE DIAS TRABAJADOS:
* 10
DAME EL COSTO POR DIA TRABAJADO:
2,5
* Empleado: Nombre1
* Dias trabajados: 10
* Costo por d�a: $2.5
* Total a pagar: $25.0
/**********************************
 DAME EL NOMBRE DEL EMPLEADO:
* Nombre2
DAME EL NUMERO DE DIAS TRABAJADOS:
* 11
DAME EL COSTO POR DIA TRABAJADO:
* 2
* Empleado: Nombre2
* Dias trabajados: 11
* Costo por d�a: $2.0
* Total a pagar: $22.0
/*********************************
 DAME EL NOMBRE DEL EMPLEADO:
* Nombre3
DAME EL NUMERO DE DIAS TRABAJADOS:
* 9
DAME EL COSTO POR DIA TRABAJADO:
* 3
* Empleado: Nombre3
* Dias trabajados: 9
* Costo por d�a: $3.0
* Total a pagar: $27.0
/**********************************
DAME EL NOMBRE DEL EMPLEADO:
* Nombre4
DAME EL NUMERO DE DIAS TRABAJADOS:
* 5
DAME EL COSTO POR DIA TRABAJADO:
* 4
* Empleado: Nombre4
* Dias trabajados: 5
* Costo por d�a: $4.0
* Total a pagar: $20.0
/*********************************
DAME EL NOMBRE DEL EMPLEADO:
* Nombre5
DAME EL NUMERO DE DIAS TRABAJADOS:
* 12
DAME EL COSTO POR DIA TRABAJADO:
* 2
* Empleado: Nombre5
* Dias trabajados: 12
* Costo por d�a: $2.0
* Total a pagar: $24.0
/*********************************
