/*
* Ejemplo del uso del metodo substring() (5-163)
*
*SubStr.java 
*/
class SubStr {
    public static void main(String[] args) {
        String orgstr = "Java hace de la Web";

        //Construir una subcadena
        String substr = orgstr.substring(5, 18);

        System.out.println("cadena original: " + orgstr);
        System.out.println("cadena modificada: " + substr);
        
    }
}