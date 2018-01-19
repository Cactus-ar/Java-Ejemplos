/**
 * Bucle infinito hasta que la S es ingresada (3-79)
 * ForTest.java
 */
class ForTest {
    public static void main(String args[]) throws java.io.IOException {
        int i;

        System.out.println("Presione S para salir.");

        for(i = 0; (char) System.in.read() != 'S'; i++) {
            System.out.println("Paso #" + i);
        }

    }
    
}