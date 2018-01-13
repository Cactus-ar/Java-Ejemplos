/**
 * Sistema de ayuda V2
 * Help2.java
 */
class Help2 {
    public static void main(String args[]) throws java.io.IOException {
        char choice, ignore;

        do {
            System.out.println("Ayuda con: ");
            System.out.println("-----------");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. for");
            System.out.println("4. while");
            System.out.println("5. do-while\n");
            System.out.println("-----------");
            System.out.print("Opcion: ");

            choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

        } while (choice < '1' | choice > '5');

        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("if:\n");
                System.out.println("if(condicion) sentencia");
                System.out.println("else sentencia");
                break;
            case '2':
                System.out.println("switch:\n");
                System.out.println("switch (expresion) {");
                System.out.println("  case constante:");
                System.out.println("        secuencia de instrucciones");
                System.out.println("  break");
                System.out.println("  //..");
                System.out.println("  }");
                break;
            case '3':
                System.out.println("for:\n");
                System.out.print("for(init; condicion; interaccion)");
                System.out.println("instrucciones");
                break;
            case '4':
                System.out.println("while:\n");
                System.out.print("while (condicion) instrucciones");
                break;
            case '5':
                System.out.println("do-while:\n");
                System.out.println("do {");
                System.out.println("  instrucciones;");
                System.out.println("} while (condicion);");
                break;
        }
                
    }
    
}