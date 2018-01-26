/**
 * Agrega el metodo para el calculo del combustible necesario dada una distancia (4-119)
 * CompFuel.java
 */
class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    //devuelve la autonomia
    int range() {
        return mpg * fuelcap;
    }

    //calcular el combustible necesario dada la distancia
    double fuelneeded (int miles) {
        return (double) miles / mpg;
    }
}

 class CompFuel {
     public static void main(String args[]) {
         Vehicle minivan = new Vehicle();
         Vehicle sportscar = new Vehicle();

         double gallons;
         int dist = 252;

         minivan.passengers = 7;
         minivan.fuelcap = 16;
         minivan.mpg = 21;

         sportscar.passengers = 2;
         sportscar.fuelcap = 14;
         sportscar.mpg = 12;

         gallons = minivan.fuelneeded(dist);
         System.out.println("Para hacer una distancia de " + dist + " millas la minivan necesita " + gallons + " galones de combustible" );

         gallons = sportscar.fuelneeded(dist);
         System.out.println("Para hacer una distancia de " + dist + " millas el deportivo necesita " + gallons + " galones de combustible" );
         
     }
    
}