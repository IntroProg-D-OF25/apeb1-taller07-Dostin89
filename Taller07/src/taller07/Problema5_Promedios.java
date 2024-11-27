/***
 * Generar un programa Java que permita ingresar 4 estudiantes;
 * por cada uno de ellos ingresar el nombre del estudiante, el promedio de ciclo. 
 * Presentar el siguiente reporte
 * Estudiante 1	10	Aprobado
 * Estudiante 2	6.9	Reprobado
 * Estudiante 3	7	Aprobado
 * Estudiante 4	5	Reprobado
 * Atención; con base al valor del promedio, usted debe asignar en cada 
 * registro el tipo Aprobado o Reprobado.
 */
import java.util.Scanner;
public class Problema5_Promedios {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombreEst;
        String estado;
        double promedio;
        int cont = 1;
        while (cont <= 4){
            System.out.println("DAME NOMBRE Y PROMEDIO");
            nombreEst = tcl.next();
            promedio = tcl.nextDouble();
            if (promedio >=7)
                estado = "APROBADO";
            else
                estado = "REPROBADO";
            System.out.println("NOMBRE\tPROMEDIO\tESTADO");
            System.out.println(nombreEst + "\t\t" + promedio + "\t\t" + estado);
            cont++;
            break;
        }
    }
}
/***
* DDAME NOMBRE Y PROMEDIO
* Estudiante1 10
* NOMBRE       PROMEDIO	  ESTADO
* Estudiante1   10.0	  APROBADO
 *////////////////////////////////
/***
 * DAME NOMBRE Y PROMEDIO
Estudiante2 6,9
NOMBRE	       PROMEDIO	  ESTADO
Estudiante	2.0	  REPROBADO
 *////////////////////////////////
/***
 * DAME NOMBRE Y PROMEDIO
Estudiante3 7
NOMBRE	       PROMEDIO   ESTADO
Estudiante3	7.0	  APROBADO
 *////////////////////////////////
/***
 * DAME NOMBRE Y PROMEDIO
Estudiante4 5
NOMBRE	       PROMEDIO	   ESTADO
Estudiante4	5.0	   REPROBADO
 */////////////////////////////////