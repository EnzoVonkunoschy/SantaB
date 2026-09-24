package com.example.santab;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

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

        System.out.println("");
        Mascota mascota1 = new Mascota();
        Usuario colaborador = new Usuario("Messi", null, "261123432", "colaborador");

        mascota1.setId(Util.getUUid());
        mascota1.setAlias("Gary");
        mascota1.setColaborador(colaborador);
        mascota1.setVeterinario("Doctor Calamardo");
        mascota1.setHistoriaClinica("Desconocido");
        mascota1.setEspecie(Mascota.Especie.GATO);
        mascota1.setPesoInicial(6.2);
        mascota1.setPesoActual(7.1);
        mascota1.setFechaIngreso(LocalDate.now());

        System.out.println("ID Mascota: " + mascota1.getId());
        System.out.println("Alias: " + mascota1.getAlias());
        System.out.println("Colaborador: " + mascota1.getColaborador().getNombre());
        System.out.println("Veterinario: " + mascota1.getVeterinario());
        System.out.println("Historia Clínica: " + mascota1.getHistoriaClinica());
        System.out.println("Especie: " + mascota1.getEspecie());
        System.out.println("Peso Inicial: " + mascota1.getPesoInicial());
        System.out.println("Peso Actual: " + mascota1.getPesoActual());
        System.out.println("Fecha Ingreso: " + mascota1.getFechaIngreso());
    }


}
