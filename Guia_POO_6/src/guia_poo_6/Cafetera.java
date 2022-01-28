package guia_poo_6;

import java.util.Locale;
import java.util.Scanner;

public class Cafetera {

    Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    //atributos
    private int capacidadMaxima;
    private int capacidadActual;

    //constructor vacio
    public Cafetera() {
    }

    //constructor parametrizado
    public Cafetera(int capacidadMaxima, int capacidadActual) {
        this.capacidadActual = capacidadActual;
        this.capacidadMaxima = capacidadMaxima;
    }

    //getters y setters
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    //metodos
    public void llenarCafetera() {
        capacidadActual = capacidadMaxima;
    }

    public void servirTaza(int tamaño){
        System.out.println("Ingrese la medida deseada de la taza:");
        tamaño = scanner.nextInt();
        if (tamaño<capacidadActual){
            System.out.printf("La taza se llenó.%nLa cafetera quedó con %d de café%n", capacidadActual);
        }else{
            System.out.printf("La taza no se llenó, quedó con una cantidad de %d de café.%n", capacidadActual);
        }

    }

    public void vaciarCafetera() {
        capacidadActual = 0;
        System.out.println("La cafetera está vacía");
    }

    public void agregarCafe(int cafe) {
        System.out.println("Ingrese la cantidad de café a agregar:");
        cafe = scanner.nextInt();
        capacidadActual += cafe;
        System.out.println("La capacidad actual de la cafetera es de: "+capacidadActual);
    }
}
