/**
 * Una clase cola para caracteres (6-202) MEJORADA
 * QDemo2.java
 */

 class Queue {
     private char q[]; //este arreglo guarda la cola
     private int putloc, getloc; //los indices

     //construye una cola vacia segun su tamaño
     Queue(int size){
         q = new char[size]; //reserva el tamaño de memoria 
         putloc = getloc = 0;
     }

     //construye una cola desde otra ya creada
     Queue(Queue ob){
         putloc = ob.putloc;
         getloc = ob.getloc;
         q = new char[ob.q.length];

         //copia los elementos
         for(int i=getloc; i< putloc; i++)
            q[i] = ob.q[i];
     }

     //construye una cola con valores iniciales
     Queue(char a[]){
         putloc = 0;
         getloc = 0;
         q = new char[a.length];
         for(int i=0; i< a.length; i++)
            put(a[i]);
     }

     //ingresar un caracter a la cola
     void put(char ch){
         if(putloc == q.length){
             System.out.println(" - La cola esta llena.");
             return;
         }
         q[putloc++] = ch;
     }

     //obtener un caracter de la cola
     char get() {
         if(getloc == putloc) {
             System.out.println(" - La cola esta vacia.");
             return (char) 0;
         }
         return q[getloc++];
     }
 }

 class QDemo2 {
     public static void main(String args[]) {

        //construye una cola vacia de 10 elementos
        Queue q1 = new Queue(10);


        char name[] = {'T', 'o', 'm'};

        //construye una cola desde un array
        Queue q2 = new Queue(name);

        char ch;
        int i;

        //agrega algunos caracteres a q1
        for(i=0; i<10; i++)
            q1.put((char) ('A' + i));
        
        //construye la cola partiendo de otra
        Queue q3 = new Queue(q1);

        //despliga los datos
        System.out.print("Contenido de q1: ");
        for(i=0; i<10; i++){
            ch= q1.get();
            System.out.print(ch);
        }
        System.out.println("\n");


        System.out.print("Contenido de q2: ");
        for(i=0; i< 3; i++){
            ch = q2.get();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Contenido de q3: ");
        for(i=0; i<10; i++){
            ch= q3.get();
            System.out.print(ch);
        }
     }
 }