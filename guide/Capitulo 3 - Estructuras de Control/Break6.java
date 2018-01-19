/**
 * Donde colocar las etiquetas es importante (3-94)
 * Break6.java
 */
class Break6 {
    public static void main(String args[]) {
        int x=0, y=0;

        //Aqui la etiqueta esta antes que la sentencia
        stop1: for(x=0; x<5; x++){
                    for (y=0; y<5; y++){
                        if (y == 2) break stop1;
                        System.out.println("x e y: " + x + " " + y);
                    }
                }
                System.out.println();
        //ahora la etiqueta esta inmediatamente antes de {
                for(x=0; x < 5; x++)
        stop2: {

                for(y=0; y<5; y++) {
                    if (y == 2) break stop2;
                    System.out.println("x e y: " + x + " " + y);
                }
        } 

    }
    
}