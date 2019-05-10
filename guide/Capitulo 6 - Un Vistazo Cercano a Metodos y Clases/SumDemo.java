/* Inicializar un objeto desde otro (6-200)
* SumDemo.java
*/

class Summation {
    int sum;

    // Construye desde un int
    Summation (int num){
        sum = 0;
        for(int i=1; i <= num; i++)
            sum += i;
    }

    //Construye desde otro objeto
    Summation(Summation ob){ //Constructor del objeto a partir de otro
        sum = ob.sum;
    }
}

class SumDemo {
    public static void main(String args[]) {
        Summation s1 = new Summation(5);
        Summation s2 = new Summation(s1);

        System.out.println("s1.sum: " + s1.sum);
        System.out.println("s2.sum: " + s2.sum);
        
    }
}