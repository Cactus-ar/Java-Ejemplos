/*

Este programa ilustra las diferencias entre la declaracion
de una variable tipo int y una variable del tipo double
 
Renombre este archivo como Example3.java

 */
class Example3 {
    public static void main(String args[]) {
        int var; //Declaracon de una variable tipo int
        double x; //declaracion de una variable con coma flotante

        var = 10; //asigna a var el valor 10
        x = 10.0; //asigna a x el valor 10.0

        System.out.println("Valor original de var: " + var);
        System.out.println("Valor original de x: " + x);
        System.out.println(); //Imprime una linea en blanco

        //ahora dividamos las dos variables por 4
        var = var /4;
        x = x /4;

        System.out.println("var luego de la división: " + var);
        System.out.println("x luego de la división: " + x);
        
    }

    
}