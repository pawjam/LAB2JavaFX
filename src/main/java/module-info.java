module pl.lublin.wsei.java.cwiczenia.lab2fx.lab2javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens pl.lublin.wsei.java.cwiczenia.lab2fx.lab2javafx to javafx.fxml;
    exports pl.lublin.wsei.java.cwiczenia.lab2fx.lab2javafx;
}