import java.io.*;
import javax.servlet.*;


/**
 * Servlet Basico de prueba
 * BasicServlet.java
 * 
 * Para probar su funcionamiento se necesita:
 * 1) Servidor Apache Tomcat (o Glassfish) 7.x+
 * 2) JDK 6.x+
 * 
 * Agregar al path el entorno de las librerias de Tomcat (servlet) o
 * compilar con el parametro -classpath
 * Ejemplo: javac BasicServlet.java -classpath "c:\apache-tomcat\lib\servlet-api.jar"
 * 
 * Editar el archivo web.xml para declarar y mapear el nuevo servlet. Ejemplo:
    <servlet>
        <servlet-name>BasicServlet</servlet-name>
        <servlet-class>BasicServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>BasicServlet</servlet-name>
        <url-pattern>/servlets/servlet/BasicServlet</url-pattern>
    </servlet-mapping>

    Por ultimo, en el browser ir a la ubicacion. Ej: http://localhost:8080/servlets/servlet/BasicServlet
 */

public class BasicServlet extends GenericServlet{

    
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE HTML>");
        out.println("<html>");
        out.println("<head><title>Ejemplo Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Hola Mundo!</h1>");
        out.println("</body></html>");
        out.close();
    }
    
}