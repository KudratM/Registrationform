package com.example.registration_form;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RegistrationForm extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Registration Form");

        // Create a GridPane to organize the form elements
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(10);
        grid.setHgap(10);

        // Create labels, text fields, and a button
        Label nameLabel = new Label("Name:");
        TextField nameTextField = new TextField();

        Label emailLabel = new Label("Email:");
        TextField emailTextField = new TextField();

        Label genderLabel = new Label("Gender:");
        ComboBox<String> genderComboBox = new ComboBox<>();
        genderComboBox.getItems().addAll("Male", "Female", "Other");

        Label countryLabel = new Label("Country:");
        ComboBox<String> countryComboBox = new ComboBox<>();
        countryComboBox.getItems().addAll("USA", "Canada", "UK", "Australia", "Other");

        Button registerButton = new Button("Register");
        registerButton.setOnAction(e -> {
            // Handle registration logic here (e.g., validation and saving data)
            String name = nameTextField.getText();
            String email = emailTextField.getText();
            String gender = genderComboBox.getValue();
            String country = countryComboBox.getValue();

            // In a real application, you'd process the registration data here
            System.out.println("Registration successful:");
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Gender: " + gender);
            System.out.println("Country: " + country);
        });

        // Add elements to the grid
        grid.add(nameLabel, 0, 0);
        grid.add(nameTextField, 1, 0);
        grid.add(emailLabel, 0, 1);
        grid.add(emailTextField, 1, 1);
        grid.add(genderLabel, 0, 2);
        grid.add(genderComboBox, 1, 2);
        grid.add(countryLabel, 0, 3);
        grid.add(countryComboBox, 1, 3);
        grid.add(registerButton, 0, 4, 2, 1);

        // Create a scene and set it in the stage
        Scene scene = new Scene(grid, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
