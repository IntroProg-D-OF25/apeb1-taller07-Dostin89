/***
 * Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 * la siguiente secuencia es: 1/10, 2/11. 3/12, 4/13, 5/14, 6/15
 */
import java.util.Scanner;
public class Problema1_SerieNumero1 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limite;
        int cont = 1;
        System.out.print("DAME LIMITE");
        limite = tcl.nextInt();
        while(cont <= limite){
            System.out.println(cont +"/"+(cont+9)+",");
            cont++;
        }
    }
}

/***
 * DAME LIMITE 10
* 1/10,
* 2/11,
* 3/12,
* 4/13,
* 5/14,
* 6/15,
* 7/16,
* 8/17,
* 9/18,
* 10/19,
 */