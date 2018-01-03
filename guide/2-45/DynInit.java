/**
 * Inicializacion dinamica de una variable.
 * DynInit.java
 */
public class DynInit {
    public static void main(String args[]) {
        double radius = 4, height = 5;

        //volume es inicializado dinamicamente
        double volume = 3.1416 * radius * radius * height;

        System.err.println("El volumen del cilindro es " + volume);
        
    }

    
}