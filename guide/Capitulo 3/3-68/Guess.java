/**
 * Juego de adivina la letra
 * Guess.java
 */
class Guess {
    public static void main(String args[]) throws java.io.IOException 
    {
            char ch, answer = 'K';

            System.out.println("Estoy pensando en un caracter entre la A y la Z");
            System.out.print("Puedes advinarlo? Presione una tecla y luego Intro: ");
            ch = (char) System.in.read(); //Obtiene un caracter desde el teclado

            if (ch == answer) System.out.println("Advinaste!");

    }
    
}