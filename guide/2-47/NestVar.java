/**
 * Este programa intenta declarar la misma variable
 * dentro de dos ambitos diferentes
 * 
 * al compilarlo producira un error
 * 
 * NestVar.java
 */
class NestVar {
    public static void main(String args[]) {
        int count;

        for (count = 0; count < 10; count = count +1) {
            System.out.println("Esta es la cuenta " + count);

            int count; //Esto es ilegal ya que fue declarada antes y producira un error al compilar
            for(count = 0; count < 2; count++){
                System.out.println("Este programa contiene errores!");
            }
            
        }
        
    }

    
}