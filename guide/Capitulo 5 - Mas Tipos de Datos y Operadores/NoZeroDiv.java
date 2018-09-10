/* Previene la operacion de division por 0 con el operador terniario (?)
* (5-177)
* NoZeroDiv.java
*/
class NoZeroDiv {
    public static void main(String args[]) {
        int result;

        for(int i = -5; i<6; i++){
            result = i !=0 ? 100 / i : 0; //Previene la division por 0
            if(i !=0)
                System.out.println("100/" + i + " es " + result);
        }
        
    }
}