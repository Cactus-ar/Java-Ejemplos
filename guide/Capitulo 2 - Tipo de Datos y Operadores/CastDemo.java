/**
 * Demostracion de casting o conversion de tipos de variables (2-57)
 * 
 * CastDemo.java
 */
class CastDemo {
    public static void main(String args[]) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x/y); //cast de double a int
        System.out.println("Conversion a integer de x/y: " + i);

        i= 100;
        b = (byte) i; //No hay perdida de datos aqui. Las variables byte pueden contener el valor 100
        System.out.println("Valor de b: " + b);

        i = 257;
        b = (byte) i; //Aqui se pieden datos. byte no puede contener el valor 257
        System.out.println("Valor de b: " + b);

        b = 88; //codigo ascii para el caracter X
        ch = (char) b;
        System.out.println("ch: " + ch);

        
    }

    
}