module com.example.client2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.client2 to javafx.fxml;
    exports com.example.client2;
}