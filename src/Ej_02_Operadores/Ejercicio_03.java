
import java.util.Scanner;
public class Ejercicio_03 {


        public static void main(String[] args) throws Exception{

            Scanner sc = new Scanner(System.in);

            System.out.print("Ingrese la cantidad de dolares que tiene Guillermo: ");
            float guillermo = sc.nextFloat();

            float luis = guillermo /2;

            float juan = (guillermo + luis ) / 2;

            float suma = guillermo + luis + juan;
            System.out.println("\nEl dinero que tiene los 3 es "+ suma);
        }
}
