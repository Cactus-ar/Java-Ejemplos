/**
 * Convertir el sistema de ayuda del capitulo 3 en la clase Ayuda (4-121)
 * HelpClassDemo.java
 */
class Help {
    void helpOn (int what) {
        switch (what) {
            case '1': 
                System.out.println("if: \n");
                System.out.println("if (condicion) sentencia;");
                System.out.println("else sentencia;");
                break;
            case '2':
                System.out.println("switch: \n");
                System.out.println("switch expresion  {");
                System.out.println("    case constante:");
                System.out.println("    secuencia de instrucciones");
                System.out.println("    break;");
                System.out.println("  ..// ..");
                System.out.println("}");
                break;
            case '3':
                System.out.println("for: \n");
                System.out.print("for (init; condicion; iteracion)");
                System.out.println("instrucciones;");
                break;
            case '4':
                System.out.println("while: \n");
                System.out.println("while (condicion) instruccion");
                break;
            case '5':
                System.out.println("do-while: \n");
                System.out.println("do {");
                System.out.println("    instrucciones;");
                System.out.println("} while (condicion);");
                break;
            case '6':
                System.out.println("break: \n");
                System.out.println("break; o break etiqueta;");
                break;
            case '7':
                System.out.println("continue: \n");
                System.out.println("continue; o continue etiqueta;");
                break;
        }
        System.out.println();
    }

    void showMenu() {
        System.out.println("Ayuda con:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println(" 3. for");
        System.out.println(" 4. while");
        System.out.println(" 5. do-while");
        System.out.println(" 6. break");
        System.out.println(" 7. continue\n");
        System.out.println("Elija una opcion (q para salir): ");
    }

    boolean isValid (int ch) {
        if (ch < '1' | ch > '7' & ch != 'q') return false;
        else return true;
    }

}

class HelpClassDemo {
    public static void main(String args[]) throws java.io.IOException {
    
        char choice, ignore;
        Help hlpobj = new Help();

        for (;;) {
            do {
                hlpobj.showMenu();
                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            } while ( !hlpobj.isValid(choice) );

            if (choice == 'q') break;
            System.out.println("\n");
            hlpobj.helpOn(choice);
        }
        
    }
    
}