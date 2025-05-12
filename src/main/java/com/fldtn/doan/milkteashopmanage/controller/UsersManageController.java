package com.fldtn.doan.milkteashopmanage.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class UsersManageController {

    @FXML
    public void backToDashboard(ActionEvent event) {
        try {
            // Load the FXML and CSS
             Parent root =  FXMLLoader.load(getClass().getResource("/Layout/Layouts/Home/Home.fxml"));
       

            // Add CSS if exists
            String cssPath = "/Layout/Layouts/Home/style.css";
            if (getClass().getResource(cssPath) != null) {
                root.getStylesheets().add(getClass().getResource(cssPath).toExternalForm());
            }

            // Get current stage and set new scene
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            System.err.println("Error loading Home.fxml: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @FXML
    private void initialize() {
        // Initialization code if needed
    }
}
