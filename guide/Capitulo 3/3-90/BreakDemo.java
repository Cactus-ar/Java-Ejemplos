/**
 * Uso del break para salir de un bucle
 * 
 * BreakDemo.java
 */
class BreakDemo {
    public static void main(String args[]) {
        int num;

        num = 100;

        //bucle hasta que i al cuadrado es mayor que num
        for (int i=0; i<num; i++){
            if (i*i >= num) break; //terminar con el bucle si se da la condicion
            System.out.print(i + " ");
        }
        System.out.println("bucle finalizado");
    }
    
}