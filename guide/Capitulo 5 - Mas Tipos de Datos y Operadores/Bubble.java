/**
 * Ordena los valores dentro de un array unidimensional o bubble sort (5-141)
 * Bubble.java
 */
class Bubble {
    public static void main(String args[]) {
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};

        int a, b, t;
        int size;

        size = 10; //Cantidad de elementos dentro del array

        //muestra el array original
        System.out.print("El array es: ");
        for(int i=0; i<size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

        //este es el array ordenado
        for(a=1; a < size; a++)
            for(b=size-1; b >= a; b--) { 
                if (nums[b-1] > nums[b]) { //intercambia los lugares si no se cumple
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        // muestra el array ordenado
        System.out.print("El array ordenado es: ");
        for(int i=0; i<size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }
    
}