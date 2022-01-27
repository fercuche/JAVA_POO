package guia_poo_1;

public class Principal {

    public static void main(String[] args) {

        Libro libro = new Libro();

        libro.cargarLibro();
        System.out.println("------------------------------------------");
        libro.mostrarLibro();
        System.out.println("------------------------------------------");
    }

}
