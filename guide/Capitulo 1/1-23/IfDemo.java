/**
 * Demuestra el usi de la sentencia If
 * Renombre este archivo IfDemo
 */
public class IfDemo {
    public static void main(String args[]) {
        int a, b, c;

        a = 2;
        b = 3;

        if (a < b) System.out.println("a es menor a b");

        //esto no mostrara nada
        if (a == b) System.out.println("no podr�s ver esto");

        System.out.println();
        
        c = a - b; //c contiene -1

        System.out.println("c contiene -1");
        if(c >= 0) System.out.println("c no es negativo");
        if(c < 0) System.out.println("c es negativo");

        System.out.println();

        c = b - a; //c ahora contiene un 1

        System.out.println("c contiene 1");
        if(c >= 0) System.out.println("c no es negativo");
        if(c < 0) System.out.println("c es negativo");

    }

    
}