/* Previene la operacion de division por 0 con el operador terniario (?)
* (5-178)
* NoZeroDiv2.java
*/
class NoZeroDiv2 {
    public static void main(String args[]) {
        int result;

        for(int i = -5; i<6; i++){
            if (i !=0 ? true : false)
                System.out.println("100/" + i + " es " + 100/i);
        }
        
    }
}