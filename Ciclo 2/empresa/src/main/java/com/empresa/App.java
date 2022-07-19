package com.empresa;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner leer = new Scanner(System.in); 
        Empresa objEmpresa = new Empresa("Tesla");
        objEmpresa.crearEmpleado(leer);
        System.out.println(objEmpresa.getEmpleado());
        Cliente objCliente = objEmpresa.registrarCliente(leer);
        System.out.println(objCliente);

        // Empleado emp = new Empleado("Jeison", 20);
        // System.out.println(emp);
    }
}
