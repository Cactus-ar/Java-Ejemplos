/**
 * El bucle for-each es escencialmente de solo lectura (5-156)
 * NoChange.java
 */
class NoChange {
    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
     
        for(int X : nums) {
            System.out.print(X + " ");
            X = X * 10; //no afecta a nums
        }

        System.out.println();

        for(int X:nums)
            System.out.print(X + " ");

    System.out.println();
        
    }
   
}