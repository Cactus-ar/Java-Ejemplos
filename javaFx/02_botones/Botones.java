
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Botones.java
 * 
 * Crea una simple interfaz grafica de muestra
 * con dos botones (no hay eventos asi que no hacen nada)
 * 
 */
public class Botones extends Application {

    public static void main(String[] args) {
        launch(args);
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //Inicializar el stage        
        primaryStage.setWidth(300);
        primaryStage.setHeight(400);
        primaryStage.setTitle("Botones en Fx");

        //Crear botones
        Button btnOK = new Button("Ok");
        Button btnSalir = new Button("Salir");
        
        
        //Crear la plantilla y agregarle los controles (los 2 botones)

        Pane plantilla = new Pane(); //definir la plantilla contenedora de los controles

        plantilla.getChildren().add(btnOK);
        plantilla.getChildren().add(btnSalir);
        
        btnOK.setTranslateX(80);
        btnOK.setTranslateY(150);

        btnSalir.setTranslateX(160);
        btnSalir.setTranslateY(150);
        

        //Definir la escena para usarla dentro del stage
        Scene pantalla = new Scene(plantilla);
        primaryStage.setScene(pantalla);
        primaryStage.show();
    }

    
}