import java.util.Scanner;

public class Ejercicio_01_B {
/*
Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
*/
public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    int numero = 1;
    while (numero >= 0) {
        System.out.print("ingrese un numero para mostra su cuadrado o uno negativo para finalizar: ");
        numero = sc.nextInt();
        System.out.println(Math.pow(numero, 2));
    }
    System.out.println("Fin del programa");
    sc.close();
}
}
