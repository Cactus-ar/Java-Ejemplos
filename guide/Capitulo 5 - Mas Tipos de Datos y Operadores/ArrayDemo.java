/**
 * uso de arrays de una sola dimension (5-137)
 * ArrayDemo.java
 */
class ArrayDemo {
    public static void main(String args[]) {
        int sample[] = new int[10];
        int i;

        for (i=0; i<10; i = i+1)
            sample[i] = i;
        
        for (i = 0; i<10; i =i+1)

        System.out.println("Esta es la muestra [" + i + "]: " + sample[i]);
        
    }
    
}