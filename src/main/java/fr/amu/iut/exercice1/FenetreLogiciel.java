package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Scene;



public class FenetreLogiciel extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();


        MenuItem ItemmenuFile1 = new MenuItem("New");
        MenuItem ItemmenuFile2 = new MenuItem("Open");
        MenuItem ItemmenuFile3 = new MenuItem("Save");
        MenuItem ItemmenuFile4 = new MenuItem("Close");

        MenuItem ItemmenuEdit1 = new MenuItem("Cut");
        MenuItem ItemmenuEdit2 = new MenuItem("Copy");
        MenuItem ItemmenuEdit3 = new MenuItem("Paste");


        Menu menu1 = new Menu("File");
        menu1.getItems().addAll(ItemmenuFile1, ItemmenuFile2, ItemmenuFile3, ItemmenuFile4);
        Menu menu2 = new Menu("Edit");
        menu2.getItems().addAll(ItemmenuEdit1, ItemmenuEdit2, ItemmenuEdit3);
        Menu menu3 = new Menu("Help");

        MenuBar menuBar = new MenuBar(menu1, menu2, menu3);


        Scene scene = new Scene(menuBar, 350, 350);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    //test commit

    }
}

