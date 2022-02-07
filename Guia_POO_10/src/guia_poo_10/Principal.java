/*
 Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */
package guia_poo_10;

import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        

        //llenar y mostrar el arreglo A
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = Math.round(Math.random() * 999);
        }
        System.out.println(Arrays.toString(arregloA));

        //ordenar el arreglo A de menor a mayor
        Arrays.sort(arregloA);
        System.out.println(Arrays.toString(arregloA));

        //llenar el arreglo B con los primeros 10 numeros del arreglo A ordenado
        //y los ultimos 10 con 0.5
        arregloB = Arrays.copyOf(arregloA, 20);
        Arrays.fill(arregloB, 10, 20, 0.5);
        System.out.println(Arrays.toString(arregloB));

    }

}
