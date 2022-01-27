package guia_poo_2;

public class Principal {

    public static void main(String[] args) {

        Circunferencia circunf = new Circunferencia();
        //Circunferencia circunf2 = new Circunferencia();

        circunf.crearCircunferencia();
        System.out.println("-----------------------");
        System.out.println("Circunferencia:");
        circunf.Area();
        circunf.Perimetro();
        System.out.println("-----------------------");

    }

}
