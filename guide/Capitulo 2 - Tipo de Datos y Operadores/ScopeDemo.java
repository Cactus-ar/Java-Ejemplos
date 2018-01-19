/**
 * Demostrar la visibilidad de las variables (2-46)
 * 
 * ScopeDemo.java
 */
class ScopeDemo {
    public static void main(String args[]) {
        int x; //es visible dentro de todo el bloque de codigo main

        x = 10;

        if(x == 10){ //un nuevo bloque de codigo
            int y = 20; //solamente visible dentro del bloque

            // x e y son visibles aqui
            System.out.println("x e y: " + x + " " + y);
            x = y * 2;
        }

        // y = 100; //Error! y no es conocido en este ambito
        // x si lo es
        System.out.println("x es " + x);
        
    }

    
}