
package Ej_08_Poo_04_Competencia_Atletismo;

import java.util.Scanner;

public class AppMainConsole {


    public static int getIndiceMenorTiempo(Atleta atletas[]){        
        int indice = 0;
        int menorTiempo = atletas[0].getTiempo();
        
        for (int i = 1; i < atletas.length; i++) {
            if (atletas[i].getTiempo() < menorTiempo) {
                menorTiempo = atletas[i].getTiempo(); //Ahora este es el nuevo menor tiempo
                indice = i;
            }
        }
        return indice;
    }



public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Cuantos atletas desea cargar? ");
    int cantAtletas = sc.nextInt();
    //Creamos los objetos para cada atleta
    Atleta atletas[] = new Atleta[cantAtletas];

    for (int i = 0; i < atletas.length; i++) {
        System.out.print("Ingrese el numero del atleta "+(i+1)+": ");
        int numero = sc.nextInt();

        System.out.print("Ingrese el nombre del atleta "+(i+1)+": ");
        String nombre = sc.next();

        System.out.print("Ingrese el tiempo del atleta "+(i+1)+": ");
        int tiempo = sc.nextInt();

        atletas[i] = new Atleta(numero,nombre,tiempo);
    }

    System.out.println("\nEl atleta con mejor tiempo es "+ atletas[getIndiceMenorTiempo(atletas)].toString());
    
    sc.close();
}
}
