package com.edvg.attendancemonitoring;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;

public class AuthenticationForms {
    private Pane view;

    @FXML
    private ScrollPane scrollSign;
    
    @FXML
    private Label forgotPass;

    @FXML
    private JFXButton loginBtn;

    @FXML
    private JFXButton signupBtn;

    @FXML
    void loginMouseEnter(MouseEvent event) {
        loginBtn.setStyle("-fx-background-color: #FF4433; -fx-background-radius: 20px; -fx-scale-x: 1.07; -fx-scale-y: 1.07;");
    }

    @FXML
    void loginMouseExit(MouseEvent event) {
        loginBtn.setStyle("-fx-background-color: #FF0000; -fx-background-radius: 20px;");
    }

    @FXML
    void signupMouseEnter(MouseEvent event) {
        signupBtn.setStyle("-fx-background-color: #FF4433; -fx-background-radius: 20px; -fx-scale-x: 1.07; -fx-scale-y: 1.07;");
    }

    @FXML
    void signupMouseExit(MouseEvent event) {
        signupBtn.setStyle("-fx-background-color: #FF0000; -fx-background-radius: 20px;");
    }

    @FXML
    void forgotMouseEnter(MouseEvent event) {
        forgotPass.setStyle("-fx-text-fill: #000000;");
    }

    @FXML
    void forgotMouseExit(MouseEvent event) {
        forgotPass.setStyle("-fx-text-fill: #898585;");
    }


    @FXML
    void handleLoginBtn(ActionEvent event){
        Parent root = null;
        try {
             root = FXMLLoader.load(App.class.getResource("main-frame.fxml"));
        }catch (IOException e){
            e.printStackTrace();
        }

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setMaximized(true);
        stage.setMinWidth(1000);
        stage.setMinHeight(600);
        stage.show();

        loginBtn.getScene().getWindow().hide();

    }

    public Pane getPage(String filename) {

        try {
            URL fileUrl = App.class.getResource("/com/edvg/attendancemonitoring/" + filename + ".fxml");
            if(fileUrl == null){
                throw new java.io.FileNotFoundException("FXML file cant be found");
            }
            view = new  FXMLLoader().load(fileUrl);

        } catch (Exception e) {
            System.out.println("No page " +filename+ " please check PaneLoader");
        }

        return view;
    }
}
