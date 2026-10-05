package com.example.santab;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.plaf.basic.BasicButtonUI;

public class v_Login {

    private static v_Login instance;


    private v_Login(Stage stage){

        Button btn = new Button("Acceder");
        Label lbl = new Label("Login");

        VBox panel = new VBox();
        panel.getChildren().addAll(lbl, btn);

        btn.setOnAction(e -> {
            System.out.println("Acceso libre al sistema.");
            v_Menu menu = v_Menu.getInstance(stage, new Usuario("", "Bart", "1234", "261-1-123456", "admin"));
        });


        Scene sce = new Scene(panel, 300, 300);
        stage.setScene(sce);

        stage.setTitle("Santa Bernardita");
        stage.show();

    };

    public static v_Login getInstance(Stage stage){
        if(instance == null){
            instance = new v_Login(stage);

        }

        return instance;

    }

}
