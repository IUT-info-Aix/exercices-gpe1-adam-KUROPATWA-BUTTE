package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Pos;




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
        root.setTop(menuBar);

        VBox vbox = new VBox();
        Label label = new Label("Bouton");
        Button button1 = new Button("Bouton1");
        Button button2 = new Button("Bouton2");
        Button button3 = new Button("Bouton3");
        vbox.getChildren().addAll(label, button1, button2, button3);
        vbox.setSpacing(10);
        vbox.setAlignment(Pos.CENTER);
        root.setLeft(vbox);

        HBox hbox = new HBox();
        Label label1 = new Label("Ceci est un label de bas de page");
        hbox.getChildren().add(label1);
        hbox.setAlignment(Pos.CENTER);
        root.setBottom(hbox);

        GridPane grid = new GridPane();
        Label NameText = new Label("Name:");
        GridPane.setConstraints(NameText, 1, 0);
        TextField name = new TextField();
        GridPane.setConstraints(name, 2, 0);
        Label EmailText = new Label("Email:");
        GridPane.setConstraints(EmailText, 1, 2);
        TextField email = new TextField();
        GridPane.setConstraints(email, 2, 2);
        Label PasswordText = new Label("Password:");
        GridPane.setConstraints(PasswordText, 1, 3);
        TextField password = new TextField();
        GridPane.setConstraints(password, 2, 3);
        grid.getChildren().addAll(NameText, name, email, EmailText, PasswordText, password);
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);

        HBox hboxcenter = new HBox();
        Button submit = new Button("Submit");
        Button cancel = new Button("Cancel");
        hboxcenter.getChildren().addAll(submit, cancel);
        hboxcenter.setAlignment(Pos.CENTER);
        hboxcenter.setSpacing(10);

        VBox vboxcenter = new VBox();
        vboxcenter.getChildren().addAll(grid, hboxcenter);
        vboxcenter.setAlignment(Pos.CENTER);
        vboxcenter.setSpacing(10);

        root.setCenter(vboxcenter);

        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    //test commit

    }
}

