package com.animales;

public class Perro extends Animal {

    private String raza;

    public Perro(String color, double tamanio, int edad, String especie, String raza) {
        super(color, tamanio, edad, especie);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public void avanzar() {
        // Polimorfismo
        System.out.println("Caminando... 🐕");
    }

}
