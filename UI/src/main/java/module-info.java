module uni.project.ui {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires uni.project.simulation;
    requires org.kordamp.ikonli.fontawesome;
    requires javafx.media;

    opens uni.project.ui to javafx.fxml, javafx.media, javafx.base, javafx.graphics;
    exports uni.project.ui;
}