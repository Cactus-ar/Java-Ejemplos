
import java.util.Scanner;



class ahorcado {

    /*
    * Muestra el manejo de la clase enum
    * para obtener un diccionario de palabras
    * para que el juego seleccione una al azar
    */

    

    public static void main(String[] args){

        char[] letrasIngresadas;         //array que mantiene una lista de las letras ingresadas por el usuario
    
        diccionario palabra;
        Scanner entrada = new Scanner(System.in); // Objeto utilizado para capturar la entrada del teclado.
        boolean finDeljuego = false; //Controla si el usuario desea salir del juego (loop)
        boolean juega = true; //Controla el bucle de entrada y calculos.

        while(!finDeljuego){
            //inicializar el juego
            int cuentaIntentos = 0;
            int maximosIntentos = 0;

            palabra = diccionario.obtenerPalabra();
            var palabraOculta = palabra.toString().toCharArray();

            maximosIntentos = palabra.toString().length();


            System.out.println(palabraOculta);
            
            cartelInicial();    //Cartel Inicial
            laHorca(0);         //La horca vacia
            cartelFinal();      //cartel final doh

            //Proceso
            System.out.println("Ingresa una letra o palabra: ");

            while(juega){ //Mientras no se acaben las oportunidades o adivine
                String letraIngresada = entrada.nextLine();

                cuentaIntentos++;

                if(letraIngresada.equals("!")){
                        System.out.println("Gracias por Jugar! Nos Vemos.-"); //Si ha ingresado !, el programa termina
                        System.exit(0);
                }

                
                System.out.println(palabraOculta);
                String temp = palabraOculta[];

                if (letraIngresada.toUpperCase().equals(palabraOculta.toString())){
                    System.out.println("-------------------------");
                    System.out.println("Has adivinado la palabra!");
                    System.out.println("Has necesitado :" + cuentaIntentos + "intentos.");
                    break;
                }

//                System.out.println(intento(palabraOculta, letraIngresada.toUpperCase()));

                



            }

    

        }

    }

    private static String intento(char[]palabra, String letras){

        char[] ingresado = letras.toCharArray();

        if(ingresado.equals(palabra)){
            System.out.println("Sep");
        }

        for (char let : palabra) {
            
        }


        return "juju";
    }
    
    
    private static void laHorca(int intentos){

        String miembro = "";

        System.out.println("===========");

        if (intentos >= 1)
            miembro = "0";

        System.out.println("||        " + miembro);
        miembro = "";

        if (intentos >= 2 )
            miembro = "/";
        if (intentos >= 3)
            miembro = "/|";
        if (intentos >= 4)
            miembro = "/|\\";

        System.out.println("||       " + miembro);
        miembro = "";

        if (intentos >= 5)
            miembro = "|";

        System.out.println("||        "+ miembro);
        miembro = "";

        if(intentos >=6)
            miembro = "/";
        if(intentos >=7)
            miembro = "/ \\";
        
        System.out.println("||       " + miembro);
        
        System.out.println("||");
        System.out.println("---------------");
        System.out.println("| Intentos: " + intentos +  " |");
        System.out.println("---------------");
        System.out.println();
    }

    private static void cartelInicial(){
        System.out.println("------------------------------------------");
        System.out.println("   AHORCADO! puedes adivinar la palabra   ");
        System.out.println("        antes de que te ahorquen?         ");
        System.out.println("------------------------------------------");
        System.out.println("                                          ");
    }

    private static void cartelFinal(){
        System.out.println("------------------------------------------");
        System.out.println("  Adivina la palabra o ingresa una letra"  );
        System.out.println("      Ingresa ! para salir del juego"      );
        System.out.println("------------------------------------------");
    }

}