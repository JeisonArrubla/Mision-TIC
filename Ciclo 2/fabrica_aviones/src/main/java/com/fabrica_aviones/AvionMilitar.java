package com.fabrica_aviones;

public class AvionMilitar extends Avion{
    
    private int misiles;

    public AvionMilitar(String color, double tamanio, int misiles){
        super(color, tamanio);
        this.misiles = misiles;
    }

    public int getMisiles() {
        return misiles;
    }

    public void setMisiles(int misiles) {
        this.misiles = misiles;
    }

    private void disparar(){
        System.out.println("Disparando... 🔫");
    }
}
