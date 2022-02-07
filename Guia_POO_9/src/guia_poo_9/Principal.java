
package guia_poo_9;

import java.util.Locale;
import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        Matematica math = new Matematica();
        
        System.out.println("Ingrese el primer real:");
        math.setNum1(scanner.nextDouble());
        System.out.println("Ingrese el segundo real:");
        math.setNum2(scanner.nextDouble());
        System.out.println(math.devolverMayor());
        System.out.printf("%.2s%n",math.calcularPotencia());
        System.out.printf("%.2f%n",math.calculaRaiz());
    }
    
}
