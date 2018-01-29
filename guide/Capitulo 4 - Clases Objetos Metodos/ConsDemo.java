/**
 * un cimple constructor de clase (4-127)
 * ConsDemo.java
 */
class MyClass {
    int x;

    MyClass(){      //constructor para MyClass
        x = 10;
    }
}


class ConsDemo {
    public static void main(String args[]) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();

        System.out.println(t1.x + " " + t2.x);
        
    }
   
}