package com.cod;

/**
 * JavaDoc
 */
public class Main {
    public static void main(String[] args) {
        // creamos un objeto
        Datos miUnicaInstancia = Datos.getInstance();


        miUnicaInstancia.setDatos("pepe@danielcastelao.org");


        //   System.out.println(visualizar1("pepepep "));

        if (Datos.visualizar1("pepe@danielcastelao.org")) {
            System.out.println("Listo");

            //System.out.println(visualizar1("pepep "));
        } else {
            System.out.println("Fallo");

            // System.out.println(visualizar1("pepepep "));
        }

        Datos otraInstanciaSeraLaMisma = Datos.getInstance();

        otraInstanciaSeraLaMisma.setDatos("anonymous@danielcastelao.org");


        if (Datos.Conexion2()) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }


    }

}
