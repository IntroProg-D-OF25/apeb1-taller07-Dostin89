/***
 *Generar e imprimir la siguiente serie:
 * sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 */
import java.util.Scanner;
public class Problema7_Sumatoria {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limite; 
        int cont = 1;
        System.out.print("Dame el limite: ");
        limite = tcl.nextInt(); 
        while (cont <= limite) {
            if (cont % 2 != 0) {
                System.out.print(" - ( " + " 1 / " + cont + " ) ");
            } else {
                System.out.print(" + ( 1 / " + cont + " ) ");
            }
            cont++;  
        } 
    }
}

/***
* Dame el limite: 
* 10
 - (  1 / 1 )  + ( 1 / 2 )  - (  1 / 3 )  + ( 1 / 4 )  - (  1 / 5 )  + ( 1 / 6 )  - (  1 / 7 )  + ( 1 / 8 )  - (  1 / 9 )  + ( 1 / 10 )
 */////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////