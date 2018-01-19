/**
 * Prueba de un bucle do-while (3-85)
 * 
 * DWDemo.java
 */
class DWDemo {
    public static void main(String args[]) throws java.io.IOException {
        char ch;

        do {
            System.out.println("Presione una tecla y luego ENTER: ");
            ch = (char) System.in.read(); //Obtenemos la tecla
        } while (ch != 'q');
        
    }
    
}