package com.edvg.attendancemonitoring;

import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SplashScreenController implements Initializable {

    @FXML
    private ProgressBar progressBar;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Task<Void> task = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                double max = 100;
                for(int i =0; i<=max;i++){
                    updateProgress(i,max);
                    Thread.sleep(100);
                }

                Platform.runLater(()->{
                    Parent root = null;
                    try {
                        root = FXMLLoader.load(App.class.getResource("login-screen.fxml"));

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    Scene scene = new Scene(root);
                    Stage stage = new Stage();
                    //stage.initStyle(StageStyle.UNDECORATED);
                    stage.setScene(scene);
                    stage.centerOnScreen();
                    stage.show();

                    progressBar.getScene().getWindow().hide();

                });
                return null;
            }
        };

        progressBar.progressProperty().bind(task.progressProperty());
        new Thread(task).start();

    }
}
