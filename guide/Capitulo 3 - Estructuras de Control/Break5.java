/**
 * Otro ejemplo de break con etiquetas (3-93)
 * Break5.java
 */
class Break5 {
    public static void main(String args[]) {
    
    done:
        for (int i=0; i<10; i++){
            for(int j=0; i<10; j++){
                for(int k=0; i<10; k++){
                    System.out.println(k + " ");
                    if (k == 5) break done; //saltar hasta done
                }
                System.out.println("Antes del loop k"); //no ejecutara
            }
            System.out.println("antes del loop j"); //no ejecutara
        }
        System.out.println("Antes del loop i");
    }
    
}