package guia_poo_8;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Cadena cadena = new Cadena();

        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese una frase");
        cadena.setFrase(scanner.nextLine());
        System.out.println(cadena.getLongitud());
        System.out.println(cadena.mostrarVocales());
    }

}
