/**
 * 
 * Este programa muestra una tabla de conversion
 * de pulgadas a metros (Ejercicio numero 10)
 * 
 * Renombrar el archivo como InchToMetTable.java
 */
class InchToMetTable {
    public static void main(String args[]) {
        double pulgada, metro, calculo;
        int counter;

        counter = 0;
        metro = 39.37;

        for(pulgada = 1; pulgada <=100; pulgada++){
            calculo = pulgada / metro;
            System.out.println(pulgada + " pulgada equivale a " + calculo + " metros.");
            counter++;
            //cada 12 lineas imprimir una en blanco
            if(counter == 12){
                System.out.println();
                counter = 0; //resetear el contador de lineas
            }
        }
        
    }
    
}