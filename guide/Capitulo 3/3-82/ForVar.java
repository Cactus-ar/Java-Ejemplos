/**
 * declarar la variable de control dentro del bucle for
 * ForVar.java
 */
class ForVar {
    public static void main(String args[]) {
        int sum = 0;
        int fact = 1;

        //Calcular el Factorial del 1 al 5
        for(int i = 1; i<= 5; i++){
            sum += i; //i es conocida dentro del bucle
            fact *= i;
        }

        //pero no aqui
        System.out.println("La suma es: " + sum);
        System.out.println("el Factoreo es: " + fact);
        
    }

    
}