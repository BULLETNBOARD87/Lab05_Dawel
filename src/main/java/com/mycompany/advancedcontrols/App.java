package com.mycompany.advancedcontrols;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class App extends Application {
    
    @Override
    public void start(Stage stage) {
        TextField textField = new TextField();
        ListView listView = new ListView();
        Button addButton = new Button("Add Item");
        Button removeButton = new Button("Remove Selected Item");
        Button removeAllButton = new Button("Remove All Items");
        Label counterLabel = new Label("Total items = 0");
           
        textField.setPrefSize(100, 30);
        addButton.setPrefSize(100, 30);
        
        removeButton.setPrefSize(220, 30);
        removeAllButton.setPrefSize(220, 30);
        
        listView.setPrefSize(120, 130);
        counterLabel.setPrefSize(120, 30);
        
        textField.setTranslateX(20);
        textField.setTranslateY(50);
        
        addButton.setTranslateX(140);
        addButton.setTranslateY(50);
        
        removeButton.setTranslateX(20);
        removeButton.setTranslateY(100);
        
        removeAllButton.setTranslateX(20);
        removeAllButton.setTranslateY(150);
        
        listView.setTranslateX(260);
        listView.setTranslateY(50);
        counterLabel.setTranslateX(20);
        counterLabel.setTranslateY(200);
        
        Group root = new Group();
        root.getChildren().add(textField);
        root.getChildren().add(addButton);
        root.getChildren().add(removeButton);
        root.getChildren().add(removeAllButton);
        root.getChildren().add(listView);
        root.getChildren().add(counterLabel);
        
        addButton.setOnAction((ActionEvent e) -> {
           String text = textField.getText();
           int counting = listView.getItems().size();
           
           if (text.isEmpty() || text.isBlank()) {
             System.out.println("Invalid!");
           } else {
             counting++;
             listView.getItems().add(text);
             textField.setText("");
             counterLabel.setText("Total Items = " + counting);
           }
          
        });
        
        removeButton.setOnAction((ActionEvent e) -> {
            int selectedIndex = listView.getSelectionModel().getSelectedIndex();
            listView.getItems().remove(selectedIndex);
            int counting = listView.getItems().size();
            counterLabel.setText("Total Items = " + counting);
        });

        
        

        Scene scene = new Scene(root, 400, 250);
        stage.setTitle("JavaFX listView");
        stage.setScene(scene);
        stage.show();
    }
    
    
    
    
    public static void main(String[] args) {
        launch();
    } 
}
