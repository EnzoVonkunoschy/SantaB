package com.example.santab;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

import java.io.IOException;
import java.util.UUID;

public class HelloApplication extends Application {

    // boolean produccion = true;
    // boolean produccion = false;
    boolean produccion = false;

    @Override
    public void start(Stage stage) throws IOException {
        if (produccion) {
            v_Login.getInstance(stage);
        } else {
            test();
        }
    }

    private void test() {
        System.out.println("Test");
        Mascota m1 = new Mascota("Rambo", "Dra. Martinez", null, "rescatado ruta 40", 8.5, 9.0, "17/09/2026",
                Mascota.TipoAnimal.Perro);

        Usuario u1 = new Usuario("", "Admin", "1234", "261111155", "Administrador");
        Usuario u2 = new Usuario("", "Admin", "1234", "261111155", "Administrador");
        Usuario u3 = new Usuario("", "Invitado", "0000", "261000000", "Lector");

        System.out.println("Getters y setters de mascota\n");
        System.out.println("Mascota ID autogenerado: " + m1.getId());
        System.out.println("Mascota Alias Original: " + m1.getAlias());
        m1.setAlias("Rambo: First Blood Part II");// jajaj lo mejore
        System.out.println("Mascota Nuevo Alias: " + m1.getAlias());

        System.out.println();

        System.out.println("Getters y setters de Usuario\n");
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

        System.out.println("\n--- Test Persona/Roles ---");

        // ==== PRUEBA DE PERSONA-ROLES-VETERINARIO, BENEFACTOR, COLABORADOR ====
        Persona per1 = new Persona(" ", "Joaquin", "12345");
        Persona per2 = new Persona(" ", "Esteban", "54321");
        Persona per3 = new Persona("", "Lucho", "3124123");
        Persona per4 = new Persona("", "Tomas", "12314121");
        Persona per5 = new Persona(" ", "Luiz", "12345");

        Veterinario vet1 = new Veterinario("123");
        Veterinario vet2 = new Veterinario("1235");
        Benefactor ben1 = new Benefactor(123);
        Colaborador col1 = new Colaborador(44444);

        // Asignar roles a personas individulamente
        per1.agregarRol(vet1);
        per2.agregarRol(col1);
        per3.agregarRol(ben1);

        // 2 Roles para 1 persona
        per4.agregarRol(ben1);
        per4.agregarRol(vet2);

        System.out.println("\n--- Persona presentación ---");
        System.out.println(per1.getNombre());
        System.out.println(per2.getNombre());
        System.out.println(per3.getNombre());
        System.out.println(per4.getNombre());

        // Vemos que los roles si esten asociados a Personas correctamente.
        // Comprobar que tieneRol funcione correctamente, dando false cuando no se tiene
        // el rol Y true cuando cuenten con este.
        System.out.println("\n--- Prueba roles presentes ---");
        System.out.println(per1.getNombre() + " ¿Tiene rol veterinario? " + per1.tieneRol(Veterinario.class)); // true
        System.out.println(per1.getNombre() + " ¿Tiene rol benefactor? " + per1.tieneRol(Benefactor.class)); // false
        System.out.println(per2.getNombre() + " ¿Tiene rol colaborador? " + per2.tieneRol(Colaborador.class)); // true
        System.out.println(per3.getNombre() + " ¿Tiene rol benefactor? " + per3.tieneRol(Benefactor.class)); // true

        // Persona sin roles
        System.out.println("\n--- Persona sin roles ---");
        System.out.println(per5.getNombre() + " ¿Tiene rol veterinario? " + per5.tieneRol(Veterinario.class)); // true
        System.out.println(per5.getNombre() + " ¿Tiene rol benefactor? " + per5.tieneRol(Benefactor.class)); // false
        System.out.println(per5.getNombre() + " ¿Tiene rol colaborador? " + per5.tieneRol(Colaborador.class)); // true

        // Comprobar el correcto funcionamiento de Multi-rol (Herencia simple)
        System.out.println("\n--- Multiples roles en una sola persona ---");
        System.out.println(per4.getNombre() + " ¿Tiene rol veterinario? " + per4.tieneRol(Veterinario.class));
        System.out.println(per4.getNombre() + " ¿Tiene rol benefactor? " + per4.tieneRol(Benefactor.class));

        System.out.println("\n--- Perdona Metodo getRol ---");
        System.out.println(per1.getRol(Benefactor.class));
        System.out.println(per1.getRol(Veterinario.class)); // El unico rol que tiene adjunta esta persona.
        System.out.println(per1.getRol(Colaborador.class));

        // Remover y agregar rol
        System.out.println("\n--- Sacar y agregar roles ---");
        System.out.println(per1.getNombre() + " ¿Tiene rol veterinario? " + per1.tieneRol(Veterinario.class));
        per1.removerRol(vet1); // se remueve el rol
        System.out.println(per1.getNombre() + " ¿Tiene rol veterinario? " + per1.tieneRol(Veterinario.class));
        per1.agregarRol(vet1);
        System.out.println(per1.getNombre() + " ¿Tiene rol veterinario? " + per1.tieneRol(Veterinario.class));

        // Getters y setters de Persona
        System.out.println("\nGetters y setters de Persona\n");
        System.out.println("Persona ID autogenerado: " + per1.getId());
        System.out.println("Persona Nombre Original: " + per1.getNombre());
        per1.setNombre("Joaquin Modificado");
        System.out.println("Persona Nuevo Nombre: " + per1.getNombre());
        per1.setNombre("Joaquin");
        System.out.println("Persona Mobil Original: " + per1.getMobil());
        per1.setMobil("999999999");
        System.out.println("Persona Nuevo Mobil: " + per1.getMobil());
        per1.setMobil("12345");
        String idOriginalPersona = per1.getId();
        per1.setId("ID-TEST-001");
        System.out.println("Persona Nuevo ID: " + per1.getId());
        per1.setId(idOriginalPersona);

        // Getters y setters de Benefactor
        System.out.println("\nGetters y setters de Benefactor\n");
        System.out.println("Benefactor Monto Cuota Original: " + ben1.getMontoCuota());
        ben1.setMontoCuota(25000.0);
        System.out.println("Benefactor Nuevo Monto Cuota: " + ben1.getMontoCuota());

        // Getters y setters de Colaborador
        System.out.println("\nGetters y setters de Colaborador\n");
        System.out.println("Colaborador Horas Disponibles Original: " + col1.getHorasDisponibles());
        col1.setHorasDisponibles(20);
        System.out.println("Colaborador Nuevas Horas Disponibles: " + col1.getHorasDisponibles());

        // Getters y métodos de estado de Rol
        System.out.println("\nGetters y setters / Métodos de estado de Rol\n");
        System.out.println("Rol Fecha Inicio: " + ben1.getFechaInicio());
        System.out.println("Rol Activo Original: " + ben1.isActivo());
        ben1.desactivarRol();
        System.out.println("Rol Activo tras desactivar: " + ben1.isActivo());
        ben1.activarRol();
        System.out.println("Rol Activo tras reactivar: " + ben1.isActivo());

        // Getters y setters de Veterinario
        System.out.println("\nGetters y setters de Veterinario\n");
        System.out.println("Veterinario Matrícula Original: " + vet1.getMatriculaProfesional());
        vet1.setMatriculaProfesional("MP-9999");
        System.out.println("Veterinario Nueva Matrícula: " + vet1.getMatriculaProfesional());

    }
}
