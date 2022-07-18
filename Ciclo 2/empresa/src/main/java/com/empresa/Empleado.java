package com.empresa;

public class Empleado {
    // ATRIBUTOS
    private String nombre;
    private int edad;
    private double sueldoBruto;

    // CONSTRUCTORES
    // SOBRECARGA DE MÉTODOS
    // Sobre carga de métodos -> Crear varios métodos con el mismo nombre pero con
    // comportamientos distintos
    public Empleado(String nombre, int edad, double sueldoBruto) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldoBruto = sueldoBruto;
    }

    public Empleado(String nombre, int edad) {
        // Se llama igual pero con parámetros distintos
        this.nombre = nombre;
        this.edad = edad;
    }

    public Empleado() {
        // Se llama igual pero sin parámetros
        this.nombre = "";
        this.edad = 0;
        this.sueldoBruto = 0.0;
    }

    // CONSULTORES - GETTERS

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    // MODIFICADORES - SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    // ACCIONES
    public void mostrar(){

    }

    public void calcularSalarioNeto(){
        
    }

}
