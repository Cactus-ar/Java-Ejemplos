/**
 * Muetra los argumentos pasados en la linea de comandos (5-165)
 * CLDemo.java
 */
class CLDemo {
    public static void main(String args[]) {
        System.out.println("Fueron pasados " + args.length + " argumentos por la linea de comandos");

        System.out.println("Ellos son: ");
        for(int i=0; i<args.length; i++)
            System.out.println("argumento[" + i + "]: " + args[i]);
        
    }

    
}