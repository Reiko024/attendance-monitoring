package com.edvg.attendancemonitoring;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class MainFrameController implements Initializable {

    @FXML
    private ImageView Profile;

    @FXML
    private Label dashboardBtn;

    @FXML
    private AnchorPane displayPane;

    @FXML
    private Label employeesBtn;

    @FXML
    private Label manualBtn;

    @FXML
    private Label monitoringBtn;

    @FXML
    private Label qrBtn;

    @FXML
    void enteredDashBoardBtn(MouseEvent event) {

    }

    @FXML
    void enteredEmployeesBtn(MouseEvent event) {

    }

    @FXML
    void enteredManualBtn(MouseEvent event) {

    }

    @FXML
    void enteredMonitoringBtn(MouseEvent event) {

    }

    @FXML
    void enteredQrBtn(MouseEvent event) {

    }

    @FXML
    void exitedDashBoardBtn(MouseEvent event) {

    }

    @FXML
    void exitedEmployeesBtn(MouseEvent event) {

    }

    @FXML
    void exitedManualBtn(MouseEvent event) {

    }

    @FXML
    void exitedMonitoringBtn(MouseEvent event) {

    }

    @FXML
    void exitedQrBtn(MouseEvent event) {

    }

    @FXML
    void handleDashboardBtn(MouseEvent event) {
        dashboardBtn.setTextFill(Color.rgb(255, 255, 255));
        qrBtn.setTextFill(Color.rgb(48, 48, 47));
        employeesBtn.setTextFill(Color.rgb(48, 48, 47));
        monitoringBtn.setTextFill(Color.rgb(48, 48, 47));
        manualBtn.setTextFill(Color.rgb(48, 48, 47));


    }

    @FXML
    void handleEmployeesBtn(MouseEvent event) {
        dashboardBtn.setTextFill(Color.rgb(48, 48, 47));
        qrBtn.setTextFill(Color.rgb(48, 48, 47));
        employeesBtn.setTextFill(Color.rgb(255, 255, 255));
        monitoringBtn.setTextFill(Color.rgb(48, 48, 47));
        manualBtn.setTextFill(Color.rgb(48, 48, 47));
    }

    @FXML
    void handleManualBtn(MouseEvent event) {
        dashboardBtn.setTextFill(Color.rgb(48, 48, 47));
        qrBtn.setTextFill(Color.rgb(48, 48, 47));
        employeesBtn.setTextFill(Color.rgb(48, 48, 47));
        monitoringBtn.setTextFill(Color.rgb(48, 48, 47));
        manualBtn.setTextFill(Color.rgb(255, 255, 255));
    }

    @FXML
    void handleMonitoringBtn(MouseEvent event) {
        dashboardBtn.setTextFill(Color.rgb(48, 48, 47));
        qrBtn.setTextFill(Color.rgb(48, 48, 47));
        employeesBtn.setTextFill(Color.rgb(48, 48, 47));
        monitoringBtn.setTextFill(Color.rgb(255, 255, 255));
        manualBtn.setTextFill(Color.rgb(48, 48, 47));
    }

    @FXML
    void handleQrBtn(MouseEvent event) {
        dashboardBtn.setTextFill(Color.rgb(48, 48, 47));
        qrBtn.setTextFill(Color.rgb(255, 255, 255));
        employeesBtn.setTextFill(Color.rgb(48, 48, 47));
        monitoringBtn.setTextFill(Color.rgb(48, 48, 47));
        manualBtn.setTextFill(Color.rgb(48, 48, 47));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dashboardBtn.setTextFill(Color.rgb(255, 255, 255));
    }
}
