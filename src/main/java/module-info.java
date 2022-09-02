module com.example.lab_rab_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.lab_rab_javafx to javafx.fxml;
    exports com.example.lab_rab_javafx;
}