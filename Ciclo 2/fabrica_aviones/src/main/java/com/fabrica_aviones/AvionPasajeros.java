package com.fabrica_aviones;

public class AvionPasajeros extends Avion {

    private int pasajeros;

    public AvionPasajeros(String color, double tamanio, int pasajeros) {
        super(color, tamanio);
        this.pasajeros = pasajeros;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void servir() {
        System.out.println("En servicio... ✈️");
    }

}
