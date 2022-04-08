package Ej_08_Poo_01_Cuadrilatero;

import java.util.Scanner;
public class AppMainConsola {

public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    Cuadrilatero c;
    
    System.out.print("ingrese un lado 1: ");
    float lado1 = sc.nextFloat();
    
    System.out.print("Ingrese el lado 2: ");
    float lado2 = sc.nextFloat();
    
    if (lado1 == lado2) {
        c = new Cuadrilatero(lado1);
    
    } else {
        c = new Cuadrilatero(lado1, lado2);    
    }
    
    System.out.println("El area es: "+c.getArea()+", el perimetro es: "+ c.getPermietro());
    
    sc.close();
}
}
