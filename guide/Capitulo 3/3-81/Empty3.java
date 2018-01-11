/**
 * El cuerpo de un loop puede estar vacio
 * 
 * Empty3.java
 */
class Empty3 {
    public static void main(String args[]) {
        int i;
        int sum = 0;

        //suma los numeros hasta el 5

        for(i = 1; i<=5; sum += i++); //este bucle no tiene cuerpo
        
        System.out.println("sum es: " + sum);

    }

    
}