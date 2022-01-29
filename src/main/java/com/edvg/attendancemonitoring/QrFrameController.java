package com.edvg.attendancemonitoring;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class QrFrameController implements Initializable {

    final BooleanProperty fTime = new SimpleBooleanProperty(true);

    @FXML
    private Label title;

    @FXML
    private TextField qrvalueField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        qrvalueField.focusedProperty().addListener((observable, oldValue, newValue)->{
            if(newValue && fTime.get()){
                title.requestFocus();
                fTime.setValue(false);
            }
        });
    }
}
