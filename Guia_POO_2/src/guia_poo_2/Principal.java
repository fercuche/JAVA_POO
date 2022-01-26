package guia_poo_2;

public class Principal {

    public static void main(String[] args) {

        Circunferencia circunf1 = new Circunferencia();
        Circunferencia circunf2 = new Circunferencia();

        circunf1.crearCircunferencia();
        circunf2.crearCircunferencia();
        System.out.println("-----------------------");
        System.out.println("Circunferencia 1:");
        circunf1.Area();
        circunf1.Perimetro();
        System.out.println("Circunferencia 2:");
        circunf2.Area();
        circunf2.Perimetro();
        System.out.println("-----------------------");

    }

}
