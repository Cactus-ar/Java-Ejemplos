

//Neurona Artificial modelada de una Biologica

public class Perceptron {


        //Datos de entrenamiento (compuerta and)
        public static final int [][][] andData = { 
            {{0,0}, {0}},
            {{0,1}, {0}},
            {{1,0}, {0}},
            {{1,1}, {1}}
        };

        //Tasa de Aprendizaje
        public static final double LEARNING_RATE = 0.05;

        //Valores aleatorios de comienzo
        public static final double[] INITIAL_WEIGHTS = {Math.random(), Math.random()};


        //Calcular la Union sumadora
        public double calculateWeightedSum (int[] data, double[] weights){
            double weightedSum = 0;

                for(int x=0; x<data.length; x++) {
                    weightedSum += data[x] * weights[x];
                }

            return weightedSum;

        }

        //Calcular la Funcion de Activacion
        public int applyActivationFunction(double weightedSum) {
            int result = 0;

                if (weightedSum > 1) result = 1;

            return result;
        }

        //Ajuste de Pesos
        public double[] adjustWeights (int[] data, double[] weights, double error) {

            double [] adjustedWeights = new double [weights.length];

            for (int x=0; x < weights.length; x++){
                adjustedWeights[x] = LEARNING_RATE * error * data[x] + weights[x];
            }


            return adjustedWeights;
        }

}