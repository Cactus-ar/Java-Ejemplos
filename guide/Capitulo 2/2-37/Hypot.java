/**
 * Utiliza el teorema de Pitagoras
 * para encontrar el largo de la hipotenusa
 * dado el largo de los lados opuestos
 *  
 * Hypot.java
 */
class Hypot {
    public static void main(String args[]) {
        double x, y, z;

        x = 3;
        y = 4;
        
        z = Math.sqrt(x*x + y*y);

        System.out.println("La hipotenusa es " + z);
        
    }

    
}