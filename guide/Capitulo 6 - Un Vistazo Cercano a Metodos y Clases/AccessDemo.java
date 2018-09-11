/*
Acceso Publico vs. Privado (6-183)
AccessDemo.java
*/

class MyClass {
    private int alpha; //Acceso privado
    public int beta; //Acceso Publico
    int gamma; //Acceso por defecto

    /* Metodos para acceder a alpha.
    Se permite a un miembro de la clase acceder a un
    miembro privado de la misma clase
    */

    void setAlpha (int a){
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}

class AccessDemo {
    public static void main (String args[]) {
        MyClass ob = new MyClass();

        /* acceso a alpha esta permitido
        solo a traves de su metodo accesorio (accessor)
        */

        ob.setAlpha(-99);
        System.out.println("ob.alpha es " + ob.getAlpha());

        //No esta permitido acceder a alpha de esta forma:
        // ob.alpha = 10; //MAL! alpha es privada!

        //Estas formas estan bien ya que beta y gamma son publicas

        ob.beta = 88;
        ob.gamma = 99;
        
    }
}