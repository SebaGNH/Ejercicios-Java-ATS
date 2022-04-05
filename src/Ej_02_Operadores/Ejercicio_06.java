import java.util.Scanner;
public class Ejercicio_06 {
/*
Hacer un programa que calcule el cuadrado de una suma
(a+b)²  =a² + b² + 2ab
*/    
public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);

    //Pedimos datos
    System.out.print("Ingrese el valor A: ");
    double valorA = sc.nextDouble();
    System.out.print("Ingrese el valor de B: ");
    double valorB = sc.nextDouble();


    //Calculamos
    double aCuadrado = Math.pow(valorA, 2);
    double bCuadrado = Math.pow(valorB, 2);
    double tercerTermino = 2* valorA *valorB;
    double resultado = aCuadrado + bCuadrado + tercerTermino;

    //Imprimimos Resultado
    System.out.println("El resultado es: "+ resultado);

    sc.close();
}
}
