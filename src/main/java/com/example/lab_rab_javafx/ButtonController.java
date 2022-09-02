package com.example.lab_rab_javafx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;
import java.util.ResourceBundle;

public class ButtonController implements Initializable {
    @FXML
    private TextArea textArea;

    @FXML
    protected void onButtonClick() {
        try(FileWriter save = new FileWriter("save")){
            save.write(textArea.getText());
            save.flush();
        }
        catch (Exception exception){
            exception.getStackTrace();
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("save"));
            String string;
            String text = "";
            while ((string = reader.readLine()) != null){
                text += string + "\n";
            }
            textArea.setText(text);
            textArea.end();
        }
        catch (Exception e){
            e.getStackTrace();
        }
    }
}