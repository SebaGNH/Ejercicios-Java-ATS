package Ej_04_Bucles;

import java.util.Scanner;
/*
Realizar un juego para adivinar un número.
Para ello generar un número aleatorio entre 0 y 100, luego ir pidiendo números indicando "es mayor" o "es menor" según sea mayor o menor con respecto a N.
El proceso terminará cuando el usuario acierta y mostrar el número de intentos.
 */
public class Ejercicio_05_Adinivar_Numero {
public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    
    int numeroAleatorio = (int)(Math.random() * 100);
    int numero;
    int contador = 0;
    do {
        System.out.print("ingrese un número para encontrar el incógnita:  ");
        numero = sc.nextInt();
        contador ++;
        if (numero > numeroAleatorio) {
            System.out.println("Es menor");
        }else if (numero < numeroAleatorio) {
            System.out.println("Es mayor");
        }
    } while (numeroAleatorio != numero);
    System.out.println("\nEl número incógnita es "+numeroAleatorio+ ", se usaron "+ contador+" intentos.");
    
    sc.close();
}
}
