package uni.project.ui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StartController implements Initializable {
    @FXML
    private Button main;
    @FXML
    private Button settings;
    @FXML
    private Button exit;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        String startMusic = "sounds/start.mp3";
//        Media sound = new Media(new File(startMusic).toURI().toString());
//        MediaPlayer player = new MediaPlayer(sound);
//        player.play();

        settings.setOnMouseClicked(e ->{
            try {
                App.setRoot("settings");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        exit.setOnMouseClicked(e -> {
            Stage stage = (Stage) exit.getScene().getWindow();
            stage.close();
        });
    }
}