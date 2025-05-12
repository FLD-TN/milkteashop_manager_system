package com.fldtn.doan.milkteashopmanage.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {

    @FXML
    private BorderPane mainContent;

    @FXML
    public void navigateToUsersManage(javafx.event.ActionEvent event) {

        System.out.println("Navigating to UsersManage.fxml");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Layout/Layouts/UsersManage/UsersManage.fxml"));
            Parent root = loader.load();

            // Get the current stage from the event source
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

            // Set the new scene
            stage.setScene(new javafx.scene.Scene(root));
            System.out.println("Navigated to UsersManage.fxml successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void showUsersManage() {
        System.out.println("The function Work");
        try {
            Parent usersManage = FXMLLoader.load(getClass().getResource("/Layout/Layouts/UsersManage/UsersManage.fxml"));
            mainContent.setCenter(usersManage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // @FXML
    // public void showProductManage() {
    //     try {
    //         Parent productManage = FXMLLoader.load(getClass().getResource("/fxml/Layouts/ProductManage.fxml"));
    //         mainContent.setCenter(productManage);
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    // }

    // @FXML
    // public void showDashboard() {
    //     mainContent.setCenter(new Label("Welcome to the Dashboard!"));
    // }
}
