package Ej_08_Poo_07_Banco;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    private Cuenta [] cuentas;


    public Cliente(String nombre, String apellido, String dni, Cuenta [] nuevaCuenta){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = nuevaCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String toString(){
        return  "Nombre: "+nombre+", Apellido: "+apellido+ ", Dni: "+dni + cuentas.toString();
    }


    /* Inicio <-- Consultar Saldo ----- ----- ----- ----- ----- ----- ----- */
    public double getConsularSaldo(int nroCuenta){
        double saldo = 0;
        for (Cuenta c : cuentas) {
            if (nroCuenta == c.getNumeroCuenta()) {
                saldo = c.getSaldo();
            }
        }
        return saldo;
    }

    public double getConsultarSaldoSimple(int nroCuenta){
        return cuentas[nroCuenta].getSaldo();
    }
    /* Fin <<<<-- Consultar Saldo ----- ----- ----- ----- ----- ----- ----- */


    /* Inicio <-- Ingresar Saldo ----- ----- ----- ----- ----- ----- ----- */
    public String ingresarSaldo(double monto, int nroCuenta){
        double saldo;
        for (Cuenta c : cuentas) {
            if (c.getNumeroCuenta() == nroCuenta && monto > 0) {
                saldo = c.getSaldo() + monto;
                c.setSaldo(saldo);
                return "Dinero ingresado, su nuevo saldo es de $" +  c.getSaldo();
            }
        }
        return "El monto ingresado debe ser mayor a 0";
    }

    public String ingresarSaldoSimple(double monto, int nroCuenta){
        double saldo;
        if (monto > 0) {
            saldo = cuentas[nroCuenta].getSaldo() + monto;
            cuentas[nroCuenta].setSaldo(saldo);
            return "Dinero ingresado, su nuevo saldo es de $" +  cuentas[nroCuenta].getSaldo();
        }
        return "El monto ingresado debe ser mayor a 0";
    }
    
    /* Fin <<<<-- Ingresar Saldo ----- ----- ----- ----- ----- ----- ----- */


    /* Inicio <-- Retirar Saldo ----- ----- ----- ----- ----- ----- ----- */
    public String retirarDinero(double monto, int nroCuenta){
        double saldo;
        for (Cuenta c : cuentas) {
            if (c.getNumeroCuenta() == nroCuenta && monto >= c.getSaldo()) {
                saldo = c.getSaldo() - monto;
                c.setSaldo(saldo);
                return "Extracción correcta, su nuevo saldo es de: $" + c.getSaldo();
            }
        }
        return "Extracción incorrecta ";
    }


    public String retirarDineroSimple(double monto, int nroCuenta){
        double saldo;
        if (monto <= cuentas[nroCuenta].getSaldo()) {
            saldo = cuentas[nroCuenta].getSaldo() - monto;
            cuentas[nroCuenta].setSaldo(saldo);
            return "Extracción correcta, su nuevo saldo es de: $" + cuentas[nroCuenta].getSaldo();
        }
        return "Extracción incorrecta ";
    }

    /* Fin <<<<-- Retirar Saldo ----- ----- ----- ----- ----- ----- ----- */
}
