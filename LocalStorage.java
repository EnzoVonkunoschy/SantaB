package com.example.santab;

import java.io.*;

public class LocalStorage {
    // Serialización
    public static void setItem(String nombre, Object objeto){
        try {
            FileOutputStream archivoSalida = new FileOutputStream(nombre);
            ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
            objetoSalida.writeObject(objeto);
            objetoSalida.close();
            archivoSalida.close();
            System.out.println("Objeto serializado y guardado en personas.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object getItem(String nomArchivo){
        //Linea agregada para que no tire error la primera vez que se ejecuta cuando no esta el archivo
        File archivo = new File(nomArchivo);
        if (!archivo.exists()) {
            return null;
        }

        // Deserialización
        Object objetoDeserializado = null;
        try {
            FileInputStream archivoEntrada = new FileInputStream(nomArchivo);
            ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);
            objetoDeserializado = objetoEntrada.readObject();
            objetoEntrada.close();
            archivoEntrada.close();
            System.out.println("Objeto deserializado desde personas.txt");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return objetoDeserializado;
    }
}