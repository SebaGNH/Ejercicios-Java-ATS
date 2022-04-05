import java.util.Scanner;
public class Ejercicio_07 {
/*
Consturir un programa que dado un número total de horas, deuvelve el número de semanas, días y horas equivalentes.
Por ejemplo, dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas.
*/
public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);

    //Pedimos Datos
    System.out.print("\nIngrese la cantidad de horas: ");
    float cantHoras = sc.nextFloat();

    //Calculamos
    int nSemanas = (int)(cantHoras / 24)/7;

    int nDias = (int)((((cantHoras / 24)/7) - nSemanas)*7);

    int nHoras = (int)((((((cantHoras / 24)/7) - nSemanas)*7) - nDias)*24);

    //Imprimimos
    System.out.println("\nSon en total "+ nSemanas + " semanas, "+ nDias+" dias y "+ nHoras+ " horas.");

    sc.close();
}
}

/*
semanas = cantHoras / 168;
dias = cantHoras%168 /24;
horas = cantHoras%24;
*/