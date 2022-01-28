package guia_POO_4;

public class Principal {

    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo();

        rectangulo.crearRectangulo();
        System.out.printf("El área del rectangulo es: %.1f mm%n", rectangulo.calcularArea());
        System.out.printf("El perímetro del rectangulo es: %.1f mm%n", rectangulo.calcularPerimetro());
        rectangulo.dibujarRectangulo();
        

    }

}
