/**
 * Un ejemplo con parametros (4-118)
 * ParmDemo.java
 */

class ChkNum{
    //retorna verdadero si x es par
    boolean isEven(int x) {
        if ((x%2) == 0) return true;
        else return false;
    }
}

class ParmDemo {
    public static void main(String args[]) {
        
        ChkNum e = new ChkNum();

        if (e.isEven(10)) System.out.println("10 es par.");
        if (e.isEven(9)) System.out.println("9 es par."); //va a retornar falso y no se muestra
        if (e.isEven(8)) System.out.println("8 es par.");
    }
    
}