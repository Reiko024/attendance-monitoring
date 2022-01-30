module com.edvg.attendancemonitoring {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires com.jfoenix;

    opens com.edvg.attendancemonitoring to javafx.fxml;
    exports com.edvg.attendancemonitoring;
}