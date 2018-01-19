/**
 * Este programa contiene un error (3-94)
 * 
 * BreakErr.java
 */
class BreakErr {
    public static void main(String args[]) {

        one: for (int i=0; i<3; i++) {
            System.out.println("Paso " + i + ": ");
        }
        
        for (int j=0; j<100; j++) {
            if (j == 10) break one: //ERROR
            System.out.println(j + " ");
        }
    }
}