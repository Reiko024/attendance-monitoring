package com.edvg.attendancemonitoring;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.util.Duration;

import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class LoginScreenController implements Initializable {

    int count;

//    @FXML
//    private Pane pane;

    @FXML
    private BorderPane borderPane;

    @FXML
    private ImageView sideImage;

    @FXML
    private Pane loginBtnIndicator;

    @FXML
    private Label loginBtnTxt;

    @FXML
    private Pane signupBtnIndicator;

    @FXML
    private Label signupBtnTxt;

    @FXML
    void loginClicked(MouseEvent event) {
        AuthenticationForms object = new AuthenticationForms();
        Pane view = object.getPage("login");
        borderPane.setCenter(view);
    }

    @FXML
    void signupClicked(MouseEvent event){
        AuthenticationForms object = new AuthenticationForms();
        Pane view = object.getPage("signup");
        borderPane.setCenter(view);
    }

    @FXML
    void handleLoginIndicatorBtn(MouseEvent event) {
        loginBtnTxt.setTextFill(Color.rgb(255, 0, 0));
        loginBtnIndicator.setStyle("-fx-background-color: #FF0000; ");

        signupBtnTxt.setTextFill(Color.rgb(128, 128, 128));
        signupBtnIndicator.setStyle("-fx-background-color: transparent; ");
    }

    @FXML
    void handleSignupIndicatorBtn(MouseEvent event) {
        loginBtnTxt.setTextFill(Color.rgb(128, 128, 128));
        loginBtnIndicator.setStyle("-fx-background-color: transparent; ");

        signupBtnTxt.setTextFill(Color.rgb(255,0,0));
        signupBtnIndicator.setStyle("-fx-background-color: #FF0000; ");
    }


    public void slideShow() throws URISyntaxException {
        ArrayList<Image> images = new ArrayList<Image>();
        images.add(new Image(getClass().getResource("/img/office.jpg").toURI().toString()));
        images.add(new Image(getClass().getResource("/img/meeting.jpg").toURI().toString()));
        images.add(new Image(getClass().getResource("/img/workspace.jpg").toURI().toString()));

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(5), event ->{
            sideImage.setImage(images.get(count));
            count++;
            if(count == 3)
                count=0;
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadUI("login.fxml");
        try {
            slideShow();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    private void loadUI(String s){
          AuthenticationForms object = new AuthenticationForms();
          Pane view = object.getPage("login");
          borderPane.setCenter(view);
    }
}
