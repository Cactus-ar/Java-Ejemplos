/*
Los tipos primitivos son pasados por valor (6-190)
CallByValue.java
*/
class Test {
    //Este metodo no causa cambios a los argumentos
    void noChange(int i, int j) {
        i = i + j;
        j = -j;
    }
}

class CallByValue {
    public static void main(String args[]) {
        Test ob = new Test();
        int a = 15, b = 20;

        System.out.println("a y b antes de la llamada: " + a + " " + b);
        
        ob.noChange(a, b);

        System.out.println("a y b despues de la llamada: " + a + " " + b);
        
    }
}
