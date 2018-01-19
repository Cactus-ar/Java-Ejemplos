/**
 * Muestra el uso de la conversion automatica de logn a double (2-56)
 * LtoD.java
 */
class LtoD {
    public static void main(String args[]) {
        long L;
        double D;

        L = 100123285L;
        D = L; //conversion automatica

        System.out.println("L y D: " + L + " " + D);
        
    }

    
}

/* Este ejemplo no compilara

class LtoD {
    public static void main(String args[]) {
        long L;
        double D;

        D = 100123285.0;
        L = D; //es ilegal!!

        System.out.println("L y D: " + L + " " + D);
        
    }

    
}

*/
