/**
 * Uso de continue con etiquetas (3-96)
 * ContToLabel.java
 */
class ContToLabel {
    public static void main(String args[]) {

        outerloop:
            for(int i=0; i<10; i++) {
                System.out.print("\nPasada por fuera " + i + " , por dentro: " );
                for (int j=0; j<10; j++){
                    if (j == 5) continue outerloop; //continuar con el loop
                    System.out.print(j);
                }
            }
       
    }
    
}