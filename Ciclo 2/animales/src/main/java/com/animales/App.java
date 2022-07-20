package com.animales;

public class App 
{
    public static void main( String[] args )
    {
        Animal[] animales = new Animal[3];

        // Crear animal y guardarlo en el array
        Rana rana = new Rana("verde", 15, 1, "anfibio", true);
        animales[0] = rana;

        Pez pez = new Pez("Naranja", 10, 1, "Acuático");
        animales[1] = pez;

        Perro perro = new Perro("Negro", 60, 2, "Canino", "Criollo");
        animales[2] = perro;

        for (int i = 0; i < animales.length; i++){
            // Ver polimorfismo en función:
            animales[i].avanzar();
        }

    }
}
