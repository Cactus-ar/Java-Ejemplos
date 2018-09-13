/*
Demostracion de sobrecarga de metodos (Overloading)
OverloadDemo.java (6-194)
*/

class Overload {
    void ovlDemo() {
        System.out.println("Sin Parametros");
    }

    //Sobrecarga de ovlDemo para un parametro integer
    void ovlDemo(int a) {
        System.out.println("Un Parametro:" + a);
    }

    //Sobrecarga de ovlDemo para dos parametros
    int ovlDemo(int a, int b) {
        System.out.println("Dos parametros: " + a + " " + b);
        return a + b;
    }

    //Sobrecarga de ovlDemo para dos parametros tipo double
    double ovlDemo(double a, double b) {
        System.out.println("Dos parametros double: " + a + " " + b);
        return a + b;
    }
}

class OverloadDemo {
    public static void main(String args[]) {
        Overload ob = new Overload();
        int resI;
        double resD;

        //Invocar todas las versiones de ovlDemo()

        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resI = ob.ovlDemo(4, 6);
        System.out.print("Resultado: " + resI);
        System.out.println();

        resD = ob.ovlDemo(1.1, 2.32);
        System.out.print("Resultado: " + resD);
        System.out.println();
       
    }
}