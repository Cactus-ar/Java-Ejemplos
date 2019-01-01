/*

Determinar que pesos (w1 y w2) nos llevarian a que Resultado_Objetivo (o salida esperada) = Resultado para todos
los vectores de los datos de entrenamiento.

Inicial: Aleatoriamente incicializamos los pesos (w1 y w2)

x1 ---w1--->
            --US = w1 * x1 + w2 * x2 --> FA --> Resultado
x2 ---w2--->

1) Calculamos la union sumadora (US)

2) Se aplica la funcion de activacion (FA)

    ws > 1 ==> resultado = 1
    ws <= 1 ==> resultado = 0

3) Determinar el Error

    Error = (Resultado_Objetivo) - Resultado

4) Ajustar o actualizar los pesos

    wi (TA) * Error * xi + wi


Datos de Entrenamiento

x1  x2  Resultado_Objetivo
0   0   0
0   1   0
1   0   0
1   1   1

Epoca = bucle repetitivo de los pasos 1-4

*/

public class Entrenador {
    public static void main (String[] args){

        int [][][] data = Perceptron.andData;
        double [] weights = Perceptron.INITIAL_WEIGHTS;
        double[] adjustedWeights = null;
        Entrenador entrenador = new Entrenador();
        Perceptron perceptron = new Perceptron();
        int epochNumber = 0;
        boolean errorFlag = true;
        double error = 0;

        while (errorFlag){
            entrenador.encabezado(epochNumber++);
            errorFlag = false;
            error = 0;
            for(int x = 0; x < data.length; x++){
                double weightedSum = perceptron.calculateWeightedSum(data[x][0], weights);
                int result = perceptron.applyActivationFunction(weightedSum);
                error = data[x][1][0] - result;
                if (error !=0) errorFlag = true;
                adjustedWeights = perceptron.adjustWeights(data[x][0], weights, error);
                entrenador.printVector(data[x], weights, result, error, weightedSum, adjustedWeights);
                weights = adjustedWeights;
            }

        }

    }

    public void encabezado (int epochNumber){
        System.out.println("\n===================================== Epoca # " + epochNumber + " ====================================");
        System.out.println("  w1  |  w2  |x1 |x2 |Result.OBj| Resultado | error | US   | Ajuste w1 | Ajuste w2");
        System.out.println("------------------------------------------------------------------------------------");
    }

    public void printVector (int[][] data, double[] weights, int result, double error, 
        double weightedSum, double[] adjustedWeights) {

            System.out.println(" " + String.format("%.2f", weights[0]) + " | " + String.format("%.2f", weights[1]) +
            " | " + data[0][0] + " | " + data[0][1] + " |    " + data[1][0] + "      |    " + result + "     |   " + 
            error + " | " + String.format("%.2f", weightedSum) + " |      " + String.format("%.2f", adjustedWeights[0]) + 
            " |      " + String.format("%.2f", adjustedWeights[1]) + " |" );

    }

}