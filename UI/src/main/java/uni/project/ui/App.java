package uni.project.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import uni.project.simulation.Board;

import java.io.IOException;

public class App extends Application {
    private static Scene scene;
    @Override
    public void start(Stage stage) throws IOException {
        stage.initStyle(StageStyle.UNDECORATED);
        stage.getIcons().add(new Image("https://cdn.pixabay.com/photo/2020/04/29/08/24/coronavirus-5107804_960_720.png"));

        scene = new Scene(loadFXML("start"));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    static void setRoot(String fxml) throws IOException {
        Stage mainStage = (Stage) scene.getWindow();
        scene.setRoot(loadFXML(fxml));
    }
}