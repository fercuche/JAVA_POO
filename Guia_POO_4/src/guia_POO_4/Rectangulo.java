package guia_POO_4;

import java.util.Locale;
import java.util.Scanner;

public class Rectangulo {

    //atributos
    private float base;
    private float altura;
//constructor con parámetros

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
//constructor vacio

    public Rectangulo() {
    }

//getters y setters
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

//metodos
    public void crearRectangulo() {
        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese la base del rectángulo en mm:");
        this.base = scanner.nextFloat();
        System.out.println("Ingrese la altura del rectángulo en mm:");
        this.altura = scanner.nextFloat();
    }

    public float calcularArea() {
        float area = base * altura;
        return area;
    }

    public float calcularPerimetro() {
        float perimetro = 2 * (base + altura);
        return perimetro;
    }

    public void dibujarRectangulo() {
        for (int fila = 1; fila <= altura; fila++) {
            for (int columna = 1; columna <= base; columna++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
