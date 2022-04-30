package Ej_03_Condicionales;

import java.util.Scanner;

/*
Pedir un número entre 0 y 99 999 y decir cuantas cifras tiene
*/
public class Ejercicio_08_C {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Ingrese un número para saber cuantas cifras tiene: ");
    int numero = sc.nextInt();
    
    if (numero >= 0  && numero <=9) {
        System.out.println("Tiene un digito");
    }else if (numero>=10 && numero <=99 ) {
        System.out.println("Tiene dos digitos");  
    }else if (numero >= 100 && numero <= 999) {
        System.out.println("Tiene tres digitos");
    } else if (numero >= 1000 && numero <= 9999) {
        System.out.println("tiene 4 digitos");
    }else if (numero >= 10000 && numero <=99999) {
        System.out.println("Tiene 5 digitos");
    }

    sc.close();
}
}
