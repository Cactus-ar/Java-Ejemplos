/*
* Demuestra la operacion bit a bit del operador NOT (5-170)
* NotDemo.java
*/

class NotDemo {
    public static void main(String args[]) {

        byte b = -34;

        for(int t=128; t>0; t = t/2){
            if ((b & t) !=0) System.out.print("1 ");
            else System.out.print("0 ");
        }

        System.out.println();
        
        //dar vuelta todos los bits
        b = (byte) ~b;

        for(int t=128; t>0; t = t/2){
            if ((b & t) !=0) System.out.print("1 ");
            else System.out.print("0 ");
        }
        
    }
}