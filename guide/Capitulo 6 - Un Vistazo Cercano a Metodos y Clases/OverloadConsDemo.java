/**
 * Sobrecarga de Constructores (6-199) 
 * OverloadConsDemo.java
 * 
 * Ejemplo de como es posible sobrecargar incluso constructores en Java
 */

 class MyClass {
     int x;

     MyClass() {    //Constructor de objeto tomando diferentes formas
         System.out.println("Dentro de MyClass().");
         x = 0;
     }

     MyClass(int i) {
        System.out.println("Dentro de MyClass(int).");
        x = i;
     }

     MyClass(double d){
        System.out.println("Dentro de MyClass(double).");
        x = (int) d;
     }

     MyClass(int i, int j){
        System.out.println("Dentro de MyClass(int, int).");
        x = i * j;
     }
 }

 class OverloadConsDemo {
     public static void main(String args[]) {
         MyClass t1 = new MyClass();
         MyClass t2 = new MyClass(88);
         MyClass t3 = new MyClass(17.23);
         MyClass t4 = new MyClass(2, 4);

         System.out.println("t1.x: " + t1.x);
         System.out.println("t2.x: " + t2.x);
         System.out.println("t3.x: " + t3.x);
         System.out.println("t4.x: " + t4.x);
         
     }
 }