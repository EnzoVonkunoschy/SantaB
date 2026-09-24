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
        System.out.println("================ Instacia original ================");
        //PRUEBA MASCOTAS constructor
        Mascota m1 =  new Mascota(UUID.randomUUID(),
                "prueba", null, "vet", "problemas renales", Especie.PERRO,5.5,8, LocalDate.now());

        System.out.println(m1);

        //PRUEBA MASCOTAS get y set

        m1.setAlias("Pepito");
        m1.setVeterinario("Alfonzo");
        m1.setColaborador("colaborador");
        m1.setHistoriaClinica("problemas respiratorios");
        m1.setEspecie(Especie.GATO);
        m1.setPesoInicial(6);
        m1.setPesoActual(9.3);
        m1.setFechaIngreso(LocalDate.now());
        m1.setId(UUID.randomUUID());


        System.out.println("================ Prueba de GET y SET ================");
        System.out.printf("ID:                %s%n", m1.getId());
        System.out.printf("Alias:             %s%n", m1.getAlias());
        System.out.printf("Especie:           %s%n", m1.getEspecie());
        System.out.printf("Veterinario:       %s%n", m1.getVeterinario());
        System.out.printf("Colaborador:       %s%n", m1.getColaborador());
        System.out.printf("Fecha de Ingreso:  %s%n", m1.getFechaIngreso());
        System.out.printf("Peso Inicial:      %.1f kg%n", m1.getPesoInicial());
        System.out.printf("Peso Actual:       %.1f kg%n", m1.getPesoActual());
        System.out.printf("Historia Clínica:  %s%n", m1.getHistoriaClinica());
        System.out.println("==================================================");



        System.out.println("________ MASCOTA ACTUALIZADA __________");
        System.out.println(m1.toString());
    }
}
