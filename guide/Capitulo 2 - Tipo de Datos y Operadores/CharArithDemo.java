/**
 * Variables tipo char pueden ser manejadas como integers (2-38)
 * CharArithDemo.java
 */
class CharArithDemo {
    public static void main(String args[]) {
        char ch;

        ch = 'X';

        System.out.println("ch contiene " + ch);

        ch++; //incrementar ch. las variables del tipo char pueden incrementarse.

        System.out.println("Ahora ch contiene " + ch);

        ch = 90;

        System.out.println("y ahora ch contiene " + ch);
        
    }


    
}