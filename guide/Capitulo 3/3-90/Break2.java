/**
 * Bucle infinito hasta que una "q" es ingresada
 * 
 * Break2.java
 */
class Break2 {
    public static void main(String args[]) throws java.io.IOException {

        char ch;

        for ( ; ; ){
            ch = (char) System.in.read(); //obtiene un caracter
            if (ch == 'q') break;
        }
        System.out.println("se ha presionado q!");
    }

    
}