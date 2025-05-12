package com.fldtn.doan.milkteashopmanage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application { 
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root  =  FXMLLoader.load(getClass().getResource("/Layout/Layouts/Home/Home.fxml"));
        Scene scene = new Scene(root);

        Image icon = new Image(getClass().getResourceAsStream("/images/milktea_icon.png"));
        primaryStage.getIcons().add(icon);

        primaryStage.setTitle("Quản Lí Trà Sữa Futuree");
        scene.getStylesheets().add(getClass().getResource("/Layout/Layouts/Home/style.css").toExternalForm());

        // Set default and minimum window size
        primaryStage.setWidth(1270);
        primaryStage.setHeight(730);
        primaryStage.setMinWidth(1270);
        primaryStage.setMinHeight(730);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}