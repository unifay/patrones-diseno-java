package com.unifay.patrones.java;

public class CompositePatron {

    public static void main(String[] args) {

        Empleado presidente = new Empleado("Anthony", "presidencia", 100000);

        Empleado directorMarketing = new Empleado("Abrahams", "Jefe de Marketing", 30000);
        Empleado directorVentas = new Empleado("Josue", "Jefe de Ventas", 30000);

        Empleado empleadoMarketingA = new Empleado("Carlos", "Marketing", 10000);
        Empleado empleadoMarketingB = new Empleado("Juliana", "Marketing", 10000);

        Empleado empleadoVentasA = new Empleado("Maria", "Ventas", 10000);
        Empleado empleadoVentasB = new Empleado("Jose", "Ventas", 10000);

        presidente.agregar(directorMarketing);
        presidente.agregar(directorVentas);

        directorMarketing.agregar(empleadoMarketingA);
        directorMarketing.agregar(empleadoMarketingB);

        directorVentas.agregar(empleadoVentasA);
        directorVentas.agregar(empleadoVentasB);

        System.out.println(presidente);
        presidente.getSubordinados().stream().map(x -> {
            System.out.println(x);
            return x.getSubordinados();
        }).forEach(y -> y.forEach(System.out::println));

    }
}