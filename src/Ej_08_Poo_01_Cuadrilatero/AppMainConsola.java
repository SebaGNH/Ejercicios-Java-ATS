package Ej_08_Poo_01_Cuadrilatero;

import java.util.Scanner;
public class AppMainConsola {
/*
Construir un programa que calcule el área y el perímetro de un cuadrilatero dada la longitud de sus lados.
Loos valores de la longitud deberán introducirse por la línea de ordenes.
Si es un cuadrado, solo se proporcionará la longitud de uno de los lados al constructor.
*/
public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    Cuadrilatero c;
    
    System.out.println("Es un cuadrado? Si - No");
    char preguntaCuadrado = Character.toLowerCase(sc.next().charAt(0));

    if (preguntaCuadrado == 's') {
        System.out.print("ingrese un lado: ");
        float area = sc.nextFloat();
        c = new Cuadrilatero(area, area);

    } else {
        System.out.print("ingrese un lado: ");
        float area = sc.nextFloat();

        System.out.println("Ingrese el perimetro: ");
        float perimetro = sc.nextFloat();
        
        c = new Cuadrilatero(area, perimetro);
        
    }

    System.out.println("El perimetro es de "+ c.getCalcularCuadrilatero());
    
    sc.close();
}
}
