package guia_poo_5;

import java.util.Locale;
import java.util.Scanner;

public class Cuenta {

    Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    private int numeroCuenta;
    private long dni;
    private long saldoActual;

    public Cuenta(int numeroCuenta, long dni, long saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
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

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public long getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(long saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void crearCuenta() {
        System.out.println("Ingrese su número de cuenta: ");
        numeroCuenta = scanner.nextInt();
        System.out.println("Ingrese su DNI: ");
        dni = scanner.nextLong();
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
            System.out.println("Usted retiro: " + retiro + ",y su saldo actual es: $" + saldoActual);
            return this.saldoActual;
        } else {
            System.out.println("Ha excedido el límite del día.");
            return retiro;
        }
    }

    public void consultarSaldo() {
        System.out.println("Su saldo actual es de: $" + saldoActual);
    }

    public void consultarDatos() {
        System.out.println("Su número de cuenta es: " + numeroCuenta);
        System.out.println("Su DNI es: " + dni);
    }

    public void menu() {
        int opcion;

        do {
            System.out.println("------------------------------");
            System.out.println("Ingrese que desea hacer en su cuenta");
            System.out.println("1.  Ingresar dinero a la cuenta.");
            System.out.println("2.  Retirar dinero de la cuenta.");
            System.out.println("3.  Retire una extración rápida del dinero de su cuenta.");
            System.out.println("4.  Consultar su saldo actual.");
            System.out.println("5.  Consultar sus datos.");
            System.out.println("6.  Salir.");
            System.out.println("------------------------------");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Escriba el monto a ingresar: ");
                    long monto = scanner.nextLong();
                    ingresar(monto);
                    System.out.println("El saldo actual es: $" + saldoActual);
                    break;
                case 2:
                    System.out.println("Escriba el monto a retirar: ");
                    long sacar = scanner.nextLong();
                    retirar(sacar);
                    System.out.println("El saldo actual es: $" + saldoActual);
                    break;
                case 3:
                    System.out.println("Escriba el monto a extraer: ");
                    long extraccion = scanner.nextLong();
                    extraccionRapida(extraccion);
                    break;
                case 4:
                    consultarSaldo();
                    break;
                case 5:
                    consultarDatos();
                    break;

            }
        } while (opcion != 6);
    }
}
