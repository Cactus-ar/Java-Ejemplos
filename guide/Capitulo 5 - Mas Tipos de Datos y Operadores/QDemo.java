/**
 * Una clase cola para caracteres (5-151)
 * QDemo.java
 */

class Queue {
    char q[]; //Este array mantiene la cola
    int putloc, getloc; //indices put y get

    Queue(int size) {
        q = new char[size]; //locacion de memoria de la cola
        putloc = getloc = 0;
    }

    //agrega el caracter a la cola
    void put(char ch) {
        if(putloc == q.length) {
            System.out.println(" - La cola esta llena.");
            return;
        }

        q[putloc++] = ch;

    }

    //obtener el caracter de la cola
    char get(){
        if(getloc == putloc) {
            System.out.println(" - La cola esta vacia.");
            return (char) 0;
        }

        return q[getloc++];

    }


}
class QDemo {
    public static void main(String args[]) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Uso de bigQ para almacenar el alfabeto.");
        for(i = 0; i <26; i++)
            bigQ.put((char) ('A' + i));
        
        //recuperar y mostrar lo elementos en bigQ
        System.out.print("Contenido de bigQ: ");
        for(i=0; i<26; i++) {
            ch = bigQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Uso de smallQ para generar algunos errores.");
        for(i=0; i<5; i++){
            System.out.print("Intentando alojar " + (char) ('Z' - i));
            smallQ.put ((char) ('Z'-i));
            System.out.println();
        }
        System.out.println();
        System.out.print("Contenido de smallQ: ");
        for(i=0; i<5; i++) {
            ch = smallQ.get();
            if(ch !=(char) 0) System.out.print(ch);
        }

    }
    
}