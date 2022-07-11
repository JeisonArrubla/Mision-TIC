package miPrimerProyecto;

public class HolaMundo {

    public static void main(String[] args) {

        // Mostrar mensaje en consola
        System.out.println("Hola mundo!!");
        System.out.print("Hola ");
        System.out.println("Mundo!");

        // VARIABLES
        int entero;
        entero = 10;
        double decimales = 5.5;
        boolean bandera = true;
        String nombre = "Jeison Arrubla";
        char caracter = 'a';

        // Concatenar dentro de un print
        System.out.println("Entero -> " + entero);
        System.out.println("Decimales -> " + decimales);
        System.out.println("Bandera -> " + bandera);
        System.out.println("Nombre -> " + nombre);
        System.out.println("Caracter -> " + caracter);

        // OPERACIONES
        double suma;
        suma = 10 + 10;
        double multiplicacion = 5*10;
        int modulo = 10%2;
        double division = 10/2;
        int resta = 10-5;

        suma += 10;
        multiplicacion *= 2;
        modulo %= 2;
        division /= 2;
        resta -= 2;

        System.out.println("Suma -> "+ suma);
        // Incrementa una unidad
        suma++;
        System.out.println("Suma -> " + suma);
        
        System.out.println("Resta -> "+ resta);
        // Decrementa una unidad
        resta--;
        System.out.println("Resta -> " + resta);

        System.out.println("Multiplicación -> "+ multiplicacion);

        System.out.println("División -> "+ division);

        System.out.println("Módulo -> "+ modulo);

        // Llamar funciones
        incremental();
        decremental();
        operadores_logicos();
        cadenas();
    }

    public static void incremental() {
        // Todas las funciones que se crean en la misma clase donde está el main debemos ponerle "static"

        // void quiere decir que no va retornar ningún dato, en caso contrario se debe colocar el tipo de dato que retorna (String, int, etc)
        System.out.println("-----------------------------INCREMENTAL-----------------------------");
        int x = 0;
        // Imprimir valor inicial de 'x'
        System.out.println(x);
        // INCREMENTAL
        System.out.println("INCREMENTAL");
        System.out.println(++x);
        System.out.println(++x);

        // POSTINCREMENTAL
        System.out.println("POSTINCREMENTAL");
        System.out.println(x++);
        System.out.println(x);
        x++;
        System.out.println(x);
    }

    public static void decremental(){
        System.out.println("------------------------------DECREMENTAL------------------------------");
        int x = 10;
        // Imprimir valor inicial de 'x'
        System.out.println(x);
        System.out.println("DECREMENTAL");
        System.out.println(--x);
        System.out.println(--x);

        // POSTDECREMENTAL
        System.out.println("POSTDECREMENTAL");
        System.out.println(x--);
        System.out.println(x);
    }

    public static void operadores_logicos() {
        int n1 = 10;
        int n2 = 10;
        int n3 = 5;
        int n4 = 8;
        boolean resultado; 

        resultado = n1 == n2;
        System.out.println(resultado);
        resultado = n1 > n3;
        System.out.println(resultado);
        resultado = n4 <= n3;
        System.out.println(resultado);
        resultado = n4 != n3;
        System.out.println(resultado);
    }

    public static void cadenas(){
        System.out.println("-----CONCATENANDO CADENAS------");
        String mensaje1 = "Hola mundo";
        String mensaje2 = "UTP Misión TIC 2022";
        int n1 = 10;
        double n2 = 3.1416;

        String mensaje = mensaje1 +" "+ mensaje2;
        System.out.println(mensaje);

        mensaje = mensaje1 +" "+ n1; // En Java, a diferencia de Python, podemos concatenar un String con otro tipo de dato
        System.out.println(mensaje);

        mensaje = mensaje2 +" "+ n2; // En Java, a diferencia de Python, podemos concatenar un String con otro tipo de dato
        System.out.println(mensaje);

        // -----------------
        // Convertir cadena/String a mayúscula
        mensaje = mensaje1.toUpperCase();
        System.out.println(mensaje);
        // Convertir a minúscula
        mensaje = mensaje.toLowerCase();
        System.out.println(mensaje);

        // -----------------
        // Obtener tamaño del String
        int tamanio = mensaje1.length();
        System.out.println(tamanio);

        // Obtener caracter a partir de su posición
        char caracter = mensaje1.charAt(5);
        System.out.println("Caracter -> "+caracter);

        // Obtener posición de un caracter (primera aparición)
        int index = mensaje1.indexOf('o'); // Retorna -1 si no lo encuentra
        System.out.println(index);

        // Igualar cadena de caracteres (String)
        mensaje1 = "HOLA";
        mensaje2 = "hola";
        boolean igual = mensaje1.equals(mensaje2); // case sensitive
        System.out.println("Igual -> "+igual);
        igual = mensaje1.equalsIgnoreCase(mensaje2);
        System.out.println("Igual -> "+igual);
    }
}