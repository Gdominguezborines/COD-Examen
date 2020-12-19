package com.cod;

public class Datos {

    String ip = "127.0.0.2";
    String nombre;


    public Datos() {

    }

    public void setDatos(String param1) {
        this.nombre = param1;

        // System.out.println(nombre);
    }


    /**
     * @return metodo que retorna true o false segun
     */


    public boolean con() {
        //  System.out.println("el nombre que entra es "+nombre+"     222\n");

        if (nombre != "anonymous@danielcastelao.org") {
            return true;
        } else {
            return false;
        }
    }


    /**
     * @param u
     * @return
     */
    public static boolean visualizar1(String usuario) {
        Datos persona1 = getInstance();
        // System.out.println(persona1.nombre+"   aqui falla\n");

        System.out.println("Conectando a " + persona1.ip + ", con el usuario " + usuario);
        return persona1.con();
    }

    /**
     * @return
     */
    public static boolean Conexion2() {
        Datos persona2 = Datos.getInstance();
        System.out.println("Conectando a " + persona2.ip + ", con el usuario " + persona2.nombre);
        return persona2.con();
    }


    /**
     * Segun exista o no ya el objeto lo instanciamos o cambiamos los datos
     *
     * @return la instancia. Si no existe la crea primero
     */
    private static Datos instance;

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

// cambio new  para hacer llamada a get.instance


}
