package com.edvg.attendancemonitoring;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainFrameController implements Initializable {

    String currentClickedOption = "dashboard";

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
        if(!currentClickedOption.equals("dashboard"))
        dashboardBtn.setTextFill(Color.rgb(255, 255, 255));

    }

    @FXML
    void exitedDashBoardBtn(MouseEvent event) {
        if(!currentClickedOption.equals("dashboard"))
        dashboardBtn.setTextFill(Color.rgb(48, 48, 47));
    }

    @FXML
    void enteredQrBtn(MouseEvent event) {
        if(!currentClickedOption.equals("qr"))
        qrBtn.setTextFill(Color.rgb(255, 255, 255));
    }

    @FXML
    void exitedQrBtn(MouseEvent event) {
        if(!currentClickedOption.equals("qr"))
        qrBtn.setTextFill(Color.rgb(48, 48, 47));
    }

    @FXML
    void enteredEmployeesBtn(MouseEvent event) {
        if(!currentClickedOption.equals("employees"))
        employeesBtn.setTextFill(Color.rgb(255, 255, 255));
    }

    @FXML
    void exitedEmployeesBtn(MouseEvent event) {
        if(!currentClickedOption.equals("employees"))
        employeesBtn.setTextFill(Color.rgb(48, 48, 47));
    }

    @FXML
    void enteredMonitoringBtn(MouseEvent event) {
        if(!currentClickedOption.equals("monitor"))
        monitoringBtn.setTextFill(Color.rgb(255, 255, 255));
    }

    @FXML
    void exitedMonitoringBtn(MouseEvent event) {
        if(!currentClickedOption.equals("monitor"))
        monitoringBtn.setTextFill(Color.rgb(48, 48, 47));
    }

    @FXML
    void enteredManualBtn(MouseEvent event) {
        if(!currentClickedOption.equals("manual"))
        manualBtn.setTextFill(Color.rgb(255, 255, 255));
    }

    @FXML
    void exitedManualBtn(MouseEvent event) {
        if(!currentClickedOption.equals("manual"))
        manualBtn.setTextFill(Color.rgb(48, 48, 47));
    }




    @FXML
    void handleDashboardBtn(MouseEvent event) {

        currentClickedOption = "dashboard";

        loadDisplay("dashboard.fxml");

        dashboardBtn.setTextFill(Color.rgb(255, 255, 255));
        qrBtn.setTextFill(Color.rgb(48, 48, 47));
        employeesBtn.setTextFill(Color.rgb(48, 48, 47));
        monitoringBtn.setTextFill(Color.rgb(48, 48, 47));
        manualBtn.setTextFill(Color.rgb(48, 48, 47));


    }

    @FXML
    void handleEmployeesBtn(MouseEvent event) {

        currentClickedOption = "employees";

        dashboardBtn.setTextFill(Color.rgb(48, 48, 47));
        qrBtn.setTextFill(Color.rgb(48, 48, 47));
        employeesBtn.setTextFill(Color.rgb(255, 255, 255));
        monitoringBtn.setTextFill(Color.rgb(48, 48, 47));
        manualBtn.setTextFill(Color.rgb(48, 48, 47));
    }

    @FXML
    void handleManualBtn(MouseEvent event) {

        currentClickedOption = "manual";

        dashboardBtn.setTextFill(Color.rgb(48, 48, 47));
        qrBtn.setTextFill(Color.rgb(48, 48, 47));
        employeesBtn.setTextFill(Color.rgb(48, 48, 47));
        monitoringBtn.setTextFill(Color.rgb(48, 48, 47));
        manualBtn.setTextFill(Color.rgb(255, 255, 255));
    }

    @FXML
    void handleMonitoringBtn(MouseEvent event) {

        currentClickedOption = "monitor";

        dashboardBtn.setTextFill(Color.rgb(48, 48, 47));
        qrBtn.setTextFill(Color.rgb(48, 48, 47));
        employeesBtn.setTextFill(Color.rgb(48, 48, 47));
        monitoringBtn.setTextFill(Color.rgb(255, 255, 255));
        manualBtn.setTextFill(Color.rgb(48, 48, 47));
    }

    @FXML
    void handleQrBtn(MouseEvent event) {

        currentClickedOption = "qr";

        loadDisplay("qr-frame.fxml");

        dashboardBtn.setTextFill(Color.rgb(48, 48, 47));
        qrBtn.setTextFill(Color.rgb(255, 255, 255));
        employeesBtn.setTextFill(Color.rgb(48, 48, 47));
        monitoringBtn.setTextFill(Color.rgb(48, 48, 47));
        manualBtn.setTextFill(Color.rgb(48, 48, 47));
    }

    public void loadDisplay(String ui){
        Node node = null;
        try{
            node = FXMLLoader.load(getClass().getResource(ui));
        }catch (IOException e){
            e.printStackTrace();
        }
        displayPane.getChildren().clear();
        displayPane.getChildren().setAll(node);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dashboardBtn.setTextFill(Color.rgb(255, 255, 255));
        loadDisplay("dashboard.fxml");
    }
}
