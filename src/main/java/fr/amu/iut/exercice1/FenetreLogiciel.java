package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class FenetreLogiciel extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        root.setTop(new Button("File"));

        Scene scene = new Scene(root, 100, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    //test commit

    }
}

