/*
ConsultaDB.java

Ejemplo con Apache Derby DB (https://db.apache.org/derby/)

Este ejemplo muestra como realizar algunas operaciones de lectura

Necesita el manejador de DB Derby incluido en el archivo derby.jar

Compilar: Javac -cp .;lib/derby.jar ConsultaDB.java
Ejecutar: Java -cp .;lib/derby.jar ConsultaDB



*/


import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;


class ConsultaDB {
    public static final String SQL_STATEMENT = "select * from PERSONAS";
    public static void main(String[] args)  throws SQLException{

        Connection conexion = null;
        conexion = DriverManager.getConnection(CrearDB.JDBC_URL);

        Statement statement = conexion.createStatement();
        ResultSet resultados = statement.executeQuery(SQL_STATEMENT);
        ResultSetMetaData setresultados = resultados.getMetaData();
        int cantColumnas = setresultados.getColumnCount();

        //Obtener las columnas de la tabla
        for (int x=1; x <= cantColumnas; x++)
            System.out.format("%25s", setresultados.getColumnName(x) + " | ");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------");

        //Obtener los registros
        while (resultados.next()){
            System.out.println("");
            for (int x=1; x <= cantColumnas; x++)
                System.out.format("%25s", resultados.getString(x) + " | ");
        }
        if (statement != null) statement.close();
        if (conexion != null ) conexion.close();
        
    }

}