package myGame;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    public Controller() {}
    public void showMyGame(Stage primaryStage) throws IOException {
        FXMLLoader loadGame = new FXMLLoader();
        loadGame.setLocation(Controller.class.getResource("myGame.fxml"));
        Scene scene= new Scene(loadGame.load());
        primaryStage.setTitle("MyGame");
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
