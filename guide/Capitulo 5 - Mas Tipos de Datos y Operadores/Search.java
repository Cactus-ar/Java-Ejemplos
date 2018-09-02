/**
 * Implementacion del un bucle tipo for-each para buscar dentro de un array (5-158)
 * 
 * Search.java
 */
class Search{
    public static void main(String[] args) {
        int nums[] = {6,8,3,7,5,6,1,4};
        int val = 5;
        boolean found = false;

        //Uso de un blucle estilo for-each que busca dentro de nums a val

        for(int x:nums){
            if(x == val){
                found = true;
                break;
            }
        }

        if(found)
            System.out.println("Valor encontrado");
        
    }
}