package com.empresa;

public class Empresa {
    // ATRIBUTOS
    private String nombre;
    private Empleado empleado; // Relación fuerte entre empresa y empleado

    // CONSTRUCTOR 
    // SOBRECARGA DE MÉTODOS
    public Empresa(String nombre){
        this.nombre = nombre;
    }

    public Empresa(){
        this.nombre = "";
    }

    // CONSULTORES - GETTERS

    public String getNombre(){
        return nombre;
    }

    public Empleado getEmpleado(){
        return empleado;
    }

    // MODIFICADORES - SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    // ACCIONES 
    public Cliente registrarCliente(){
        // 
        return ;
    }
    
}
