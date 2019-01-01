import java.util.Random;
import java.util.Scanner;

class adivinaNumero {

    /*
    * Originalmente escrito en C, este fue uno de los
    * primeros programas que escribi cuando era chico
    *
    * basicamente se trata de adivinar el numero que esta
    * pensando la computadora.
    * 
    * La estructura, que ahora parece desordenada, muestra
    * las funciones basicas de un bucle y sentencias de control
    *
    */

    public static void main(String[] args) {

        Random numeroAleatorio = new Random(); //Objeto utilizado para generar numeros al azar
        Scanner entrada = new Scanner(System.in); //Objeto utilizado para capturar la entrada del teclado.

        boolean finDeljuego = false; //Controla si el usuario desea salir del juego (loop)
        boolean intento = true; //Controla el bucle de entrada y calculos.
        int intentos = 0;
        int numeroMaximo = 10; //El numero maximo del juego
        

        while(!finDeljuego){

            final int numeroElegido = numeroAleatorio.nextInt(numeroMaximo); //Inicializamos con un numero aleatorio entre 0 y 100

            int numeroIngresado = 0;    
            intentos = 0;               //intentos a cero al comienzo

            //Cartel Inicial
            System.out.println("------------------------------------------");
            System.out.println("   ADIVINA EL NUMERO QUE ESTOY PENSANDO   ");
            System.out.println("------------------------------------------");
            System.out.println("    pista: es un numero entre 0 y " + numeroMaximo);
            System.out.println("------------------------------------------");
            System.out.println("   Ingresa z o Z para salir del juego"     );
            System.out.println("------------------------------------------");

            while(intento){ //Mientras no se acaben las oportunidades o adivine

                String ingresado = entrada.nextLine(); //Capturamos la entrada del teclado

                switch (ingresado) {
                    case "z":
                        System.out.println("Gracias por Jugar! Nos Vemos.-"); //Si ha ingresado z, el programa termina
                        System.exit(0);
                        break;
                    
                        case "Z":
                        System.out.println("Gracias por Jugar! Nos Vemos.-"); //Lo mismo sucede si es Z
                        System.exit(0);
                        break;
                    default:
                        break;
                }

                numeroIngresado = Integer.parseInt(ingresado); //Capturamos lo que ingresa el usuario por consola
                intentos++; //Sumamos la cantidad de intentos

                if(numeroIngresado > numeroMaximo){     //Si la entrada es superior al maximo
                    System.out.println("DIJE..0 a " +numeroMaximo + " >.<");
                    System.out.println("Intentemos nuevamente...");
                    break;
                }

                if (numeroIngresado == numeroElegido){ //Si acerto

                    System.out.println("Adivinaste!!");
                    System.out.println("Te ha tomado " + intentos + " intentos.");
                    break;

                }else if (numeroIngresado > numeroElegido) {    //Si se pasa
                    System.out.println("Te pasaste");
                }else {
                    System.out.println("Mas arriba"); //Si es corto
                }

            }

        }
        
    }

}