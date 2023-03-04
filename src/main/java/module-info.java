module com.example.githupdersi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.githupdersi to javafx.fxml;
    exports com.example.githupdersi;
}