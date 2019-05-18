import java.util.Random;

/*
NeuralSimple2 es la continuacion del ejemplo
visto con NeuralSimple.

En este caso introducimos la funcion de costo
que involucra el valor objetivo de nuestro dataset
con el fin de entrenar a nuestra red para que pueda
predecir valores similares a los dados.

*/


class Neurona2 {

    double muestra_1 = 0;
    double muestra_2 = 0;
    double objetivo = 0;   //Guarda el valor deseado de salida para su entrenamiento

    double peso_1 = 0;      //Asignado aleatoriamente en este ejemplo
    double peso_2 = 0;      //Asignado aleatoriamente en este ejemplo
    double bias = 1;        //Asignado aleatoriamente para este ejemplo

    double neural(){

        double Stp1;    //Desglosado en pasos para una mejor comprension de lo
        double Stp2;    //que esta pasando. Basicamente multiplicamos muestra * peso
        double Stp3;    //en este caso son solamente dos valores de muestra y pesos
                        //Stp3 suma estos productos y le agrega el valor de bias
        double Stp4;    //Stp4 obtiene el valor sigmoide o Prediccion
        
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

    double pendiente(double prediccion){

        //Calculo del costo (o lo bien que la red esta haciendo predicciones)
        // o funccion de error cuadrada que nos dara la pendiente de aproximacion

        /*
        *   (prediccion - objetivo)^2
        *
        * o su derivada 2(prediccion - objetivo)
        */

        double Stp5;    //Stp5 guarda el costo
        int pasos = 0;
        double Stp6 = 0;    //guarda la pendiente

        Stp5 = 2 * (prediccion - objetivo);

        do {    //Bucle de entrenamiento donde vamos incrementando el valor de aproximacion

            pasos++;
            Stp6 = Stp6 - .1 * Stp5;

            System.out.println("Paso: " + pasos + " Aproximacion: " + Stp6);

        } while (Stp6 <= objetivo);

        return Stp6;
    }
}

class NeuralSimple2 {
    public static void main(String args[]) {

        Neurona2 neurus = new Neurona2();

        neurus.muestra_1 = 3;       //Dataset de ejemplo muestra 1
        neurus.muestra_2 = 1.5;     //Dataset de ejemplo muestra 2
        neurus.objetivo = 5;       //Valor esperado de salida (0 o 1)

       

        double prediccion = neurus.neural();
        double pendiente = neurus.pendiente(prediccion);

        System.out.println("---------------------------------------");
        System.out.println("Valor es: " + prediccion);
        System.out.println("Pendiente es: " + pendiente);
        
    }
}