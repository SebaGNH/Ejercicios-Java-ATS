package Ej_08_Poo_07_Banco;

public class Cuenta{
    private int numeroCuenta;
    private double saldo;

    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setSaldo (double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String toString(){
        return ", Número de cuenta: "+ numeroCuenta + ", Saldo: $"+ saldo;
    }
}