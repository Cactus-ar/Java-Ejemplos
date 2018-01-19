/**
 * Promocion sorprendente! (2-61)
 * PromDemo.java
 */
class PromDemo {
    public static void main(String args[]) {
        byte b;
        int i;

        b = 10;
        i = b * b; //cast no es necesario

        b = 10;
        b = (byte) (b*b); //cast necesario!

        System.out.println("i y b: " + i + " " + b);
        
    }

    
}