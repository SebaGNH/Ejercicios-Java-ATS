import java.util.Scanner;
public class Ejercicio_02 {
/*
Hacer un programa que calcule e imprima el salario semanal de un empelado a partir de sus horas semanales trabajadas y de su salario por hora
*/

public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese la cantidad de horas trabajadas");
    float cantHorasTrabajadas = sc.nextFloat();

    System.out.println("Ingrese el monto que se paga por cada hora");
    float montoHora = sc.nextFloat();

    float suma = cantHorasTrabajadas * montoHora;
    System.out.println("\nSalario semanal: $"+suma);

    sc.close();
}
}
