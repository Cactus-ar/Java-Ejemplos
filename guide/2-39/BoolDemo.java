/**
 * Demostracion de valores logicos (bool)
 * BoolDemo.java
 */
public class BoolDemo {
    public static void main(String args[]) {
        boolean b;

        b = false;

        System.out.println("b es " + b);

        b = true;

        System.out.println("b es " + b);

        //Una variable del tipo bool puede controlar una sentencia if
        if(b) System.out.println("Esto es ejecutado");

        b = false;
        if(b) System.out.println("Esto NO es ejecutado");

        //la salida de un operador relacional es un valor logico (bool)

        System.out.println("10 > 9 es " + (10 > 9) );
        
    }

    
}