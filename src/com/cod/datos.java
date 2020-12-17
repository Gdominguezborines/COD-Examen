package com.cod;

public class datos {
    String nombre;
    String ip = "127.0.0.2";

    datos() {
        nombre = "anonymous@danielcastelao.org";
    }

    datos(String param1) {
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
