/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();    
 */
package guia_poo_11;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Calendar calendario = new GregorianCalendar();
        Calendar calendarioActual = new GregorianCalendar();

        //creo las variables de dia, mes y año y le pido al usuario que ingrese
        //los datos
        System.out.println("Ingrese el dia:");
        int dia = scanner.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el año:");
        int year = scanner.nextInt();

        //instancio 2 fechas (una con la fecha ingresada por el usuario
        // y la otra es la actual) y las imprimo
        calendario.set(year, mes, dia);
        //Date fecha = new Date((year - 1900), mes, dia);
        Date fechaActual = new Date();
        calendarioActual.setTime(fechaActual);
        System.out.println(calendario.getTime());
        System.out.println(calendarioActual.getTime());

        //diferencia de años
        int diferenciaAnios = Math.abs(calendario.get(Calendar.YEAR) - calendarioActual.get(Calendar.YEAR));
        //System.out.printf("Hay %d años entre %d y %d.%n", diferenciaAnios, fecha.getYear() + 1900, fechaActual.getYear() + 1900);
        System.out.println("La diferencia en años es de: " + diferenciaAnios);
    }

}
