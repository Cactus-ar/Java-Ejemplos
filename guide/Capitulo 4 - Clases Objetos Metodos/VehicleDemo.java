/**
 * Ejemplo de una clase Vehiculo (4-108)
 * VehicleDemo.java
 */

class Vehicle {
    int passangers; //Numero de pasajeros
    int fuelcap; //Capacidad de combustible en galones
    int mpg; //Consumo de combustible en millas por galon
}

//Esta clase declara un objeto del tipo vehiculo
class VehicleDemo {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        int range;

        //asignar valores a los campos en minivan
        minivan.passangers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //calcular la autonomia asumiendo el tanque lleno de combustible
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("La minivan puede llevar " + minivan.passangers + " pasajeros con una autonomia de " + range + " millas.");
        
    }
    
}