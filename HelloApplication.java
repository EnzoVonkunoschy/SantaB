package com.example.santab;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Optional;

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

        System.out.println("\n==============================================");
        //Test pedidos a la ia como dijo el profe q se podia xd
        System.out.println("TEST: ");
        System.out.println("==============================================\n");

        // Instancia objetos de la clase Persona
        System.out.println("--- 1. Instanciar objetos de la clase Persona ---");
        Persona p1 = new Persona("Carlos Perez", "2615551234");
        Persona p2 = new Persona("Carlos Perez", "2615551234");
        Persona p3 = new Persona("Ana Garcia", "2614449876");

        System.out.println("Persona p1: " + p1.getNombre() + " (ID: " + p1.getId() + ")");
        System.out.println("Persona p2: " + p2.getNombre() + " (ID: " + p2.getId() + ")");
        System.out.println("Persona p3: " + p3.getNombre() + " (ID: " + p3.getId() + ")");

        // Setters y getters de Persona
        System.out.println("\n--- 2. Getters y Setters de Persona ---");
        System.out.println("p1 Nombre inicial: " + p1.getNombre());
        p1.setNombre("Carlos Alberto Perez");
        System.out.println("p1 Nombre modificado: " + p1.getNombre());
        p1.setNombre("Carlos Perez");

        System.out.println("p1 Mobil inicial: " + p1.getMobil());
        p1.setMobil("2619998877");
        System.out.println("p1 Mobil modificado: " + p1.getMobil());
        p1.setMobil("2615551234");

        // prueba setters y getters de los tres tipos de Rol
        System.out.println("\n--- 3. Getters y Setters de los tres tipos de Roles ---");

        // Tipo 1: Veterinario
        Veterinario vet = new Veterinario();
        vet.setMatricula("VET-1024");
        vet.setFechaInicio(LocalDate.now());
        vet.setActivo(true);
        System.out.println("Veterinario -> Matricula: " + vet.getMatricula()
                + ", FechaInicio: " + vet.getFechaInicio()
                + ", Activo: " + vet.getActivo());

        // Tipo 2: Benefactor
        Benefactor ben = new Benefactor();
        ben.setMontoCuota(15000);
        ben.setFechaInicio(LocalDate.now());
        ben.setActivo(true);
        System.out.println("Benefactor -> MontoCuota: " + ben.getMontoCuota()
                + ", FechaInicio: " + ben.getFechaInicio()
                + ", Activo: " + ben.getActivo());

        // Tipo 3: Colaborador
        Colaborador col = new Colaborador();
        col.setHorasDisponibles(10);
        col.setFechaInicio(LocalDate.now());
        col.setActivo(true);
        System.out.println("Colaborador -> HorasDisponibles: " + col.getHorasDisponibles()
                + ", FechaInicio: " + col.getFechaInicio()
                + ", Activo: " + col.getActivo());

        // Agregar roles y probar tieneRol y getRol (retornando Optional)
        System.out.println("\n--- 4. Agregar Roles a Persona y probar Optional ---");
        p1.agregarRol(vet);
        p1.agregarRol(col);


        // Probando tieneRol pasando el OBJETO directamente (Sobrecarga de método)
        System.out.println("¿p1 tiene el objeto vet?: " + p1.tieneRol(vet));
        System.out.println("¿p1 tiene el objeto ben?: " + p1.tieneRol(ben));

        // Obtener rol como Optional
        Optional<Rol> optVet = p1.getRol(Veterinario.class);
        if (optVet.isPresent()) {
            Veterinario v = (Veterinario) optVet.get();
            System.out.println("Optional Veterinario presente: matricula = " + v.getMatricula());
        }

        Optional<Rol> optBen = p1.getRol(Benefactor.class);
        System.out.println("Optional Benefactor presente: " + optBen.isPresent());

        // 5. Métodos toString
        System.out.println("\n--- 5. Prueba de toString ---");
        System.out.println("toString p1: " + p1.toString());
        System.out.println("toString Veterinario: " + vet.toString());
        System.out.println("toString Benefactor: " + ben.toString());
        System.out.println("toString Colaborador: " + col.toString());

        // 6. Métodos equals
        System.out.println("\n--- 6. Prueba de equals ---");
        p2.agregarRol(vet);
        p2.agregarRol(col);

        System.out.println("¿p1 equals p2? (mismo nombre, mobil y roles): " + p1.equals(p2));
        System.out.println("¿p1 equals p3? (distinta persona): " + p1.equals(p3));

        Veterinario vet2 = new Veterinario();
        vet2.setMatricula("VET-1024");
        vet2.setFechaInicio(vet.getFechaInicio());
        vet2.setActivo(true);
        System.out.println("¿vet equals vet2? (misma matricula y fecha): " + vet.equals(vet2));
    }
}
