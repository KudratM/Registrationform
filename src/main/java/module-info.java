module com.example.registration_form {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.registration_form to javafx.fxml;
    exports com.example.registration_form;
}