/**
 * Demuestra como sobrepasar un array (5-139)
 * ArrayErr.java
 */


class ArrayErr {
    public static void main(String args[]) {
        int sample[] = new int [10];
        int i;

        for(i=0; i<100; i=i+1) //Ni bien llega a 10 se produce un error al pasar ese limite
            sample[i] = i;
        
    }
    
}