package com.cod;

public class Main {
    public static void main(String[] args) {
        // creamos un objeto
        Datos otraInstanciaSeraLaMisma= Datos.getInstance();
        Datos miUnicaInstancia = Datos.getInstance();



        if (visualizar1("anonymous@danielcastelao.org")) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }

        if (visualizar2()) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }

    }
// cambio new  para hacer llamada a get.instance
    public static boolean visualizar1(String u) {
        Datos persona1 =  Datos.getInstance();
        System.out.println("Conectando a " + persona1.ip + ", con el usuario " + u);
        return persona1.con();
    }

    public static boolean visualizar2() {
        Datos persona2 =  Datos.getInstance();
        System.out.println("Conectando a " + persona2.ip + ", con el usuario " + persona2.nombre);
        return persona2.con();
    }
}
