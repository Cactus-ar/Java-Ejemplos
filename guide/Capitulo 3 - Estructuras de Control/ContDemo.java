/**
 * Uso de continue (3-96)
 * ContDemo.java
 */
class ContDemo {
    public static void main(String args[]) {
        int i;

        //imprime los numeros pares del 0 al 100
        for (i=0; i<100; i++) {
            if ((i%2) !=0) continue;
            System.out.println(i);
        }
        
    }
    
}