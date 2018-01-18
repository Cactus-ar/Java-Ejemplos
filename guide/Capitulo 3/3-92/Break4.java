/**
 * Uso de break con etiquetas
 * 
 * Break4.java
 */
class Break4 {
    public static void main(String args[]) {

        int i;
        
        for( i = 1; i < 4; i++ ){
    one:    {
    two:        {
    three:          {
                        System.out.println("\ni es " + i);
                        if(i == 1) break one;
                        if(i == 2) break two;
                        if(i == 3) break three;

                        //Este punto no es alcanzado
                        System.out.println("no alcanzado");
                    }
                    System.out.println("Luego del bloque three.");
                }
                System.out.println("Luego del bloque two.");
            }
            System.out.println("Luego del bloque one.");
        }
        System.out.println("fuera del bucle");
    }
    
}