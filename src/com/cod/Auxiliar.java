package com.cod;

public class Auxiliar {
    String nombre;
    String ip = "127.0.0.2";

    Auxiliar() {
        nombre = "anonymous@danielcastelao.org";
    }

    Auxiliar(String param1) {
        this.nombre = param1;
    }

    public boolean con() {
        if (nombre != "anonymous@danielcastelao.org") {
            return true;
        } else {
            return false;
        }
    }
}
