/**
 * uso de la instruccion this (4-131)
 *
 * DemoPwr.java
 */


 /*
 * Ejemplo sin su uso
class Pwr {
    double b;
    int e;
    double val;

    Pwr (double base, int exp) {
        b = base;
        e = exp;

        val = 1;
        if (exp == 0 ) return;
        for ( ; exp > 0; exp--) val = val * base;
    }

    double get_pwr() {
        return val;
    }

}
*/

class Pwr {
    double b;
    int e;
    double val;

    Pwr (double base, int exp) {
        this.b = base;
        this.e = exp;

        val = 1;
        if (exp == 0 ) return;
        for ( ; exp > 0; exp--) val = val * base;
    }

    double get_pwr() {
        return this.val;
    }

}

class DemoPwr {
    public static void  main(String args[]) {
        Pwr x = new Pwr (4.0, 2);
        Pwr y = new Pwr (2.5, 1);
        Pwr z = new Pwr (5.7, 0);

        System.out.println(x.b + " elevado a " + x.e + " potencia es " + x.get_pwr());
        System.out.println(y.b + " elevado a " + y.e + " potencia es " + y.get_pwr());
        System.out.println(z.b + " elevado a " + z.e + " potencia es " + z.get_pwr());
        
    }

    
}