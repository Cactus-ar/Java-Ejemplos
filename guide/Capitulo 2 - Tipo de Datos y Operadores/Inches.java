/**
 * Inches.java 
 * Calcula la cantidad de pulgadas cubicas
 * en una milla cubica (2-36)
 */
class Inches {
    public static void main(String args[]) {
        long ci;
        long im;

        im = 5280 * 12; //!!

        ci = im * im * im;

        System.out.println("Hay " + ci + " pulgadas cubicas en una milla cubica.");
        
        
    }

    
}