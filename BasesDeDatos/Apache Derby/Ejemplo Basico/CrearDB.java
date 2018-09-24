/*
CrearDB.java

Ejemplo con Apache Derby DB (https://db.apache.org/derby/)

Este ejemplo muestra como crear una base de datos, una tabla con algunos campos y
luego agregar algunos registros de muestra.

Necesita el manejador de DB Derby incluido en el archivo derby.jar

Compilar: Javac -cp .;/lib/derby.jar CrearDB.java
Ejecutar: Java -cp .;/lib/derby.jar CrearDB

Si vuelve a ejecutarse mas de una vez obtendremos un error ya que los archivos de la DB ya existen

*/

import java.lang.ClassNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class CrearDB {
    
    public static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    public static final String JDBC_URL = "jdbc:derby:EjemploDB; create = true";

    public static void main (String[] args) throws ClassNotFoundException, SQLException {

        Connection conexion = null;

        Class.forName(DRIVER);
        conexion = DriverManager.getConnection(JDBC_URL);

        //Crear la tabla dentro de la DB
        conexion.createStatement().execute("create table personas(nombre varchar(50), telefono varchar(50), email varchar(100))");
        System.out.println("Tabla Creada");

        //Agregar algunos registros 
        conexion.createStatement().execute("insert into personas values " +
                    "('Jose Emilio', '15-8-987-6385', 'emilio@emilio.com'), " +
                    "('Roberto Flores', '987-6385', 'roberto@flores.com'), " +
                    "('Maria Carmona', '15-7-981-6115', 'maria@carmona.com'), " +
                    "('Emiliano Filipi', 'NO POSEE', 'emiliano@filippi.com'), " +
                    "('Elga LLego', '326-1475', 'elga@llego.com'), " +
                    "('Romina Pecora', '456-9411', 'NO POSEE'), " +
                    "('Martina Caprina', '*115', 'martina@carpina.com'), " +
                    "('Alberto Mateico', 'NO POSEE', 'NO POSEE'), " +
                    "('Emma Brawn', '4859-6666', 'emma@brawn.com'), " +
                    "('107', '*107', '107@107.com') " );

        System.out.println("Registros creados.-");
        
    }
}