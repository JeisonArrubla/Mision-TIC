package com.empresa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Empresa objEmpresa = new Empresa("Tesla");
        Cliente objCliente = objEmpresa.registrarCliente();
    }
}
