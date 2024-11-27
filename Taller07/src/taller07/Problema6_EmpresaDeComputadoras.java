/***
*Una empresa de comercialización de computadoras realiza el proceso de venta
* haciendo un descuento por tipo de cliente: Si es cliente tipo 1 hay un descuento del 10% Si es cliente tipo 2 hay un descuento del 20% 
* En caso que sea otro tipo de cliente, no hay descuento. Generar un proceso que permita ingresar 7 ventas: por cada venta preguntar los siguiente datos:
Nombre del cliente
Costo de la computadora (solo se vende una computadora por transacción)
Tipo de cliente Presentar el siguiente reporte: Cliente tipo 1, compra
* computadora con precio $100
 * 
 */
import java.util.Scanner;
public class Problema6_EmpresaDeComputadoras {
     public static void main(String[] args) {
        Scanner tcl = new Scanner (System.in);
        String nombre;
        double cont = 1;
        double subtotal;
        double costo;
        int cliente;
        
        while (cont <= 7){
            System.out.print("Dame el Nombre del cliente: ");
            nombre = tcl.next();
            System.out.print("Costo de la computadora: ");
            costo = tcl.nextDouble();
            System.out.print("cliente (1, 2): ");
            cliente = tcl.nextInt();
            subtotal = costo;
            if (cliente == 1){
            costo = costo * 0.90;
            }else {
            costo = costo * 0.80;}
            System.out.println("NOMBRE\tPRECIO\tTIPOCLIENTE\tTOTALAPAGAR");
            System.out.println(nombre+ "\t"+ subtotal + "\t"+ cliente + "\t" + "\t" + costo);
            cont ++;
            
        }
    }
}

/***
 * Dame el Nombre del cliente: dosti
Costo de la computadora: 500
cliente (1, 2): 1
NOMBRE	PRECIO	TIPOCLIENTE	TOTALAPAGAR
dosti	500.0	1		450.0
Dame el Nombre del cliente: anderson
Costo de la computadora: 600
cliente (1, 2): 2
NOMBRE	PRECIO	TIPOCLIENTE	TOTALAPAGAR
anderson	600.0	2		480.0
Dame el Nombre del cliente: pepe
Costo de la computadora: 900
cliente (1, 2): 2
NOMBRE	PRECIO	TIPOCLIENTE	TOTALAPAGAR
pepe	900.0	2		720.0
Dame el Nombre del cliente: juan
Costo de la computadora: 350
cliente (1, 2): 1
NOMBRE	PRECIO	TIPOCLIENTE	TOTALAPAGAR
juan	350.0	1		315.0
Dame el Nombre del cliente: alberto
Costo de la computadora: 200
cliente (1, 2): 1
NOMBRE	PRECIO	TIPOCLIENTE	TOTALAPAGAR
alberto	200.0	1		180.0
Dame el Nombre del cliente: cristiano
Costo de la computadora: 2000
cliente (1, 2): 2
NOMBRE	PRECIO	TIPOCLIENTE	TOTALAPAGAR
cristiano	2000.0	2		1600.0
Dame el Nombre del cliente: messi
Costo de la computadora: 500
cliente (1, 2): 2
NOMBRE	PRECIO	TIPOCLIENTE	TOTALAPAGAR
messi	500.0	2		400.0
 */