/**
 * Agregar constructor al programa de vehiculos (4-128)
 * VehConsDemo.java
 */

class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    //este es el constructor de la clase
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    //retorna la autonomia
    int range() {
        return mpg * fuelcap;
    }

    //Calcula el combustible necesario para recorrer una distancia dada
    double fuelneeded (int miles) {
        return (double) miles/mpg;
    }
}




class VehConsDemo {
    public static void main(String args[]) {
        // constuir vehiculos
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);
        System.out.println("Para viajar " + dist + " millas, la minivan requiere " + gallons + " galones de combustible.");

        gallons = sportscar.fuelneeded(dist);
        System.out.println("Para viajar " + dist + " millas, el deportivo requiere " + gallons + " galones de combustible.");




    }
    
}