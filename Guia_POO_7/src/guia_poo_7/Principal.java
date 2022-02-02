package guia_poo_7;

public class Principal {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();

        persona1.crearPersona();
        persona2.crearPersona();
        persona3.crearPersona();
        persona4.crearPersona();
        System.out.println("-----PERSONA 1-----");
        System.out.println(persona1.calcularIMC());
        System.out.println("Es mayor de edad? "+persona1.esMayorDeEdad());
        System.out.println("-----PERSONA 2-----");
        System.out.println(persona2.calcularIMC());
        System.out.println("Es mayor de edad? "+persona2.esMayorDeEdad());
    }

}
