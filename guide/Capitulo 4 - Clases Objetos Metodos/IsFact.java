/**
 * Ejemplo con dos parametros (4-118)
 * IsFact.java
 */
class Factor {
    boolean isFactor(int a, int b) {
        if ((b % a) == 0 ) return true;
        else return false;
    }
}

 class IsFact {
     public static void main(String args[]) {
         Factor x = new Factor();

         if (x.isFactor(2,20)) System.out.println("2 es factor");
         if (x.isFactor(3,20)) System.out.println("esto no se imprimira");
     }
    
}