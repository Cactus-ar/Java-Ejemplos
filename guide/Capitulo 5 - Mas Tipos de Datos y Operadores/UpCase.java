/*
* Conversion a Mayusculas (5-167)
* UpCase.java
*/

class UpCase {
    public static void main(String args[]) {
        char ch;

        for(int i=0; i<10; i++){
            ch = (char) ('a' + i);
            System.out.print(ch);

            //Esta operacion apaga al sexto bit
            ch = (char) ((int) ch & 65503); // ch es convertido a minuscula
            System.out.print(ch + " ");
        }
        
    }
}