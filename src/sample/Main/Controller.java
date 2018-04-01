package sample.Main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
/**
 * Universidad del Valle de Guatemala
 * Nombres: Marlon Fuentes, Jose Jo, Diego Alvares
 * Clase controladora de la interfaz grafica. */

public class Controller implements Initializable {


    public Button runBtn;
    public Button chooseBtn;
    public TextArea dbTextArea;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void runProgram(ActionEvent actionEvent) {
        //String program = dbTextArea.textProperty().get();
        String program = dbTextArea.getText();

    }

    public void chooseProgram(ActionEvent actionEvent) throws IOException {
        FileChooser fc = new FileChooser();
        File selectedFile = fc.showOpenDialog(null);
        dbTextArea.clear();
        if(selectedFile !=null){
            String program = selectedFile.getAbsolutePath();
            StringBuilder sb = TypeWritter.reader(program);
            dbTextArea.setText(String.valueOf(sb));

        }else{
            AlertWindow.theAlertWindow("File Error", "Chosen File has no Content");


        }
    }
}
