package com.fabrica_aviones;

public class AvionMilitar extends Avion {

    private int misiles;

    public AvionMilitar(String color, double tamanio, int misiles) {
        super(color, tamanio);
        this.misiles = misiles;
    }

    @Override
    public String toString() {
        String info = "----------- AVION MILITAR -----------";
        info += "\nColor: " + this.getColor();
        info += "\nTamaño: " + this.getTamanio();
        info += "\nMisiles: " + this.misiles;
        info += "\n";
        return info;
    }

    public int getMisiles() {
        return misiles;
    }

    public void setMisiles(int misiles) {
        this.misiles = misiles;
    }

    private void disparar() {
        System.out.println("Disparando... 🔫");
    }
}
