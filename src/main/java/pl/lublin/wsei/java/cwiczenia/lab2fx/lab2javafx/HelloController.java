package pl.lublin.wsei.java.cwiczenia.lab2fx.lab2javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    public Button btnMain;
    public int clicCounter;
    public TextField txtLicznik;

    public void onBtnAction(ActionEvent actionEvent) {
        txtLicznik.setText("Kliknięcie nr: "+ ++clicCounter);
        if (clicCounter==1)
            btnMain.setText("I jeszcze raz...");
    }


}