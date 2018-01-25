/**
 * Ejemplo de como retornar con valores de los metodos (4-116)
 * RetMeth.java
 */

class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    //retornar con el calculo de la autonomia
    int range (){
        return mpg * fuelcap;
    }
}

class RetMeth {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        //obtener la autonomia
        range1 = minivan.range();
        range2 = sportscar.range();

        System.out.println("La minivan puede transportar " + minivan.passengers + " pasajeros con una autonomia de " + range1 + " millas");
        System.out.println("El deportivo puede transportar " + sportscar.passengers + " pasajeros con una autonomia de " + range2 + " millas");
    }
    
}