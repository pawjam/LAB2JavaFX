package pl.lublin.wsei.java.cwiczenia.lab2fx.lab2javafx;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class KalkulatorstaliController {
    public static final DecimalFormat df= new DecimalFormat("0.00");
    public TextField wys;
    public TextField grub;
    public Button oblicz;
    public TextArea wynik;
    public TextField prom;


    public void Oblicz(ActionEvent actionEvent) {
        double r=Double.parseDouble(prom.getText());
        double h=Double.parseDouble(wys.getText());
        double l=Double.parseDouble(grub.getText());
        final double pi=3.14;
        final double gestoscStali=7.9; //gr na cm3
        final double gestoscStaliNierdzewnej=7.8; //gr na cm3
        final double V1=(r*r)*pi*h; //pełny walec
        r=r-(l/10);
        final double V2=(r*r)*pi*h; //walec pełny mały
        final double V3=V1-V2;//walec pusty w środku
        final double W1=(V3*gestoscStali)/1000;//w kg
        final double W2=(V3*gestoscStaliNierdzewnej)/1000;// w kg
        final double cenaStali=1.4;//zł za kg
        final double cenaStaliNierdzewnej=5; //zł za kg
        final double WynikStal=W1*cenaStali;
        final double WynikStalNierdzewna=W2*cenaStaliNierdzewnej;
        wynik.setText("Objętość walca wynosi: "+df.format(V3)+" cm3 \n"+
        "Waga walca ze stali wynosi: "+df.format(W1)+" kg\n"+
                        "Waga walca ze stali nierdzewnej wynosi: "+df.format(W2)+" kg\n"+
                "Cena stali: "+df.format(cenaStali)+" zł/kg\n"+
                        "Cena stali nierdzewnej: "+df.format(cenaStaliNierdzewnej)+" zł/kg\n"+
                "Całkowity koszt dla walca ze stali: "+df.format(WynikStal)+" zł\n"
                +"Całkowity koszt dla walca ze stali: "+df.format(WynikStalNierdzewna)+" zł\n"
        );





    }
}
