package com.edvg.attendancemonitoring;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;


import java.net.URL;

public class Form {
    private Pane view;

    @FXML
    private ScrollPane Scrollsign;
    
    @FXML
    private Label forgotpass;

    @FXML
    private JFXButton Loginbtn;

    @FXML
    private JFXButton Signupbtn;

    @FXML
    void LoginEnter(MouseEvent event) {
        Loginbtn.setStyle("-fx-background-color: #FF4433; -fx-background-radius: 20px; -fx-scale-x: 1.07; -fx-scale-y: 1.07;");
    }

    @FXML
    void LoginExit(MouseEvent event) {
        Loginbtn.setStyle("-fx-background-color: #FF0000; -fx-background-radius: 20px;");
    }

    @FXML
    void SignupEnter(MouseEvent event) {
        Signupbtn.setStyle("-fx-background-color: #FF4433; -fx-background-radius: 20px; -fx-scale-x: 1.07; -fx-scale-y: 1.07;");
    }

    @FXML
    void SignupExit(MouseEvent event) {
        Signupbtn.setStyle("-fx-background-color: #FF0000; -fx-background-radius: 20px;");
    }

    @FXML
    void forgotenter(MouseEvent event) {
        forgotpass.setStyle("-fx-text-fill: #000000;");
    }

    @FXML
    void forgotexit(MouseEvent event) {
        forgotpass.setStyle("-fx-text-fill: #898585;");
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
