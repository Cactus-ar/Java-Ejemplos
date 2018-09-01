/**
 * bucle esticlo for-each en arrays de dos dimesiones (5-157)
 * ForEach2.java
 */
class ForEach2 {
    public static void main(String args[]) {
        int sum = 0;
        int nums[][] = new int[3][5];

        //poblar el array con algunos numeros
        for(int i=0; i<3; i++)
            for(int j=0; j<5; j++)
                nums[i][j] = (i+1)*(j+1);
        
        //empleo del bucle "for-each" para visualizar los valores y su suma
        for(int x[]: nums) {
            for (int y : x) {
                System.out.println("El valor es: " + y);
                sum += y;
            }
        }

        System.out.println("La sumatoria es: "+ sum);
        
    }

    
}