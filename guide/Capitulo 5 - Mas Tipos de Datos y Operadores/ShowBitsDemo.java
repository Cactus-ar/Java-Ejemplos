/*
* El programa muestra la representacion de un numero decimal
* en su forma binaria (5-174)
* ShowBitsDemo.java
*/

class ShowBits{
    int numbits;
    ShowBits (int n) {
        numbits = n;
    }

    void Show(long val){
        long mask = 1;

        //desplazar hacia la izquierda hasta la posicion relevante (1)
        mask <<= numbits-1;

        int spacer = 0;
        for (; mask !=0; mask >>>= 1) {
            if((val & mask) !=0) System.out.print("1 ");
            else System.out.print("0 ");
            spacer++;
            if((spacer % 8) == 0){
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();

    }
}

class ShowBitsDemo {
    public static void main(String args[]) {
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);

        System.out.println("123 en binario es: ");
        b.Show(123);

        System.out.println("\n87987 en binario es: ");
        i.Show(87987);

        System.out.println("\n237658768 en binario es: ");
        li.Show(237658768);

        //Ademas se puede visualizar los bits menos significativos de cualquier Integer
        System.out.println("\n8 bits menos significativos de 87987: ");
        b.Show(87987);
        
    }

}