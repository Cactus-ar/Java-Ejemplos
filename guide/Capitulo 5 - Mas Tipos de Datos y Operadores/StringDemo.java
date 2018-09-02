/**
 * Introduccion a la construccion de objetos tipo String(5-159)
 * 
 * StringDemo.java
 */
class StringDemo {
    public static void main(String[] args) {
        //declaraciones de cadenas en varias formas
        String str1 = new String("En Java las cadenas son Objetos");
        String str2 = "Pueden ser construidos de varias formas";
        String str3 = new String(str2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}