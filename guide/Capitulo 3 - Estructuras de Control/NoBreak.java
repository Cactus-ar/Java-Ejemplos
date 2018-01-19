/**
 * Demuestra el uso de switch sin el break (3-73)
 * NoBreak.java
 */
class NoBreak {
    public static void main(String args[]) {
        int i;

        for(i=0; i<5; i++){
            switch(i){
                case 0:
                    System.out.println("i es menor a uno");
                case 1:
                    System.out.println("i es menos que dos");
                case 2:
                    System.out.println("i es menor a tres");
                case 3:
                    System.out.println("i es menor a cuatro");
                case 4:
                    System.out.println("i es menor a cinco");
            }

            System.out.println();

        }
        
    }

    
}