import java.util.Random;

public enum diccionario {

    CASA, VASO, PERRO, GATO, GEOGRAFIA, EXCUSIONES, LAPIZ, DESTORNILLADOR;


    private static final diccionario[] valor = values();
    private static final int cantidad = valor.length;
    private static final Random alAzar = new Random();


    public static diccionario obtenerPalabra()  {

        return valor[alAzar.nextInt(cantidad)];
        
    }

}