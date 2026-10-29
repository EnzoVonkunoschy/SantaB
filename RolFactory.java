package com.example.santab;

public final class RolFactory {

    /*
     * mediante el método estático RolFactory().
     */
    private RolFactory() {
    }

    @SuppressWarnings("unchecked")
    public static <T extends Rol> T crear(String tipoRol, Object... parametros) {

        if (tipoRol == null || tipoRol.isBlank()) {
            throw new IllegalArgumentException("El tipo de rol no puede estar vacío.");
        }

        if (parametros == null || parametros.length == 0) {
            throw new IllegalArgumentException(
                    "Debe indicar los parámetros necesarios para crear el rol."
            );
        }

        Rol rol;

        switch (tipoRol.trim().toUpperCase()) {

            case "VETERINARIO":
                rol = new Veterinario(String.valueOf(parametros[0]));
                break;

            case "BENEFACTOR":
                if (!(parametros[0] instanceof Number numero)) {
                    throw new IllegalArgumentException(
                            "El monto del Benefactor debe ser numérico."
                    );
                }
                rol = new Benefactor(numero.doubleValue());
                break;

            case "COLABORADOR":
                if (!(parametros[0] instanceof Number numero)) {
                    throw new IllegalArgumentException(
                            "Las horas del Colaborador deben ser numéricas."
                    );
                }
                rol = new Colaborador(numero.intValue());
                break;

            default:
                throw new IllegalArgumentException(
                        "Rol desconocido: " + tipoRol
                );
        }

        return (T) rol;
    }
}
