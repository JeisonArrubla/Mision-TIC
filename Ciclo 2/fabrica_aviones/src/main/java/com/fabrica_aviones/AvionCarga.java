package com.fabrica_aviones;

public class AvionCarga extends Avion {

    /*
     * HERENCIA:
     * 1. Extender super clase
     * 2. Recibir en el constructor los parámetros que la súper clase recibe
     * 3. Enviar a la súper clase los parámetros de su método constructor
     */

    public AvionCarga(String color, double tamanio) {
        super(color, tamanio);
    }

    @Override
    public String toString() {
        String info = "----------- AVION DE CARGA -----------";
        info += "\nColor: " + this.getColor();
        info += "\nTamaño: " + this.getTamanio();
        info += "\n";
        return info;
    }

    // ACCIONES
    public void cargar() {
        System.out.println("Cargando... 🔴");
    }

    public void descargar() {
        System.out.println("Descargando... 🟢");
    }
}
