package guia_poo_5;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cuenta cuenta = new Cuenta();

        cuenta.crearCuenta();

        int opcion;

        do {
            System.out.println();
            System.out.println("Ingrese que desea hacer en su cuenta.");
            System.out.println();
            System.out.println("1.  Ingresar dinero a la cuenta.");
            System.out.println("2.  Retirar dinero de la cuenta.");
            System.out.println("3.  Retire una extración rápida del dinero de su cuenta.");
            System.out.println("4.  Consultar su saldo actual.");
            System.out.println("5.  Consultar sus datos.");
            System.out.println("6.  Salir.");
            opcion = scan.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Escriba el monto a ingresar: ");
                    long monto = scan.nextLong();
                    cuenta.ingresar(monto);
                    break;
                case 2:
                    System.out.println("Escriba el monto a retirar: ");
                    long sacar = scan.nextLong();
                    cuenta.retirar(sacar);
                    break;
                case 3:
                    System.out.println("Escriba el monto a extraer: ");
                    long extraccion = scan.nextLong();
                    cuenta.extraccionRapida(extraccion);
                    break;
                case 4:
                    cuenta.consultarSaldo();
                    break;
                case 5:
                    cuenta.consultarDatos();
                    break;

            }
        } while (opcion != 6);
    }

}


 