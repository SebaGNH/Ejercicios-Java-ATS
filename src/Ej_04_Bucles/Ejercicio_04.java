package Ej_04_Bucles;

import java.util.Scanner;

/**
Pedir números hasta que se teclee uno negativo, y mostrar cuantos números se han introducido en total
 */
public class Ejercicio_04 {
public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);

    int numero = 0;
    int contador = 0;
    do {
        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();
        contador ++;
    } while (numero >= 0);

    System.out.println("Se ingresaron "+contador+" números.");
    
    sc.close();
}
}
