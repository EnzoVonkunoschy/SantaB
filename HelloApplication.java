package com.example.santab;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

import java.io.IOException;

public class HelloApplication extends Application {

    //boolean produccion = true;
    //boolean produccion = false;
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
        System.out.println("Test");
        Mascota m1 = new Mascota("Rambo", "Dra. Martinez", null, "rescatado ruta 40", 8.5, 9.0, "17/09/2026", Mascota.TipoAnimal.Perro);


        Usuario u1 = new Usuario("", "Admin", "1234", "261111155", "Administrador");
        Usuario u2 = new Usuario("", "Admin", "1234", "261111155", "Administrador");
        Usuario u3 = new Usuario("", "Invitado", "0000", "261000000", "Lector");

        System.out.println( "Getters y setters de mascota\n");
        System.out.println("Mascota ID autogenerado: " + m1.getId());
        System.out.println("Mascota Alias Original: " + m1.getAlias());
        m1.setAlias("Rambo: First Blood Part II");// jajaj lo mejore
        System.out.println("Mascota Nuevo Alias: " + m1.getAlias());

        System.out.println();

        System.out.println( "Getters y setters de Usuario\n");
        System.out.println("Usuario ID autogenerado: " + u1.getId());
        System.out.println("Usuario Nombre Original: " + u1.getNombre());
        u1.setNombre("SuperAdmin");
        System.out.println("Usuario Nuevo Nombre: " + u1.getNombre());
        u1.setNombre("Admin");

        System.out.println("\ntostring de mascota y despues de usuari\n");
        // Prueba de toString en ambas clases
        System.out.println(m1.toString());
        System.out.println(u1.toString());


        System.out.println("\nprueba de las instancias seguridad, controlador y modelo\n");
        System.out.println("Seguridad: " + Seguridad.getInstance());
        System.out.println("Controlador: " + Controlador.getInstance());
        System.out.println("Modelo: " + Modelo.getInstance());
        System.out.println("\nprueba de equals\n");

        System.out.println("¿u1 es igual a u2?: " + u1.equals(u2));
        System.out.println("¿U1 es igual a u3?: " + u1.equals(u3));

    }
}
