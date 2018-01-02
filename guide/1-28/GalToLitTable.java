/**
 * Try This 1-2
 * Este programa muestra una tabla de conversion
 * de galones a litros
 * 
 * Renombrar el archivo como GalToLitTable.java
 */
class GalToLitTable {
    public static void main(String args[]) {
        double gallons, liters;
        int counter;

        counter = 0;

        for(gallons = 1; gallons <=100; gallons++){
            liters = gallons * 3.7854; //conversion a litros
            System.out.println(gallons + " galones son " + liters + " litros.");
            counter++;
            //cada 10 lineas imprimir una en blanco
            if(counter == 10){
                System.out.println();
                counter = 0; //resetear el contador de lineas
            }
        }
        
    }
    
}