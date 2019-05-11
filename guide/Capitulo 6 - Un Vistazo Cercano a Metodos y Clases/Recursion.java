/*  Un ejemplo simple de recursividad
*   Recursion.java (6-205)
*/

class Factorial {
    //esta funcion es recursiva
    int factR(int n) {
        int result;

        if (n==1) return 1;
        result = factR(n-1) * n; // <--ejecuta una llamada recurrente a si misma
        return result;
    }

    //Su equivalente iterativo
    int factI(int n){
        int t, result;

        result = 1;
        for(t=1; t<=n; t++) result *= t;
        return result;
    }
}

class Recursion {
    public static void main(String args[]) {
        Factorial f = new Factorial();

        System.out.println("Factorizacion utilizando el metodo recursivo");
        System.out.println("Factorial de 3 es " + f.factR(3));
        System.out.println("Factorial de 4 es " + f.factR(4));
        System.out.println("Factorial de 5 es " + f.factR(5));
        System.out.println();
        System.out.println("Factorizacion utilizando el metodo iteractivo");
        System.out.println("Factorial de 3 es " + f.factI(3));
        System.out.println("Factorial de 4 es " + f.factI(4));
        System.out.println("Factorial de 5 es " + f.factI(5));
        
    }
}