package com.example.santab;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class v_Menu {

    private static v_Menu instance;

    private v_Menu(Stage stage, Usuario usu){

        Label lblMenu = new Label("Aquí va el menú");

        VBox panel = new VBox();

        panel.getChildren().addAll(lblMenu);

        Scene scene = new Scene(panel, 300, 300);


        stage.setScene(scene);
        stage.setTitle("Santa Bernardita Menú");
        stage.show();

    }

    public static v_Menu getInstance(Stage stage, Usuario usu){
        if(instance == null){
            instance = new v_Menu(stage, usu);

        }
            return instance;


    }
}
