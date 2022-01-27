package guia_poo_5;

import java.util.Locale;
import java.util.Scanner;

public class Cuenta {

    private int numeroCuenta;
    private long DNI;
    private long saldoActual;

    public Cuenta(int numeroCuenta, long DNI, long saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public Cuenta() {
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public long getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(long saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void crearCuenta() {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese su número de cuenta: ");
        this.numeroCuenta = scan.nextInt();
        System.out.println("Ingrese su Dni: ");
        this.DNI = scan.nextLong();
    }

    public double ingresar(double ingreso) {
        return this.saldoActual += ingreso;
    }

    public double retirar(double retiro) {
        if (this.saldoActual >= retiro) {
            return this.saldoActual -= retiro;
        } else {
            return this.saldoActual = 0;
        }
    }

    public double extraccionRapida(double retiro) {
        if (retiro < (this.saldoActual * 0.2)) {
            this.saldoActual -= retiro;
            System.out.println("Usted retiro: " + retiro + ",y su saldo actual es: " + this.saldoActual);
            return this.saldoActual;
        } else {
            System.out.println("Ha excedido el límite del día.");
            return retiro;
        }
    }
    
    public void consultarSaldo(){
        System.out.println("Su saldo actual es de: " + saldoActual);
    }
    public void consultarDatos(){
        System.out.println("Su número de cuenta es: " + numeroCuenta);
        System.out.println("Su DNI es: " + DNI);
    }
}
