package com.edvg.attendancemonitoring;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class App extends Application {


    Parent root;
    @Override
    public void start(Stage stage) throws IOException {
        root =  FXMLLoader.load(App.class.getResource("splashscreen.fxml"));
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.centerOnScreen();
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}