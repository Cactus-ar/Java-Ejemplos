/**
 * Uso de operadores logicos "short-circuit" (2-52)
 * Scops.java
 */
class Scops {
    public static void main(String args[]) {
        int n, d, q;

        n = 10;
        d = 2;
        if (d !=0 && (n & d) == 0) System.out.println(d + " es factor de " + n);

        d = 0;

        //Ahora como d es 0 el segundo operando no es evaluado
        if(d !=0 && (n % d) == 0) System.out.println(d + " es factor de " + n);

        //Ahora lo mismo pero sin los operadores "short-circuit"
        //causara un error de divison por cero

        if(d != 0 & (n % d) == 0) System.out.println(d + " es factor de " + n);


        
    }


    
}