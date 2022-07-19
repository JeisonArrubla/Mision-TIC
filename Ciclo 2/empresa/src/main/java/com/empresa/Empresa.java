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

        crearEmpleado();
        // Al momento de crear una empresa vamos a crear un empleado, por eso el método se llama desde el constructor 
    }

    public Empresa() {
        this.nombre = "";

        crearEmpleado();
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
    public void crearEmpleado() {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.print("Por favor ingrese el nombre del empleado: ");
            String nombre = leer.next();

            System.out.print("Por favor ingrese la edad del empleado: ");
            int edad = leer.nextInt();
            leer.nextLine(); // Para evitar errores después del nextInt por salto de línea

            empleado = new Empleado(nombre, edad);

        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public Cliente registrarCliente() {
        Cliente cliente = new Cliente();

        try(Scanner leer = new Scanner(System.in)){

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
