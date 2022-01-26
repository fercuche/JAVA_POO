package guia_POO_3;

import java.util.Locale;
import java.util.Scanner;

public class Operacion {

//atributos
    private int numero1;
    private int numero2;

//constructor vacio
    public Operacion() {
    }
//constructor parametrizado

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
//getters y setters

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

//metodos
    public void crearOperacion() {
        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el número 1:");
        this.numero1 = scanner.nextInt();
        System.out.println("Ingrese el número 2:");
        this.numero2 = scanner.nextInt();
    }

    public int sumar() {
        int suma = numero1 + numero2;
        return suma;
    }

    public int resta() {
        int resta = numero1 - numero2;
        return resta;
    }

    public int multiplicar() {
        int multiplicar;
        if (numero1 == 0 || numero2 == 0) {
            multiplicar = 0;
            System.out.println("Uno de los números era igual a 0");
        } else {
            multiplicar = numero1 * numero2;
        }
        return multiplicar;
    }

    public float dividir() {
        float dividir;
        if (numero2 == 0) {
            System.out.println("No se puede dividir por cero");
            dividir = 0;
        } else {
            dividir = numero1 / numero2;
        }
        return dividir;

    }

}
