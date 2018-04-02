package sample.Main;
/**
 *Universidad del valle de guatemala
 * Nombre: Marlon Fuentes, Jose Jo, Diego Alvarez
 * Clase encargada del manejo de archivos y creacion de directorios con el uso de la METADATA
 * Clase encargada de mostrar las ventanas de alerta de acciones por ejemplo el bloqueo de inreacciones con otras ventanas
         * nombre de la ventana
         * ancho menor de la ventana
         * Etiqueta del msnsaje con el mensaje
         * Boton de salida
         * funcionalidad del boton de salir
         * definicion del layout
         * Agregar elementos y centrarlos
         * Generacion de la escena
 * */
import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class AlertWindow {

    public static void theAlertWindow(String title, String alert){
        Stage window = new Stage();
        //Bloquear interaccion con otras ventanas, hasta arreglarlo.
        window.initModality(Modality.APPLICATION_MODAL);
        //Nombre de la ventana
        window.setTitle(title);
        //ancho menor de la ventana
        window.setMinWidth(300);
        //Etiqueta del mensaje, con su mensaje
        Label label = new Label();
        label.setText(alert);
        //Boton de salida
        JFXButton button = new JFXButton("SALIR");
        //funcionabilidad para salir.
        button.setOnAction(e->window.close());
        //layout
        VBox layout = new VBox(10);
        //AGREGAR elementos y centrarlos
        layout.getChildren().addAll(label,button);
        layout.setAlignment(Pos.CENTER);
        //genera la escena
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

    }


}
