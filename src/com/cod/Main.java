package com.cod;

public class Main {
    public static void main(String[] args) {
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
        ;
    }

    public static boolean visualizar1(String u) {
        Auxiliar persona1 = new Auxiliar(u);
        System.out.println("Conectando a " + persona1.ip + ", con el usuario " + u);
        return persona1.con();
    }

    public static boolean visualizar2() {
        Auxiliar persona2 = new Auxiliar();
        System.out.println("Conectando a " + persona2.ip + ", con el usuario " + persona2.nombre);
        return persona2.con();
    }
}
