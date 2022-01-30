package com.edvg.attendancemonitoring;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import javafx.scene.image.ImageView;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.input.MouseEvent;


import java.net.URL;
import java.util.ResourceBundle;
import java.util.UUID;

public class QrFrameController implements Initializable {

    final BooleanProperty fTime = new SimpleBooleanProperty(true);

    QRCodeWriter qrCodeWriter = new QRCodeWriter();
    int width =200;
    int height = 200;

    @FXML
    private Label title;

    @FXML
    private ImageView qrImage;

    @FXML
    private TextField qrvalueField;

    @FXML
    void handleGenerateBtn(ActionEvent event) {
        UUID uid = UUID.randomUUID();
        System.out.println(uid);
        qrvalueField.setText(uid.toString());

        BufferedImage bufferedImage = null;

        try{
            BitMatrix bitMatrix = qrCodeWriter.encode(uid.toString(),BarcodeFormat.QR_CODE, width, height);
            bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            bufferedImage.createGraphics();

            Graphics2D graphics = (Graphics2D) bufferedImage.getGraphics();
            graphics.setColor(Color.WHITE);
            graphics.fillRect(0,0,width,height);
            graphics.setColor(Color.BLACK);

            for(int i = 0; i< height; i++){
                for(int j = 0 ; j < width; j++){
                    if(bitMatrix.get(i,j)){
                        graphics.fillRect(i,j,1,1);
                    }
                }
            }

            System.out.println("Success...");

        }
        catch (WriterException e) {
            e.printStackTrace();
        }

        qrImage.setImage(SwingFXUtils.toFXImage(bufferedImage,null));
    }


    @FXML
    void handlePrint(MouseEvent event) {

    }


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
