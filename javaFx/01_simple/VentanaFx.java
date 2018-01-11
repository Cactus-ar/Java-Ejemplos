import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * VentanaFx.java
 * 
 * Crea una simple interfaz grafica de muestra
 * 
 */
public class VentanaFx extends Application {

    public static void main(String[] args) {
        launch(args); //El punto de entrada llama a este metodo dentro de la libreria Application
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //Las ventanas en java se llaman Stages (escenarios..como en el teatro :P)
        //Este es el punto de entrada de la ventana principal (primaryStage)

        primaryStage.setWidth(300);
        primaryStage.setHeight(400);
        primaryStage.setTitle("Hola desde JavaFX");
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("java.png")));
        primaryStage.show(); //muestra la ventana
    }

    
}