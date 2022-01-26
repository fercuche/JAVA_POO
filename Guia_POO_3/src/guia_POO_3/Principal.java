
package guia_POO_3;
import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) {
        
        Operacion operacion = new Operacion();
        
        operacion.crearOperacion();
        System.out.println("La suma de los numeros es "+(operacion.sumar()));
        System.out.println("La resta de los números es "+ operacion.resta());
        System.out.println("La multiplicacion de los números es: " + operacion.multiplicar());
        System.out.println("La division de los números es: "+ operacion.dividir());
        
        
            
        
    }
    
}
