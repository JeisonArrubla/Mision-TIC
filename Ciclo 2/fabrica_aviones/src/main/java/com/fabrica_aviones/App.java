package com.fabrica_aviones;

public class App {
    public static void main(String[] args) {
        AvionCarga avionCarga = new AvionCarga("Blanco", 50.5);
        System.out.println("---------------------ATRIBUTOS---------------------");
        String color = avionCarga.getColor();
        double tamanio = avionCarga.getTamanio();
        System.out.println("Color: " + color + "\nTamaño: " + tamanio);
        System.out.println("---------------------ACCIONES---------------------");
        avionCarga.cargar();
        avionCarga.despegar();
        avionCarga.aterrizar();
        avionCarga.frenar();
        avionCarga.descargar();

        AvionPasajeros avionPasajeros = new AvionPasajeros("Amarillo", 80.7, 200);
        System.out.println("---------------------ATRIBUTOS---------------------");
        color = avionPasajeros.getColor();
        tamanio = avionPasajeros.getTamanio();
        int pasajeros = avionPasajeros.getPasajeros();
        System.out.println("Color: " + color + "\nTamaño: " + tamanio + "\nPasajeros: " + pasajeros);
        System.out.println("---------------------ACCIONES---------------------");
        avionPasajeros.despegar();
        avionPasajeros.aterrizar();
        avionPasajeros.frenar();
        avionPasajeros.servir();
    }

}
