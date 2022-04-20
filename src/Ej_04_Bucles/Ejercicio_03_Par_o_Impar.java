package Ej_04_Bucles;

import java.util.Scanner;

/**
Leer números hasta que se introduzca un 0.
Para cada uno indicar si es par o impar.
 */
public class Ejercicio_03_Par_o_Impar {   
    
public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese números para saber si es par o impoar, pulse 0 para salir: ");
    int numero = sc.nextInt();
    while (numero != 0){        
            
        if (numero %2 == 0) {
            System.out.println("Es par");

        }else{
            System.out.println("Es Impar");
        }

        System.out.print("Ingrese otro número ");
        numero = sc.nextInt();
    } ;
    System.out.println("\nFin del programa");

    sc.close();
}
}
