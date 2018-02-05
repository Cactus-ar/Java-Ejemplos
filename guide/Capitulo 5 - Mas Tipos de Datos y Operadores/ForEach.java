/**
 * Utilizacion de un loop estilo "for-each" (5-155)
 * ForEach.java
 */
class ForEach {
    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for(int X : nums) {
            System.out.println("El valor es: " + X);
            sum += X;
        }

        System.out.println("La sumatoria: " + sum);
        
    }
    
}