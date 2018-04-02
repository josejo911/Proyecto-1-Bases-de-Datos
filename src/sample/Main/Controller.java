package sample.Main;

import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
/**
 * Universidad del Valle de Guatemala
 * Nombres: Marlon Fuentes, Jose Jo, Diego Alvares
 * Clase controladora de la interfaz grafica. */

public class Controller implements Initializable {

    public JFXTextArea consoleDialoge;
    public CheckBox verbose;
    private String program="";
    private boolean select=false;
    private boolean verboseActive=false;

    public Button runBtn;
    public Button chooseBtn;
    public TextArea dbTextArea;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void runProgram(ActionEvent actionEvent) {
        boolean estado = verbose.isSelected();
        program = dbTextArea.getText();
        if(estado ==true){
            this.verboseActive =true;
            String output = TheCompiler.compiling(program, verboseActive);
            consoleDialoge.setText(output);
        }else{
            this.verboseActive=false;
            String output = TheCompiler.compiling(program, verboseActive);
            consoleDialoge.setText(output);
        }




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
