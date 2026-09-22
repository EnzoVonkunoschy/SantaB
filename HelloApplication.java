package com.example.santab;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.UUID;

public class HelloApplication extends Application {

    boolean produccion = false;
    //boolean produccion = false;

    @Override
    public void start(Stage stage) throws IOException {
        if(produccion) {
            v_Login.getInstance(stage);
        }else{
            test();
        }
    }

    private void test(){

        System.out.println("Corriendo test");

        //PRUEBA MASCOTAS constructor
        Mascota m1 =  new Mascota(UUID.randomUUID(),"prueba", null, "vet", "problemas renales", Especie.PERRO,5.5,8, LocalDate.now());

        System.out.println(m1);

        //PRUEBA MASCOTAS get y set

        m1.setAlias("Pepito");
        m1.setVeterinario("Alfonzo");

        System.out.println(m1.getAlias());
        System.out.println(m1.getVeterinario());

        System.out.println("________ MASCOTA ACTUALIZADA __________");
        System.out.println(m1);
    }
}
