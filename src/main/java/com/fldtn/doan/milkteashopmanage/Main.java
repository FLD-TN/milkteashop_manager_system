package com.fldtn.doan.milkteashopmanage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import javafx.scene.image.Image;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Home/Home.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Image icon = new Image(getClass().getResourceAsStream("/images/milktea_icon.png"));
        primaryStage.getIcons().add(icon);

        primaryStage.setTitle("Quản Lí Trà Sữa Futuree");
        scene.getStylesheets().add(getClass().getResource("/fxml/Home/style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();

        
    }

    public static void main(String[] args) {
        launch(args);
    }
}
