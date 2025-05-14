package com.fldtn.doan.milkteashopmanage.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class HomeController {

    @FXML
    private BorderPane mainContent;

    @FXML
    public void showDashboard() {
        try {
            Parent usersManage = FXMLLoader.load(getClass().getResource("/Layout/Layouts/Dashboard/Dashboard.fxml"));
            mainContent.setCenter(usersManage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void showUsersManage() {
        try {
            // Clear the current content in mainContent
            mainContent.setCenter(null);

            // Load and set the new content
            Parent usersManage = FXMLLoader.load(getClass().getResource("/Layout/Layouts/UsersManage/UsersManage.fxml"));
            mainContent.setCenter(usersManage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void showProductsManage()
    {
        try {
            Parent productsManage = FXMLLoader.load(getClass().getResource("/Layout/Layouts/ProductsManage/ProductsManage.fxml"));
            mainContent.setCenter(productsManage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setMainContent(Parent content) {
        mainContent.setCenter(content);
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


}
