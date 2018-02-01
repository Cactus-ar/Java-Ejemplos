/**
 * Dimensionar el tamaño de la segunda dimension en un array (5-143)
 * 
 * Ragged.java
 */
class Ragged {
    public static void main(String args[]) {

        int riders [][] = new int [7][];

        riders[0] = new int [10];
        riders[1] = new int [10];
        riders[2] = new int [10];
        riders[3] = new int [10];
        riders[4] = new int [10];
        riders[5] = new int [10];
        riders[6] = new int [10];

        int i, j;
        //crear datos de prueba
        for (i=0; i<5; i++)
            for(j=0; j<10; j++)
                riders [i][j] = i + j + 10;
        for(i=5; i<7; i++)
            for(j=0; j<2; j++)
                riders [i][j] = i + j + 10;
        
        System.out.println("Pasajeros por viaje durante esta semana:");
        for (i=0; i<5; i++) {
            for (j=0; j<10; j++)
            System.out.print(riders[i] [j] + " ");
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Pasajeros por viaje durante el fin de semana:");
        for(i=5; i<7; i++) {
            for (j=0; j<2; j++)
            System.out.print(riders[i] [j] + " ");
            System.out.println();
        }
        
    }
    
}