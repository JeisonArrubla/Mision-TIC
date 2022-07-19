package com.fabrica_aviones;

public class AvionCarga extends Avion {

    /*
     * 1. Extender super clase
     * 2. Recibir en el constructor los parámetros que la súper clase recibe
     * 3. Enviar a la súper clase los parámetros de su método constructor
     */
    
    public AvionCarga(String color, double tamanio){
        super(color, tamanio);
    }

    // ACCIONES
    public void cargar(){
        System.out.println("Cargando... 🔴");
    }

    public void descargar(){
        System.out.println("Descargando... 🟢");
    }
}
