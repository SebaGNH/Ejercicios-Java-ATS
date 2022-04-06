package EJ_03_Condicionales;

import java.util.Scanner;

public class Ejercicio_05_C {
/*
Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
Si trabaja 40hs o menos se le paga $16 por hora,
si trabaja más de 40hs se le paga $16 por cada una de las primeras 40 hs y $20 por cada hora extra
*/
public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Ingrese la cantidad de horas trabajadas: ");
    float cantHoras = sc.nextFloat();
    float salario = 0;
    
    if (cantHoras <= 40) {
        salario = 16 * cantHoras;
    }else if (cantHoras > 40) {
        salario = (16 * 40) + ((cantHoras - 40) * 20);
    }

    System.out.println("El salario es de: $"+ salario);
    sc.close();
}
}
