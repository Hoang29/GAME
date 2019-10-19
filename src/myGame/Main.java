package myGame;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import myGame.Controller;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Controller m = new Controller();
        Stage stage = new Stage();
        Button b = new Button("Click me");
        primaryStage.setTitle("MyGame");
        b.setLayoutY(40);
        b.setLayoutX(40);

        b.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                try {
                    m.showMyGame(stage);
                    primaryStage.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        Group root = new Group();
        root.getChildren().addAll(b);
        primaryStage.setHeight(500);
        primaryStage.setWidth(500);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
