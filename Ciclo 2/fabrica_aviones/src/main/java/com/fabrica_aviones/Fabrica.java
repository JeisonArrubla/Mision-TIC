package com.fabrica_aviones;

public class Fabrica {

    private Avion[] aviones;

    public Fabrica() {
        // Crear array de tipo Avion
        aviones = new Avion[50];
    }

    public void fabricar_avion(TipoAvion tipoAvion) {
        switch (tipoAvion) {
            case AVION_CARGA:
                AvionCarga avionCarga = new AvionCarga("Azul", 20.5);
                almacenar_avion(avionCarga);
                break;

            case AVION_COMERCIAL:
                AvionPasajeros avionPasajeros = new AvionPasajeros("Blanco", 30, 150);
                almacenar_avion(avionPasajeros);
                break;

            case AVION_MILITAR:
                AvionMilitar avionMilitar = new AvionMilitar("Gris", 10, 5);
                almacenar_avion(avionMilitar);
                break;
        }
    }

    public Avion getAvion(int posicion) {
        return aviones[posicion];
    }

    public void almacenar_avion(Avion avion) {
        int tamanio = aviones.length;
        for (int i = 0; i < tamanio; i++) {
            if (aviones[i] == null) {
                aviones[i] = avion;
                break;
            }
        }
    }

    public void mostrar_aviones() {
        for (int i = 0; i < aviones.length; i++) {
            if(aviones[i] != null) System.out.println(aviones[i]);
        }
    }
}
