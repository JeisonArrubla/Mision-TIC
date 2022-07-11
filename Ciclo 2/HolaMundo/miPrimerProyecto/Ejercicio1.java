package miPrimerProyecto;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        // Capturar datos por consola
        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor, ingrese su nombre: ");
        // Capturar un String
        String nombre = entrada.next();
        System.out.println("Su nombre es: "+nombre);
    }
}
