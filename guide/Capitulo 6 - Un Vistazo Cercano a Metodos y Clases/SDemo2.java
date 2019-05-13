/*
* Uso de un metodo estatico (6-208)
* SDemo2.java
*/

class StaticMeth {
    static int val = 1024; //una variable estatica

    //un metodo estatico
    static int valDiv2(){
        return val /2;
    }
}

class SDemo2 {
    public static void main(String args[]) {
        System.out.println("val es " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2() es " + StaticMeth.valDiv2());

        StaticMeth.val = 4;
        
        System.out.println("val es " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2() es " + StaticMeth.valDiv2());
    }
}