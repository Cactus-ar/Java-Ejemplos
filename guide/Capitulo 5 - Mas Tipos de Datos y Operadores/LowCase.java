/*
*Letras minusculas (5-169)
*LowCase.java
*/
class LowCase {
    public static void main(String args[]) {
        char ch;
        
        for (int i=0; i<10; i++){
            ch = (char) ('A' + i);
            System.out.print(ch);

            //La proxima instruccion activa el sexto bit
            ch = (char) ((int) ch | 32); //ch ahora esta en minuscula
            System.out.print(ch + " ");
        }
        
    }
}