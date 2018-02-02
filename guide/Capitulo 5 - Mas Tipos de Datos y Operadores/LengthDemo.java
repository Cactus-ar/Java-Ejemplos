/**
 * Uso del miembro length en arrays (5-147)
 * LengthDemo.java
 */
class LengthDemo {
    public static void main(String args[]) {
        int list[] = new int[10];
        int nums[] =  {1, 2, 3};
        int table[][] = { //Una tabla de tamaño variable
            {1, 2, 3}, {4, 5}, {6, 7, 8, 9}
        };

        System.out.println("tama\u00f1o de list es " + list.length);
        System.out.println("tama\u00f1o de nums es " + nums.length);
        System.out.println("tama\u00f1o de table[0] es " + table[0].length);
        System.out.println("tama\u00f1o de table[1] es " + table[1].length);
        System.out.println("tama\u00f1o de table[2] es " + table[2].length);
        System.out.println();

        //usar length para inicializar list
        for(int i=0; i< list.length; i++)
            list[i] = i * i;
        
        System.out.println("Aqui esta list: ");
        
        //ahora usamos length para mostrar list
        for(int i=0; i< list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
        
    }
    
}