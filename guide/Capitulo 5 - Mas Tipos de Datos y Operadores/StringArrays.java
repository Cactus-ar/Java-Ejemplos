/**
 * Introduccion a los arrays de cadenas(string) (5-162)
 * 
 * StringArrays.java
 */

 class StringArrays {
     public static void main(String[] args) {
         String strs[] = {"Esto", "es", "un", "Test."};

        System.out.println("Array original: ");
        for (String s : strs)
            System.out.println(s + " ");
        System.out.println("\n");

    //cambiar una cadena
    strs[1] = "fue";
    strs[3] = "tambien un test!!";

    System.out.println("Array modificado: ");
    for (String s : strs)
        System.out.println(s + " ");
    System.out.println("\n");
         
     }
 }