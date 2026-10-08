package com.example.santab;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

import java.io.IOException;
import java.time.LocalDate;

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

        //instancio Persona
        Persona p1 = new Persona("","lalo landa");
        Persona p2 = new Persona("","Juan Fernandez");
        Persona p3 = new Persona("", "lalo landa");

        //instancio los roles
        //son iguales para la prueba de equals
        Veterinario veterinario1 = new Veterinario("74GG-SI");
        Veterinario veterinario2 = new Veterinario("74GG-SI");

        Benefactor benefactor1 = new Benefactor(50000.0);
        Benefactor benefactor2 = new Benefactor(50000.0);

        Colaborador colaborador1 = new Colaborador(20);
        Colaborador colaborador2 = new Colaborador(20);

        //le asigno diferentes roles a una sola persona
        p1.agregarRol(veterinario1);
        p1.agregarRol(benefactor1);
        p1.agregarRol(colaborador1);



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

        //prueba de los getters y setters de persona
        System.out.println("");
        System.out.println("");
        System.out.println("--prueba de los getters y setters--");

        System.out.println("Persona ID autogenerado: " + p1.getId());
        p1.setId("PERS-999");
        System.out.println("Persona nuevo ID: " + p1.getId());
        System.out.println("Persona nombre original: " + p1.getNombre());
        p1.setNombre("Peter");
        System.out.println("Persona nuevo nombre: " + p1.getNombre());
        System.out.println("Persona lista de roles: " + p1.getRoles().size() + " roles asociados");

        System.out.println("");
        System.out.println("---VETERINARIO----");
        veterinario1.setMatricula("99XX-SI");
        System.out.println("Matrícula: " + veterinario1.getMatricula());
        System.out.println("Fecha asignado: " + veterinario1.getFechaAsignado());
        veterinario1.setFechaAsignado(LocalDate.of(2026, 5, 15));
        System.out.println("Nueva fecha: " + veterinario1.getFechaAsignado());
        System.out.println("Activo original: " + veterinario1.isActivo());
        veterinario1.setActivo(false);
        System.out.println("Nuevo estado activo: " + veterinario1.isActivo());
        veterinario1.setActivo(true); //pongo de vuelta true para que se pueda imprimir bien el toString

        System.out.println("");
        System.out.println("------BENEFACTOR-----");
        benefactor1.setMontoCuota(60000.0);
        System.out.println("Monto cuota (setMontoCuota/getMontoCuota): " + benefactor1.getMontoCuota());
        System.out.println("Fecha asignado (getFechaAsignado): " + benefactor1.getFechaAsignado());
        benefactor1.setFechaAsignado(LocalDate.of(2026, 5, 15));
        System.out.println("Nueva fecha (setFechaAsignado/getFechaAsignado): " + benefactor1.getFechaAsignado());
        benefactor1.desactivar();
        System.out.println("Estado tras desactivar (isActivo): " + benefactor1.isActivo());
        benefactor1.setActivo(true); //pongo de vuelta true para que se pueda imprimir bien el toString

        System.out.println("");
        System.out.println("-----COLABORADOR----");
        colaborador1.setHorasDisponibles(30);
        System.out.println("Horas disponibles: " + colaborador1.getHorasDisponibles());
        System.out.println("Fecha asignado: " + colaborador1.getFechaAsignado());
        colaborador1.setFechaAsignado(LocalDate.of(2026, 5, 15));
        System.out.println("Nueva fecha: " + colaborador1.getFechaAsignado());
        System.out.println("Activo: " + colaborador1.isActivo());
        colaborador1.setActivo(false);
        System.out.println("Nuevo estado activo: " + colaborador1.isActivo());

        System.out.println("");
        System.out.println("---PRUEBA DE EQUALS---");
        System.out.println("¿p1 es igual a p2?: " + p1.equals(p2));
        p1.setNombre("Lalo Landa"); // le pongo de vuelta el nombre anterior para compararlo con p3

        System.out.println("¿p1 es igual a p3?: " + p1.equals(p3));
        System.out.println("¿veterinario1 es igual a veterinario2?: " + veterinario1.equals(veterinario2));
        System.out.println("¿benefactor1 es igual a benefactor2?: " + benefactor1.equals(benefactor2));
        System.out.println("¿colaborador1 es igual a colaborador2?: " + colaborador1.equals(colaborador2));

        System.out.println("");
        System.out.println("--TOSTRING ---");
        System.out.println("toString Persona: " + p1.toString());
        System.out.println("toString Veterinario: " + veterinario1.toString());
        System.out.println("toString Benefactor: " + benefactor1.toString());
        System.out.println("toString Colaborador: " + colaborador1.toString());

        //imprimo las tres personas
        System.out.println("");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());


    }
}
