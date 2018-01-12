/**
 * Calcular la potencia de 2
 * Power.java
 */
class Power {
    public static void main(String args[]) {
        int e;
        int result;

        for(int i=0; i<10; i++) {
            result = 1;
            e = i;
            while (e > 0) {
                result *=2;
                e--;
            }

            System.out.println("2 a la potencia " + i + " es igual a " + result);

        }
        
    }
    
}