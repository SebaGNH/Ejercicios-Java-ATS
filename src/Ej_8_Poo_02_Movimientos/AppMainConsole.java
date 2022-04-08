
package Ej_8_Poo_02_Movimientos;
import java.util.Scanner;
/*
Construir un programa que permita dirigir el movimiento de un objeto dentro de un tablero y actualice su posición dentro del mismo.
Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA y DERECHA.
Tras cada movimiento el programa mostrará la nueva dirección elegida y las coordenadas de situación del objeto dentro del tablero
 */
public class AppMainConsole {
public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    
    ObjetoMovil om = new ObjetoMovil(0,0);

    String coordenada = "";

    do {
        System.out.println("Indique en que posicion se movera - arriba, abajo, izquierda, derecha - escriba fin para salir");
        coordenada = sc.next(); 
        System.out.println(om.obtenerPosicion(coordenada));
        
    } while (!coordenada.equals("fin"));
    
    sc.close();
}
}
