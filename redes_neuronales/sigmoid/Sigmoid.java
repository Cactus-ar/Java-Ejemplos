import java.util.Scanner;

//Ingresa un numero y devuelve la funcion sigmoide
/*
                        1
sigmoide(x) =  ------------------
                   1  +  e^(-x)

e es la constante logaritmica o exponencial
o numero de euler y la constante tiene un valor
de 2.71828

*/

public class Sigmoid {

public static void main(String args[]) {

    double numero = 0;
    double resultado = 0;

    Scanner entrada = new Scanner(System.in);

    System.out.print("Ingrese un numero: ");
    numero = entrada.nextDouble();

    //Pasar a la funcion
    resultado = 1 / (1 + Math.exp(-numero));


    System.out.println("El valor sigmoide es:" + resultado);

    entrada.close();

    
    
    
        
    
    
    
    

}    



}