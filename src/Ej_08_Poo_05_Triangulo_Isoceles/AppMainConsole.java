package Ej_08_Poo_05_Triangulo_Isoceles;
import java.lang.*;
import java.util.Scanner;

public class AppMainConsole {

public static int getIndiceTriangulo(Triangulo triangulos[]){
    int indice = 0;
    double obtenerArea = triangulos[indice].getArea();

    for (int i = 1; i < triangulos.length; i++) {
        if (triangulos[i].getArea() > obtenerArea) {
            obtenerArea = triangulos[i].getArea();
            indice = i;
        }
    }
    return indice;
}

public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Indique la cantidad de triángulos que va a cargar: ");
    int cantTriangulos = sc.nextInt();
    Triangulo triangulos[] = new Triangulo[cantTriangulos];

    for (int i = 0; i < triangulos.length; i++) {
        System.out.print("Digite la base de "+(i+1)+": ");
        double base = sc.nextFloat();
        System.out.print("Digite el lado de "+(i+1)+": ");
        double lado = sc.nextFloat();
        triangulos[i] = new Triangulo(base,lado);
    }
    
    System.out.println("\nEl triangulo con mayor superficie es "+ triangulos[getIndiceTriangulo(triangulos)].toString());

    sc.close();
}
}
