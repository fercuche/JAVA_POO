/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package guia_poo_8;

public class Cadena {

    //atributos
    private String frase;
    private int longitud;

    //constructor parametrizdo
    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    //constructor vacio
    public Cadena() {
    }

    //getters y setters
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        longitud = frase.length();
        //this.setLongitud(frase.length());
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = frase.length();
    }

    //metodos
    public int mostrarVocales() {
        int cantidad = 0;
        for (int i = 0; i < longitud; i++) {
            String letra = frase.substring(i, i + 1);
            switch (letra) {
                case "a":
                    cantidad++;
                    break;
                case "e":
                    cantidad++;
                    break;
                case "i":
                    cantidad++;
                    break;
                case "o":
                    cantidad++;
                    break;
                case "u":
                    cantidad++;
                    break;
            }
        }
        return cantidad;
        /*public int mostrarVocales(){
        int cantidad=0;
        String letra;
        for (int i=0; i<longitud;i++){
            letra = frase.substring(i, i+1);
            if (letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")){
                cantidad++;
            }
        }
        return cantidad;
    }*/
    }

    public void invertirFrase() {
        
    }

    public void vecesRepetido(String letra) {

    }

    public void compararLongitud(String letra) {

    }

    public void unirFrase() {

    }

    public void reemplazar(String letra) {
        frase = frase.replace("a", letra);
    }

    public boolean contiene(String letra) {
        return frase.contains(letra);
    }

}
