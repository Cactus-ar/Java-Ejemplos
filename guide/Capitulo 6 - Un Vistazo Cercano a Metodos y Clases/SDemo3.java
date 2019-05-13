/*
* Utilizacion de un bloque estatico
* SDemo3.java (6-209)
*/

class StaticBlock {
    static double rootOf2;
    static double rootOf3;

    static {
        System.out.println("Dentro del bloque static");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }

    StaticBlock (String msg){
        System.out.println(msg);
    }
}

class SDemo3 {
    public static void main(String args[]) {

        StaticBlock ob = new StaticBlock("Dentro del constructor");
        System.out.println("Raiz cuadrada de 2 es " + StaticBlock.rootOf2);
        System.out.println("Raiz cuadrada de 3 es " + StaticBlock.rootOf3);

        
    }
}