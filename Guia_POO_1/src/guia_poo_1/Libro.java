package guia_poo_1;

import java.util.Locale;
import java.util.Scanner;

public class Libro {

    //atributos
    private long isbn;
    private int nroPaginas;
    private String titulo, autor;

    //cosntructor por parametro
    public Libro(long isbn, int nroPaginas, String titulo, String autor) {
        this.isbn = isbn;
        this.nroPaginas = nroPaginas;
        this.titulo = titulo;
        this.autor = autor;
    }

    //constructor vacío
    public Libro() {
    }

    public void getLibro() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + nroPaginas);
        System.out.println("ISBN: " + isbn);

    }

    public void setLibro() {
        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese el ISBN:");
        this.isbn = scanner.nextLong();
        System.out.println("Ingrese el número de páginas:");
        this.nroPaginas = scanner.nextInt();
        System.out.println("Ingrese el Titulo:");
        this.titulo = scanner.next();
        System.out.println("Ingrese el autor:");
        this.autor = scanner.next();

    }

}
