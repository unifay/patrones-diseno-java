package com.unifay.patrones.java;

import java.util.ArrayList;
import java.util.List;

public class Empleado {

    private String nombre;
    private String departamento;
    private int salario;
    private List<Empleado> subordinados;

    public Empleado(String nombre, String departamento, int salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
        this.subordinados = new ArrayList<>();
    }

    public List<Empleado> getSubordinados() {
        return subordinados;
    }

    public void agregar(Empleado empleado) {
        subordinados.add(empleado);
    }

    public void remover(Empleado empleado) {
        subordinados.remove(empleado);
    }

    @Override
    public String toString() {
        return "com.unifay.patrones.java.Empleado{" +
                "nombre='" + nombre + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                '}';
    }
}