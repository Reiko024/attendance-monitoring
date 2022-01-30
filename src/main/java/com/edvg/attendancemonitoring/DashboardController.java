package com.edvg.attendancemonitoring;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {

    @FXML
    private AnchorPane mainPane;

    @FXML
    private ImageView CheckIcon;

    @FXML
    private ImageView PeopleIcon;

    @FXML
    private ImageView XIcon;

    @FXML
    private Label aboutText;

    @FXML
    private Label absentValue;

    @FXML
    private Label timedValue;

    @FXML
    private Label totalEmpValue;

    Stage stage;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Platform.runLater(() -> {
            stage = (Stage) mainPane.getScene().getWindow();
            aboutText.setPrefWidth(stage.getWidth()*0.8);

            stage.widthProperty().addListener(new ChangeListener<Number>() {
                @Override
                public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                    aboutText.setPrefWidth(stage.getWidth()*0.8);
                }
            });

            stage.iconifiedProperty().addListener(new ChangeListener<Boolean>() {
                @Override
                public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                    aboutText.setPrefWidth(stage.getWidth()*0.8);
                }
            });
            stage.maximizedProperty().addListener(new ChangeListener<Boolean>() {
                @Override
                public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                    aboutText.setPrefWidth(stage.getWidth()*0.8);
                }
            });
            stage.resizableProperty().addListener(new ChangeListener<Boolean>() {
                @Override
                public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                    aboutText.setPrefWidth(stage.getWidth()*0.8);

                }
            });
        });
    }
}
