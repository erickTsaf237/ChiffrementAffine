module com.example.chiffrementaffine {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chiffrementaffine to javafx.fxml;
    exports com.example.chiffrementaffine;
}