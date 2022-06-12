package pl.lublin.wsei.java.cwiczenia.lab2fx.lab2javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    public Button btnMain;
    public int clicCounter;

    public void onBtnAction(ActionEvent actionEvent) {
        System.out.println("Kliknięcie nr: "+ ++clicCounter);
        if (clicCounter==1)
            btnMain.setText("I jeszcze raz...");
    }
}