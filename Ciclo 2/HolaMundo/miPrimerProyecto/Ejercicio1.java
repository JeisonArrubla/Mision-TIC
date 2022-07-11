package miPrimerProyecto;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        // Capturar datos por consola
        /* Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor, ingrese su nombre: ");
        // Capturar un String
        String nombre = entrada.next();
        System.out.println("Su nombre es: "+nombre);

        System.out.print("Por favor, ingrese su edad: ");
        int edad = entrada.nextInt();

        System.out.print("Por favor, ingrese su nota: ");
        double nota = entrada.nextDouble();

        System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"\nNota: "+nota); */
        calcularNumeroSuerte();
    }

    public static void calcularNumeroSuerte(){
        // Crear objeto scanner para capturar datos por consola
        Scanner entrada = new Scanner(System.in);
        // Capturar día de nacimiento
        System.out.println("Por favor ingrese día de nacimiento: ");
        int dia = entrada.nextInt();
        // Capturar mes de nacimiento
        System.out.println("Por favor ingrese mes de nacimiento: ");
        int mes = entrada.nextInt();
        // Capturar año de nacimiento
        System.out.println("Por favor ingrese año de nacimiento: ");
        int anio = entrada.nextInt();
        // Obtener suma de dia,mes,anio
        String suma = ""+(dia+mes+anio);
        int numeroSuerte = Integer.parseInt(""+suma.charAt(0));
        numeroSuerte += Integer.parseInt(""+suma.charAt(1));
        numeroSuerte += Integer.parseInt(""+suma.charAt(2));
        numeroSuerte += Integer.parseInt(""+suma.charAt(3));
        System.out.println("Numero de la suerte -> "+numeroSuerte);
    }
}
