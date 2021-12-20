module com.example.sda_pr {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.project to javafx.fxml;
    exports com.project;
}