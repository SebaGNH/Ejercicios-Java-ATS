package Ej_08_Poo_07_Banco;
import java.util.Scanner;
public class AppMainConsole {

public static int buscarNumeroCuenta(Cuenta cuentas[], int numeroCuenta){
    int i = 0, indice = -1;
    boolean encontrado = false;
    for (Cuenta cuenta : cuentas) {        
        while ( (i < cuentas.length) && encontrado == false) {
            //Busqueda secuencial
            if (numeroCuenta == cuentas[i].getNumeroCuenta()) {
                encontrado = true;
                indice = i;
            }
            i++;
        }
    }
    return indice;
}

public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);

    Cliente clientes;
    Cuenta cuentas[];

    String nombre, apellido, dni;
    int cantCuentas, numeroCuenta, menu;
    double saldo;


    System.out.print("Ingrese el nombre del cliente: ");
    nombre = sc.nextLine();
    System.out.print("Indique el apellido: ");
    apellido = sc.nextLine();
    System.out.print("ingrese el DNI: ");
    dni = sc.nextLine();
    System.out.print("Indique la cantidad de cuentas que va a agregar: ");
    cantCuentas = sc.nextInt();
    cuentas = new Cuenta[cantCuentas];



    for (int i = 0; i < cuentas.length; i++) {
        System.out.print((i+1)+". Ingrese el número de cuenta: ");
        numeroCuenta = sc.nextInt();
        System.out.print((i+1)+". Registre el saldo inicial para la cuenta "+ numeroCuenta+": ");
        saldo = sc.nextDouble();
        cuentas[i] = new Cuenta(numeroCuenta, saldo);
    }

    clientes = new Cliente(nombre, apellido, dni, cuentas); // al ingresar solo cuentas hace referencia al arreglo compleo, por eso no se ponen posiciones

    
    do {
        System.out.println("\n.:Menu:.");
        System.out.println("1. Ingresar dinero en la cuenta.");        
        System.out.println("2. Retirar dinero de la cuenta.");        
        System.out.println("3. Consultar dinero de la cuenta.");        
        System.out.println("4. Salir");
        menu = sc.nextInt();

        switch (menu) {
            case 1:
                    System.out.print("Ingrese el número de la cuenta a la que quiere ingresar saldo: ");
                    numeroCuenta = sc.nextInt();

                    if (buscarNumeroCuenta(cuentas, numeroCuenta) == -1) {
                        System.out.println("El número de cuenta ingresado no existe");
                    } else {
                        System.out.print("Ingrese el monto ue va a cargar: ");
                        saldo = sc.nextDouble();
                        System.out.println(clientes.ingresarSaldoSimple(saldo, buscarNumeroCuenta(cuentas, numeroCuenta)));                        
                    }
                break;
            case 2:
                    System.out.print("Ingrese el número de la cuenta a la que quiere extraer saldo: ");
                    numeroCuenta = sc.nextInt();

                    if( buscarNumeroCuenta(cuentas, numeroCuenta) == -1 ){
                        System.out.println("El número de cuenta ingresado no existe");

                    }else{
                        System.out.print("Ingrese el monto ue va a extraer: ");
                        saldo = sc.nextDouble();
                        System.out.println(clientes.retirarDineroSimple(saldo, buscarNumeroCuenta(cuentas, numeroCuenta)));
                    }
                break;
            case 3:
                    System.out.print("Indique el número de cuenta de la cual quiere consultar el saldo: ");
                    numeroCuenta = sc.nextInt();
                    if(buscarNumeroCuenta(cuentas, numeroCuenta) == -1){
                        System.out.println("El número de cuenta ingresado no existe");
                    }else {
                        System.out.println(clientes.getConsultarSaldoSimple(numeroCuenta));
                    }
                break;
        }

    } while (menu != 4);

    System.out.println("\n.:Fin del Programa:.");




    
    sc.close();
}
}
