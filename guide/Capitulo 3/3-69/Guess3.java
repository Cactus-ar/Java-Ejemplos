/**
 * Juego de adivinar la letra V3
 * Guess3.java
 */
class Guess3 {
    public static void main(String args[]) throws java.io.IOException 
    {
            char ch, answer = 'K';

            System.out.println("Estoy pensando en un caracter entre la A y la Z");
            System.out.print("Puedes advinarlo? Presione una tecla y luego Intro: ");
            ch = (char) System.in.read(); //Obtiene un caracter desde el teclado

            if (ch == answer) System.out.println("Advinaste!");
            else {
                System.out.print("lo siento, esa letra esta..");
                //un if anidado
                if(ch < answer) System.out.println("por debajo");
                else System.out.println("por encima");
            }
    }
    
}