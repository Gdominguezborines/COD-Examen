package com.cod;

public class Datos {
    private static Datos instance =null;
    String nombre;
    String ip = "127.0.0.2";

    Datos() {
        nombre = "anonymous@danielcastelao.org";
    }

    Datos(String param1) {
        this.nombre = param1;
    }


    /**
     * Segun exista o no ya el objeto lo instanciamos o cambiamos los datos
     * @return la instancia. Si no existe la crea primero
     */
    public static Datos getInstance() {
        // compruebo si ya está creada
        if (instance == null) {
            // como no está creada, la creo
            // desde aqui si que puedo acceder al constructor
            // porque estoy en la misma clase
            instance = new Datos();
        }
        // devuelvo la instancia
        return instance;
    }

    /**
     *
     * @return metodo que retorna true o false segun
     */


    public boolean con() {
        if (nombre != "anonymous@danielcastelao.org") {
            return true;
        } else {
            return false;
        }
    }
}
