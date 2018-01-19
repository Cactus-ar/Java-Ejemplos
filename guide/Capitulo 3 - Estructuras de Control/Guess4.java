/**
 * Adivinar la letra version 4 (3-85)
 * 
 * Guess4.java
 */
class Guess4 {
    public static void main(String args[]) throws java.io.IOException {
        char ch, ignore, answer = 'K';

        do {
            System.out.println("Estoy pensando una letra entre la A y la Z");
            System.out.print("Puedes adivinarla?: ");

            //leer el caracter de la entrada
            ch = (char) System.in.read();

            //descartar cualquier otro caracter del buffer de entrada
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) System.out.println ("** Acertaste **");
            else {
                System.out.println("lo siento, estas ");
                if (ch < answer) System.out.println("muy abajo");
                else System.out.println("muy arriba");

                System.out.println("Intenta nuevamente \n");
            }
            
        } while (answer != ch);
        
    }
    
}