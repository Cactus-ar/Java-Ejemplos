/**
 * Los efectos secundarios pueden ser importantes (2-54)
 * SideEffects.java
 */
class SideEffects {
    public static void main(String args[]) {
        int i;

        i = 0;

        //Aqui i se incrementara aunque la sentencia if de falso
        if(false & (++i < 100))
            System.out.println("esto no se mostrara");
        System.out.println("condicion if ejecutada: " + i); //muestra un 1

        //En este caso i no se incrementara porque el operador short-circuit
        //omite el incremento
        if(false && (++i < 100))
            System.out.println("esto no se mostrara");
            System.out.println("condicion if ejecutada: " + i); //sigue mostrando un 1!!
        
    }

    
}