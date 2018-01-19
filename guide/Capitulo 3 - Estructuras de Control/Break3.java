/**
 * Uso de break con bucles anidados (3-91)
 * 
 * Break3.java
 */
class Break3 {
    public static void main(String args[]) {

        for (int i=0; i<3; i++){
            System.out.println("bucle fuera del nido:" + i);
            System.out.print("      bucle dentro del nido: ");

            int t = 0;
            while (t<100) {
                if(t == 10) break; //Terminar el loop si llega a 10
                System.out.print( t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("bucle completo.");
    }
    
}