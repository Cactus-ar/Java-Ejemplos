/**
 * Implementar autonomia como metodo (4-113)
 * AddMeth.java
 */
class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    //calcular y mostrar la autonomia
    void range(){
        System.out.println("Su autonomia es de " + fuelcap * mpg + " millas por galon");
    }
}

class AddMeth {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        //introducir valores
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.print("La minivan puede cargar " + minivan.passengers + " pasajeros. ");
        minivan.range(); //visualiza la autonomia

        System.out.print("El deportivo puede cargar " + sportscar.passengers + " pasajeros. ");
        sportscar.range();
    }

    
}