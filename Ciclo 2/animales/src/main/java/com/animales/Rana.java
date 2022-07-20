package com.animales;

public class Rana extends Animal{
    
    private boolean ranaToro;

    public Rana(String color, double tamanio, int edad, String especie, boolean ranaToro){
        super(color, tamanio, edad, especie);
        this.ranaToro = ranaToro;
    }

    public boolean isRanaToro() {
        return ranaToro;
    }

    @Override
    public void avanzar() {
        // Polimorfismo
        System.out.println("Saltando... 🐸");
    }
}
