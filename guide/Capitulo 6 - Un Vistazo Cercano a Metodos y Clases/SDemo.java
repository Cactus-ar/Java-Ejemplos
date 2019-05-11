/* Introduccion al termino Static
* y como se utiliza
* SDemo.java (6-207)
*/
class StaticDemo {

    int x; //una variable normal de instancia
    static int y; //una variable static;

    //retorna la sumarotia de ambas
    int sum(){
        return x + y;
    }
}

class SDemo {
    public static void main(String args[]) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        //Cada objeto tiene su propia instancia de las variables

        ob1.x = 10;
        ob2.x = 20;

        System.out.println("Esta claro que ob1.x y ob2.x son independientes");
        System.out.println("ob1.x: " + ob1.x + "\nob2.x: " + ob2.x);
        System.out.println();

        //Cada objeto comparte una copia de la variable static.
        System.out.println("la variable static y es compartida entre ellos");
        StaticDemo.y = 19;
        System.out.println("Inicializar StaticDemo.y a 19");

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();

        StaticDemo.y = 100;
        System.out.println("StaticDemo.y cambia su valor a 100");

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();

        
    }
}