package com.example.santab;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

import java.io.IOException;

public class HelloApplication extends Application {

    //boolean produccion = true;
    boolean produccion = false;

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
        Mascota m1 = new Mascota(
                "Rambo",
                "Dra. Martinez",
                null,
                "rescatado ruta 40",
                8.5,
                9.0,
                "19/09/2026",
                Mascota.TipoAnimal.Perro
        );

        System.out.println("--- PRUEBA GETTERS ---\n");
        System.out.println("ID autogenerado (Util): " + m1.getId());
        System.out.println("Alias: " + m1.getAlias());
        System.out.println("Veterinario: " + m1.getVeterinario());
        System.out.println("Historia Clínica: " + m1.getHistoriaClinica());
        System.out.println("Peso Inicial: " + m1.getPesoInicial() + " kg");
        System.out.println("Peso Actual: " + m1.getPesoActual() + " kg");
        System.out.println("Fecha Ingreso: " + m1.getFechIngreso());
        System.out.println("Tipo: " + m1.getTipo());

        m1.setAlias("RamboLa2");//JAJAJ  no sabia q ponerle
        m1.setPesoActual(10.4);
        m1.setHistoriaClinica("Recuperado, desparasitado y castrado");

        System.out.println("\n--- PRUEBA SETTERS ---\n");
        System.out.println("Nuevo Alias: " + m1.getAlias());
        System.out.println("Nuevo Peso Actual: " + m1.getPesoActual() + " kg");
        System.out.println("Nueva Historia Clínica: " + m1.getHistoriaClinica());
        System.out.println(" ");
        System.out.println("Instancia de Seguridad: " + Seguridad.getInstance());
        System.out.println("Instancia de Controlador: " + Controlador.getInstance());
        System.out.println("Instancia de Modelo: " + Modelo.getInstance());
    }
}
