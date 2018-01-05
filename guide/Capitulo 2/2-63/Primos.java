/**
 * Ejercicio numero 10.
 * Encuentra los numeros primos entre 2 y 100
 * Primos.java
 */
public class Primos {
    public static void main(String args[]) {
        int cuenta, numero;
        boolean primo;

        for (cuenta = 2; cuenta < 100; cuenta ++) {
            primo = true;

            for(numero = 2; numero <= cuenta/numero; numero ++){
                if((cuenta % numero) == 0) primo = false;
            }
            
            if (primo) System.out.print(cuenta + "\t");

        }
        
    }
}