import java.util.Random;

/*
NeuralSimple es el ejemplo mas basico
de lo que significa una red neuronal simple o una primer capa
para el analisis de patrones y prediccion de resultados.

Siguiendo la formula basica de multiplicar parametros con pesos
en este caso los pesos son generados aleatoriamente para comenzar
con su entrenamiento PERO sin darle a concer el valor de salida.

Luego se aplica la funcion sigmoide para obtener un valor entre 0 y 1

*/


class Neurona {

    double muestra_1 = 0;
    double muestra_2 = 0;
    double peso_1 = 0;      //Asignado aleatoriamente en este ejemplo
    double peso_2 = 0;      //Asignado aleatoriamente en este ejemplo
    double bias = 1;        //Asignado aleatoriamente para este ejemplo

    double neural(){

        double Stp1;    //Desglosado en pasos para una mejor comprension de lo
        double Stp2;    //que esta pasando. Basicamente multiplicamos muestra * peso
        double Stp3;    //en este caso son solamente dos valores de muestra y pesos
                        //Stp3 suma estos productos y le agrega el valor de bias
        double Stp4;    //Stp4 obtiene el valor sigmoide

        Random rnd = new Random();

        peso_1 = rnd.nextDouble();
        peso_2 = rnd.nextDouble();
        bias = rnd.nextDouble();

        Stp1 = muestra_1 * peso_1;      //Obviamente desglosado para que se lea
        Stp2 = muestra_2 * peso_2;      //facilmente
        Stp3 = Stp1 + Stp2 + bias;      //todo el proceso
        Stp4 = 1 / (1 + Math.exp(-Stp3));

        return Stp4;
    }
}

class NeuralSimple {
    public static void main(String args[]) {

        Neurona neurus = new Neurona();

        neurus.muestra_1 = 3;       //Nuestro dataset de ejemplo
        neurus.muestra_2 = 1.5;     //El valor esperado debería ser cercano al 1

        //Claro que al solamente utilizar valores aleatorios en los pesos
        //nuestra red de neuronas emitira una prediccion totalmente al azar.

        System.out.println("Valor es: " + neurus.neural());
        
    }
}