/**
 * Mostrar el ciclo de vida de una variable (2-46)
 * VarInitDemo.java
 */
class VarInitDemo {
    public static void main(String args[]) {
        int x;

        for(x = 0; x < 3; x++){
            int y = -1; //la variable es inicializada cada vez que se ejecuta el bloque
            System.out.println("y es: " + y); //siempre sera -1
            y = 100;
            System.out.println("ahora y es: " + y);
        }
        
    }

    
}