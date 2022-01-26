package guia_poo_2;

import java.util.Locale;
import java.util.Scanner;

public class Circunferencia {

    //atributos
    private double radio;

    //constructor por parametro
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    //getter
    public double getRadio() {
        return radio;
    }

    //setter
    public void setRadio(double radio) {
        this.radio = radio;
    }

    //metodos
    public void crearCircunferencia() {

        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el radio");
        this.radio = scanner.nextDouble();
    }

    public void Area() {

        double area = 3.14 * radio * radio;
        System.out.printf("El área de la circunferencia es: %.1f %n", area);
    }

    public void Perimetro() {

        double perimetro = 2 * 3.14 * radio;
        System.out.printf("El perímetro de la circunferencia es: %.1f %n", perimetro);
    }

}
