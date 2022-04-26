package Ej_08_Poo_07_Banco;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    private Cuenta [] cuentas;


    public Cliente(String nombre, String apellido, String dni, int numeroCuenta){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = new Cuenta[numeroCuenta];
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

    public void agregarCuenta(Cuenta nuevaCuenta){
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] != null) {
                cuentas[i] = nuevaCuenta;
                break;
            }
        }
    }

    public double getConsularSaldo(int nroCuenta){
        double saldo = 0;
        for (Cuenta c : cuentas) {
            if (nroCuenta == c.getNumeroCuenta()) {
                saldo = c.getSaldo();
            }
        }
        return saldo;
    }

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

}














//---------------------------------------------------

/*     @Override
    public String toString(){
        return super.toString()+", Nombre: "+nombre+", Apellido: "+apellido+ ", Dni: "+dni; 
    } */



/*     public String ingresarDinero(double monto){
        if (monto > 0) {
            double saldo = super.getSaldo() + monto;
            super.setSaldo(saldo);
            return "Dinero ingresado, su nuevo saldo es de $" + super.getSaldo();

        }
        return "El monto ingresado debe ser mayor a 0";
    }

    public String retirarDinero(double monto){
        if (monto < super.getSaldo()) {
            double saldo = super.getSaldo() - monto;
            super.setSaldo(saldo);
            return "Extracción correcta, su nuevo saldo es de: $" + super.getSaldo();

        }
        return "Extracción incorrecta, su saldo disponible es de: $" + super.getSaldo();
    } */
