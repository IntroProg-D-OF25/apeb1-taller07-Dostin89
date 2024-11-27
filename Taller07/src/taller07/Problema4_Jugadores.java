/***
* Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar:
* Nombre el jugador
* Posición en el campo de juego
* Edad
* Estatura
* El ciclo de ingreso de información deberá terminar cuando el usuario lo decida. Se debe imprimir el siguiente reporte (usar una cadena de acumulación):
* Listado de Jugadores
* 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
* 2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
* 3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
* 4. Ángel Mena -Delantero-, edad 32, estatura 1.75
* 5. Michael Estrada -Delantero-, edad 27, estatura 1.93
* Promedio de edades:  26.8
* Promedio de estaturas: 1.87
 *////////////////////////////////////////////////////////
import java.util.Scanner;
public class Problema4_Jugadores {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String reporte = ""; 
        int sumaEdades = 0;  
        double sumaEstaturas = 0; 
        int contador = 0;   
        String continuar;
        do {
            System.out.println("DAME EL NOMBRE DEL JUGADOR:");
            String nombreJugador = tcl.next();
            System.out.println("POSICIÓN DEL JUGADOR:");
            String posicionEquipo = tcl.next();
            
            System.out.println("EDAD DEL JUGADOR:");
            int edad = tcl.nextInt();
            System.out.println("ESTATURA DEL JUGADOR (en metros):");
            double estatura = tcl.nextDouble();
            reporte = reporte + (contador + 1) + ". " + nombreJugador + " - " + posicionEquipo + ", edad " + edad + ", estatura " + estatura + "\n";
            sumaEdades = sumaEdades + edad;
            sumaEstaturas = sumaEstaturas + estatura;
            contador = contador + 1;
            System.out.println("¿Deseas ingresar otro jugador? (s/n):");
            continuar = tcl.next();
        } while (continuar.equalsIgnoreCase("s"));
        double promedioEdades = (double) sumaEdades / contador;
        double promedioEstaturas = sumaEstaturas / contador;
        
        System.out.println("\n=== LISTADO DE JUGADORES ===");
        System.out.println(reporte);
        System.out.println("Promedio de edades: " + promedioEdades);
        System.out.println("Promedio de estaturas: " + promedioEstaturas);
    }
}

/***
 * DAME EL NOMBRE DEL JUGADOR:
AlexanderDominguez
POSICI�N DEL JUGADOR:
Arquero
EDAD DEL JUGADOR:
32
ESTATURA DEL JUGADOR (en metros):
1,95
�Deseas ingresar otro jugador? (s/n):
s
DAME EL NOMBRE DEL JUGADOR:
XavierArreaga
POSICI�N DEL JUGADOR:
defensa
EDAD DEL JUGADOR:
24
ESTATURA DEL JUGADOR (en metros):
1,85
�Deseas ingresar otro jugador? (s/n):
s
DAME EL NOMBRE DEL JUGADOR:
MoisesCaicedo
POSICI�N DEL JUGADOR:
Mediocentro
EDAD DEL JUGADOR:
19
ESTATURA DEL JUGADOR (en metros):
1,88
�Deseas ingresar otro jugador? (s/n):
s
DAME EL NOMBRE DEL JUGADOR:
AngelMena
POSICI�N DEL JUGADOR:
Delantero
EDAD DEL JUGADOR:
32
ESTATURA DEL JUGADOR (en metros):
1,75
�Deseas ingresar otro jugador? (s/n):
s
DAME EL NOMBRE DEL JUGADOR:
MichaelEstrada
POSICI�N DEL JUGADOR:
Delantero
EDAD DEL JUGADOR:
27
ESTATURA DEL JUGADOR (en metros):
1,93
�Deseas ingresar otro jugador? (s/n):
n

=== LISTADO DE JUGADORES ===
1. AlexanderDominguez - Arquero, edad 32, estatura 1.95
2. XavierArreaga - defensa, edad 24, estatura 1.85
3. MoisesCaicedo - Mediocentro, edad 19, estatura 1.88
4. AngelMena - Delantero, edad 32, estatura 1.75
5. MichaelEstrada - Delantero, edad 27, estatura 1.93

Promedio de edades: 26.8
Promedio de estaturas: 1.8719999999999999
 */