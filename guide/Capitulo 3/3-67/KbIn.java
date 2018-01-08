
/**
 * Lee un caracter de la consola
 * 
 * KbIn.java
 */
class KbIn {
    public static void main(String args[]) throws java.io.IOException 
    {

            char ch;

            System.out.print("Presione una tecla y luego Intro: ");
            ch = (char) System.in.read(); //Obtiene un caracter

            System.out.println("El caracter ingresado es: " + ch);

    }
        
}