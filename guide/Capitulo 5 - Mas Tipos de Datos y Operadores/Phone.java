/**
 * Implementacion de una simple libreta telefonica (5-165)
 * pasarle el nombre como argumento en la linea de comandos
 * ehemplo: java Phone Rachel
 * 
 * Phone.java
 */
public class Phone {
    public static void main(String args[]) {
        String libreta [][] = {
            {"Tom", "555-3698"},
            {"Nancy", "515-1298"},
            {"Mary", "451-3691"},
            {"Jhon", "987-2198"},
            {"Silvia", "485-2587"},
            {"Rachel", "444-1234"},
            {"Vivian", "963-2587"},
            {"Soup", "789-4258"},
        };

        int i;

        if(args.length != 1)
            System.err.println("Modo de uso: java Phone <nombre>");
        else {
            for(i=0; i<libreta.length; i++){
                if(libreta[i][0].equals(args[0])) {
                    System.out.println(libreta[i][0] + ": " + libreta[i][1]);
                    break;
                }
            }
            if(i == libreta.length)
                System.out.println("Numero no encontrado");
        }
        
    }
   
}