package com.example.santab;

public class Util {

    private static int contador = 0;

    public static String getId() {
        contador++;
        return String.valueOf(contador);
    }
}
