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
    
    //getters y setters

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    

    //metodos
    public void mostrarLibro() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + nroPaginas);
        System.out.println("ISBN: " + isbn);

    }

    public void cargarLibro() {
        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese el ISBN:");
        isbn = scanner.nextLong();
        System.out.println("Ingrese el número de páginas:");
        nroPaginas = scanner.nextInt();
        System.out.println("Ingrese el Titulo:");
        titulo = scanner.next();
        System.out.println("Ingrese el autor:");
        autor = scanner.next();

    }

}
