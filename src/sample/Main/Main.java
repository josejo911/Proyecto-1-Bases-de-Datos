package sample.Main;
/**
 *Universidad del valle de guatemala
 * Nombre: Marlon Fuentes, Jose Jo, Diego Alvarez
 * Clase encargada de inicializar la interfaz del manejador de base de datos
 * */
import com.jfoenix.controls.JFXTabPane;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("SQLPane.fxml"));
        primaryStage.setTitle("Data base manager");
        primaryStage.setScene(new Scene(root, 740, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
