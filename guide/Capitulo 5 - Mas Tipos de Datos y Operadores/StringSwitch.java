/**
 * Implementacion de una cadena para operar una estructura
 * del tipo Switch (5-164)
 * StringSwitch.java
 */

 class StringSwitch {
     public static void main(String[] args){
         String command = "cancelar";
         switch(command){
            case "conectar":
                System.out.println("Conectando...");
                break;
            case "cancelar":
                System.out.println("Cancelando..");
                break;
            case "desconectar":
                System.out.println("Desconectando");
                break;
            default:
                System.out.println("Comando erroneo");
                break;
         }
     }
 }