package fr.amu.iut.exercice2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToe extends Application {

    @Override
    public void start(Stage primaryStage) {

        BorderPane root = new BorderPane();
        GridPane Game = new GridPane();
        Label grid1 = new Label();
        GridPane.setConstraints(grid1, 0, 0);
        Label grid2 = new Label();
        GridPane.setConstraints(grid2, 1, 0);
        Label grid3 = new Label();
        GridPane.setConstraints(grid3, 2, 0);
        Label grid4 = new Label();
        GridPane.setConstraints(grid4, 0, 1);
        Label grid5 = new Label();
        GridPane.setConstraints(grid5, 1, 1);
        Label grid6 = new Label();
        GridPane.setConstraints(grid6, 2, 1);
        Label grid7 = new Label();
        GridPane.setConstraints(grid7, 0, 2);
        Label grid8 = new Label();
        GridPane.setConstraints(grid8, 1, 2);
        Label grid9 = new Label();
        GridPane.setConstraints(grid9, 2, 2);
        Game.getChildren().addAll(grid1, grid2, grid3, grid4, grid5, grid6, grid7, grid8, grid9);


        ImageView croix = new ImageView("exercice2/Croix.png");
        ImageView rond = new ImageView("exercice2/Rond.png");
        ImageView vide = new ImageView("exercice2/Vide.png");

        grid1.setGraphic(croix);
        grid2.setGraphic(rond);
        grid3.setGraphic(croix);
//
//        grid4.setGraphic(vide);
//        grid5.setGraphic(croix);
//       grid6.setGraphic(rond);
//
//        grid7.setGraphic(rond);
//        grid8.setGraphic(rond);
//        grid9.setGraphic(croix);

        root.setCenter(Game);
        Scene scene = new Scene(root, 135, 145);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}

