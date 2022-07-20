package com.fabrica_aviones;

public class App {
    public static void main(String[] args) {

        Fabrica objFabrica = new Fabrica();
        objFabrica.fabricar_avion(TipoAvion.AVION_CARGA);
        objFabrica.fabricar_avion(TipoAvion.AVION_COMERCIAL);
        objFabrica.fabricar_avion(TipoAvion.AVION_MILITAR);

        objFabrica.mostrar_aviones();

    }

}
