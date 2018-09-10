/*
* Utilizacion del operador XOR para codificar y decodificar
* un mensaje (5-170)
* Encode.java
*/
class Encode {
    public static void main(String args[]) {
        String msg = "Esto es una prueba";
        String encmsg = "";
        String decmsg = "";
        int key = 88;

        System.out.print("Mensaje original: ");
        System.out.println(msg);

        //codificar el mensaje
        for(int i=0; i<msg.length(); i++)
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);
        
            System.out.print("Mensaje codificado: ");
            System.out.println(encmsg);
        
        //decodificar mensaje
        for(int i=0; i<msg.length(); i++)
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);
        
            System.out.print("Mensaje decodificado: ");
            System.out.println(decmsg);
        
    }
}