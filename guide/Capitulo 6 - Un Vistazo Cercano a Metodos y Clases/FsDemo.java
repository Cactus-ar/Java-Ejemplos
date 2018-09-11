/* Esta clase implementa un regimen de "Fail-Soft" con un array, 
permitiendo continuar la ejecucion a pesar de los errores de runtime.class
FsDemo.java (6-184)
*/
class FailSoftArray {
    private int a[]; //referencia al array (doh)
    private int errval; //valor de retorno si get() falla
    public int length;

    /* Construir el array dado su tamaño y el valor
    a retornar si get() falla */
    public FailSoftArray (int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;
    }

    //Retorna el valor dado el indice
    public int get(int index) {
        if (indexOk(index)) return a[index];
        return errval;
    }

    //Asignar un valor al indice. Retorna falso si falla.
    public boolean put (int index, int val){
        if (indexOk(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

    //retorna verdadero si index esta dentro de los limites
    private boolean indexOk(int index){
        if(index >=0 & index < length) return true;
        return false;
    }
}

//Demostrar el array fail-soft
class FsDemo {
    public static void main(String args[]) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        //muestra fallas silenciosas
        System.out.println("Falla Silenciosas.");
        for (int i=0; i< (fs.length *2); i++)
            fs.put(i, i*10);
        
        for(int i=0; i<(fs.length *2); i++) {
            x = fs.get(i);
            if(x != -1) System.out.print(x + " ");
        }
        System.out.println("");

        //Ahora manejando las fallas
        System.out.println("\nFallas con reporte de errores.");
        for(int i=0; i< (fs.length *2); i++)
            if(!fs.put(i, i*10))
                System.out.println("Indice " + i + " fuera de rango");
        
        for (int i=0; i< (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
            else
                System.out.println("Indice " + i + " fuera de rango");
        }
    }
}