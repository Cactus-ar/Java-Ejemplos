

/**
 * Sistema de ayuda sencillo
 * 
 * Help.java
 */
class Help {
    public static void main(String args[]) throws java.io.IOException {
            char choice;

            System.out.println("Ayuda con:");
            System.out.println("    1. if");
            System.out.println("    2. switch");
            System.out.println("-------------");
            System.out.println("Opcion: ");
            choice = (char) System.in.read();

            System.out.println("\n");

            switch (choice){
                case '1':
                    System.out.println("if:\n");
                    System.out.println("if(condicion) sentencia;");
                    System.out.println("else sentencia;");
                    break;
                case '2':
                    System.out.println("switch: \n");
                    System.out.println("switch(expresion) {");
                    System.out.println("    case(constante)");
                    System.out.println("        secuencia de instrucciones");
                    System.out.println("        break;");
                    System.out.println(" // ...");
                    System.out.println("}");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

    }

        
}