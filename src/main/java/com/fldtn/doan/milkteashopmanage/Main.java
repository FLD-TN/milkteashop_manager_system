package com.fldtn.doan.milkteashopmanage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;

import javax.swing.*;

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

        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();

        primaryStage.setWidth(1024);
        primaryStage.setHeight(768);

        primaryStage.setX(bounds.getMinX() + (bounds.getWidth() - 1024) / 2);
        primaryStage.setY(bounds.getMinY() + (bounds.getHeight() - 768) / 2);

        primaryStage.setResizable(true);
        primaryStage.setMinWidth(1024);
        primaryStage.setMinHeight(768);

        primaryStage.setMaximized(true);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
