/***
 * Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 * La siguiente secuencia es: 5/10, 10/12. 15/14, 20/16, 25/18, 30/20
 */
import java.util.Scanner;
public class Problema2_SerieNumero2 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limite;
        int cont = 5;
        int denom = 10;
        System.out.println("DAME UN LIMITE");
        limite = tcl.nextInt();
        while(cont <= limite){
            System.out.println(cont + "/"+ denom);
            cont = cont + 5;
            denom = denom + 2;
        }
    }
}

/***
 * DAME UN LIMITE
30
* 5/10
* 10/12
* 15/14
* 20/16
* 25/18
* 30/20
 *///////////////