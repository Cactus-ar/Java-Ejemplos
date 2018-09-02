import javax.lang.model.util.ElementScanner6;

/**
 * Algunas operaciones con Cadenas (5-160)
 * 
 * StrOps.java
 */
class StrOps {
    public static void main(String[] args) {
        String str1 =  "Cuando hablamos de programacion web, Java es el #1.";
        String str2 = new String(str1);
        String str3 = "Las cadenas en Java son poderosas.";
        int result, idx;
        char ch;

        System.out.println("Longitud de str1: " + str1.length());

        //Mostrar str1 un caracter paso a paso
        for(int i=0; i< str1.length(); i++){
            System.out.print(str1.charAt(i));
        }
        System.out.println();

        if(str1.equals(str2))
            System.out.println("str1 es igual a str2");
        else
            System.out.println("str1 No coincide con str2");

        if(str1.equals(str3))
            System.out.println("str1 es igual a str3");
        else
            System.out.println("str1 No coincide con str3");
        
        result = str1.compareTo(str3);
        if (result ==0)
            System.out.println("str1 y str3 son iguales");
        else if (result < 0)
            System.out.println("str1 es menor que str3");
        else
            System.out.println("str1 es mayor a str3");
        
        //asignarle una nueva cadena a str2
        str2 = "Uno Dos Tres Uno";
        idx = str2.indexOf("Uno");
        System.out.println("La primer ocurrencia de Uno es: " + idx);
        idx = str2.lastIndexOf("Uno");
        System.out.println("La ultima ocurrencia de Uno es: " + idx);
    }
}