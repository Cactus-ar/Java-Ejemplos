/*
Retorna un objeto definido por el programador (6-193)
ErrInfo.java
*/

class Err {
    String msg; //Mensaje de error
    int severity; //codigo indicando la severidad del error

    Err(String m, int s){
        msg = m;
        severity = s;
    }
}

class ErrorInfo {
    String msgs[] = {
        "Error de Salida",
        "Error de Entrada",
        "Disco Lleno",
        "Indice fuera de rango"
    };
    int howbad[] = {3, 3, 2, 4};

    Err getErrorInfo (int i) {
        if(i >= 0 & i < msgs.length)
            return new Err(msgs[i], howbad[i]);
        else
            return new Err("Codigo de error invalido", 0);
    }
}

class ErrInfo {
    public static void main(String args[]) {
        ErrorInfo err = new ErrorInfo();
        Err e;
        e = err.getErrorInfo(2);
        System.out.println(e.msg + " severidad: " + e.severity);

        e = err.getErrorInfo(19);
        System.out.println(e.msg + " severidad: " + e.severity);

        
    }
}