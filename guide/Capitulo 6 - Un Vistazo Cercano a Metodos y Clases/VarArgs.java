/* Demuestra el uso de procedimientos llamados
con una cantidad de argumentos variables (06-217)
VarArgs.java
*/


class VarArgs {

    //vaTest usa vararg
    static void vaTest (int ... v){ // <---notese los ...

        System.out.println("numero de argumentos: " + v.length);
        System.out.println("Contenido: ");

        for(int i=0; i< v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);

        System.out.println();
    }

    public static void main(String args[]) {
        vaTest(10);     //llamado con 1 argumento
        vaTest(1, 2, 3); //llamado con 3
        vaTest();   //lamado sin args
        
    }

}