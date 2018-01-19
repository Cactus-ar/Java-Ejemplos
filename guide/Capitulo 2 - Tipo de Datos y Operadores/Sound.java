/**
 * Calcular la distancia a la que cae un rayo
 * cuyo sonido toma 7.2 segundos en llegar a nosotros (2-40)
 * 
 * Sound.java
 */
class Sound {
    public static void main(String args[]) {
        double dist;

        dist = 7.2 * 1100;
        //1100 es el valor de la velocidad del sonido en pies por segundo.

        System.out.println("El rayo ha caido a " + dist + " pies de distancia." );
    }

    
}