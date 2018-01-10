/**
 * calcula la raiz cuadrada de 1 a 99
 * SqrRoot.java
 */
class SqrRoot {
    public static void main(String args[]) {
        double num, sroot, rerr;

        for(num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("La raiz cuadrada de " + num + " es " + sroot);

            //calculo error de redondeo
            rerr = num - (sroot * sroot);
            System.out.println("Error de redondeo es " + rerr);
            System.out.println();

        }   
    }
}