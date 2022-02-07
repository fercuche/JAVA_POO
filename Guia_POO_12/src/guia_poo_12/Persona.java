package guia_poo_12;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Persona {

    private Date fechaActual;

    //atributos
    private String nombre;
    private Date fechaDeNacimiento;
    //private Date fechaActual;

    //constructor vacio
    public Persona() {
        this.fechaActual = new Date();

    }

    //constructor parametrizado
    public Persona(String nombre, Date fechaDeNacimiento, Date fechaActual) {
        this.fechaActual = new Date();
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.fechaActual = fechaActual;
    }

    //getters y setters
    public Date getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(Date fechaActual) {
        this.fechaActual = fechaActual;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    //metodos
    public void crearPersona() {
        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese el nombre de la persona");
        nombre = scanner.nextLine();
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.println("Ingrese el dia: ");
        int dia = scanner.nextInt();
        System.out.println("Ingrese el mes: ");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el año: ");
        int anio = scanner.nextInt();
        Date dob = new Date(anio - 1900, mes, dia);
        fechaDeNacimiento = dob;
    }

    public void calcularEdad() {

        System.out.printf("La persona tiene %d años. \n", fechaActual.getYear() - fechaDeNacimiento.getYear());
    }

    public boolean menorQue(int edad) {
        int edadActual = fechaActual.getYear() - fechaDeNacimiento.getYear();
        return edadActual < edad;
    }

    public void mostrarPersona() {
        //int edadActual = fechaActual.getYear() - fechaDeNacimiento.getYear();
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Nacimiento: " + fechaDeNacimiento.toLocaleString());
        System.out.println("Edad: " + (fechaActual.getYear() - fechaDeNacimiento.getYear()));
    }
}
