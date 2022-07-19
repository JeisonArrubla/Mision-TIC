package com.empresa;

import java.util.Scanner;

public class Empresa {
    // ATRIBUTOS
    private String nombre;
    private Empleado empleado; // Relación fuerte entre empresa y empleado

    // CONSTRUCTOR
    // SOBRECARGA DE MÉTODOS
    public Empresa(String nombre) {
        this.nombre = nombre; 
    }

    public Empresa() {
        this.nombre = "";
    }

    // CONSULTORES - GETTERS

    public String getNombre() {
        return nombre;
    }

    public Empleado getEmpleado() {
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
    public void crearEmpleado(Scanner leer) {
        try{
            System.out.print("Por favor ingrese el nombre del empleado: ");
            String nombre = leer.next();

            System.out.print("Por favor ingrese la edad del empleado: ");
            int edad = leer.nextInt();
            leer.nextLine(); // Para capturar el salto de línea y no genere error en la próxima solicitud de datos

            empleado = new Empleado(nombre, edad);

        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public Cliente registrarCliente(Scanner leer) {
        Cliente cliente = new Cliente();

        try{

            System.out.print("Ingrese el nombre del cliente: ");
            String nombre = leer.next();

            System.out.print("Ingrese el apellido del cliente: ");
            String apellido = leer.next();

            cliente = new Cliente(nombre, apellido);

        }catch(Exception error){
            System.out.println(error.getMessage());
        }

        return cliente;
    }

}
