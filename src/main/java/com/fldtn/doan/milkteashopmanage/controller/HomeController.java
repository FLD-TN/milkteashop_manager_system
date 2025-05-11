package com.fldtn.doan.milkteashopmanage.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {

    @FXML
    private BorderPane mainContent;

    @FXML
    public void navigateToUsersManage(javafx.event.ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Layouts/UsersManage/UsersManage.fxml"));
            Parent root = loader.load();

            // Get the current stage from the event source
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

            // Set the new scene
            stage.setScene(new Scene(root));
            System.out.println("Navigated to UsersManage.fxml successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void showUsersManage() {
        try {
            Parent usersManage = FXMLLoader.load(getClass().getResource("/fxml/Layouts/UsersManage/UsersManage.fxml"));
            mainContent.setCenter(usersManage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
