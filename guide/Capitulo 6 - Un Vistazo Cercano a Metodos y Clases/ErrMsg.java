/*
Retornar una Cadena (6-192)
ErrMsg.java
*/

class ErrorMsg {
    String msgs[] = {
        "Error de Salida",
        "Error de Entrada",
        "Disco Lleno",
        "Indice fuera de Rango"
    };

    //Retornar el mensaje de error
    String getErrorMsg (int i) {
        if(i >=0 & i < msgs.length)
            return msgs[i];
        else
            return "Codigo de error Invalido";
    }
}

class ErrMsg {
    public static void main(String args[]) {
        ErrorMsg err = new ErrorMsg();
        System.out.println(err.getErrorMsg(2));
        System.out.println(err.getErrorMsg(19));
        
    }
}