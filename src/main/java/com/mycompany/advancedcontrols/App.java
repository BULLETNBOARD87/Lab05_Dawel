package com.mycompany.advancedcontrols;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        GridPane aPane = new GridPane();
        TextField newItemField = new TextField();
        aPane.add(newItemField,0,0);
        Button addButton = new Button("Add");
        aPane.add(addButton,1,0);
        ListView<String> fruitList = new ListView<>();
        aPane.add(fruitList,0,1);
        Button removeButton = new Button("Remove");
        aPane.add(removeButton,1,1);
        
        GridPane.setValignment(removeButton, VPos.TOP);
        
        GridPane.setValignment(removeButton, VPos.TOP);
        addButton.setMinHeight(30);
        addButton.setMinWidth(100);
        removeButton.setMinHeight(30);
        removeButton.setMinWidth(100);
        newItemField.setMinHeight(30);

        fruitList.setPrefWidth(Integer.MAX_VALUE);
        fruitList.setPrefHeight(Integer.MAX_VALUE); 

        GridPane.setMargin(newItemField, new Insets(0, 0, 10, 0));
        GridPane.setMargin(addButton, new Insets(0, 0, 10, 10));
        GridPane.setMargin(removeButton, new Insets(0, 0, 0, 10));
        
        String[] fruits = {"Apples", "Oranges", "Bananas"};
        fruitList.setItems(FXCollections.observableArrayList(fruits));
        
        
        
        
        

        Scene scene = new Scene(aPane, 400, 300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}