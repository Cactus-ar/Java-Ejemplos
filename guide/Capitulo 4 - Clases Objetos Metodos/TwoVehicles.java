/**
 * Crear dos objetos del tipo vehiculo (04-109)
 * TwoVehicles.java
 */

class Vehicle {
    int passangers; //Numero de pasajeros
    int fuelcap; //Capacidad de combustible en galones
    int mpg; //Consumo de combustible en millas por galon
}

public class TwoVehicles {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        minivan.passangers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passangers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("Pasajeros de la Minivan: " + minivan.passangers + " Autonomia: " + range1);
        System.out.println("Pasajeros del Deportivo: " + sportscar.passangers + " Autonomia: " + range2);
    
    }
    
}