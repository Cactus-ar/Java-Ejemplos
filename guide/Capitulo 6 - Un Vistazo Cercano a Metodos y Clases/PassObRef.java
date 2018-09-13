/*
Los objetos son pasados por referencia (6-191)
PassObRef.java
*/
class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }
    void change(Test ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
    
}

class PassObRef {
    public static void main(String args[]) {

        Test ob = new Test(15, 20);
        

        System.out.println("ob.a y ob.b antes de la llamada: " + ob.a + " " + ob.b);
        
        ob.change(ob);

        System.out.println("ob.a y ob.b despues de la llamada: " + ob.a + " " + ob.b);
        
    }
}
