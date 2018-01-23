/**
 * Bucles anidados para determinar el factoreo de numeros hasta el 100
 * FindFac.java (3-101)
 */
class FindFac {
    public static void main(String args[]) {
        for(int i=0; i <= 100; i++) {
            System.out.print("Factores de " + i + ": ");
            for (int j=2; j < i; j++) 
                if((i%j) == 0) System.out.print(j + " ");
            System.out.println();
        }
        
    }
    
}