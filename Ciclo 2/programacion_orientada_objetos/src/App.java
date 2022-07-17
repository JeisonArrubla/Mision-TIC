public class App {
    public static void main(String[] args) throws Exception {
        // Construir un objeto de tipo Persona
        Persona objPersona1 = new Persona("Jeison","Arrubla",27,"1039",'M');
        //Obtener el nombre y apellido
        String nombre = objPersona1.getNombre();
        String apellido = objPersona1.getApellido();
        // Imprimir en consola
        System.out.println("Nombre: "+nombre+"\nApellido: "+apellido);
        System.out.println("------------------------------------------\n------------------------------------------");

        // Cambiar nombre y apellido
        objPersona1.setNombre("JEISON");
        objPersona1.setApellido("ARRUBLA");
        nombre = objPersona1.getNombre();
        apellido = objPersona1.getApellido();
        // Imprimir en consola
        System.out.println("Nombre: "+nombre+"\nApellido: "+apellido);

        // Crear más personas
        Persona objPersona2 = new Persona("Juliana","Sandoval",18,"1152",'F');
        objPersona2.setTelefono("3123546789");
        objPersona2.setEmail("juliana@gmail.com");

        Persona objPersona3 = new Persona("Laila","Narváez",17,"1139",'F');
        objPersona3.setTelefono("3205667890");
        objPersona3.setEmail("laila@gmail.com");

        Persona objPersona4 = new Persona("Luis","Perez",35,"43591",'M');

        Persona objPersona5 = new Persona("Luisa","Montoya",60,"52698",'F');

        // Obtener valor nómina
        double nomina;
        apellido = objPersona1.getApellido();
        nomina = objPersona1.calcular_nomina(10);
        System.out.println(apellido+" - Nómina: "+nomina);

        apellido = objPersona2.getApellido();
        nomina = objPersona2.calcular_nomina(240);
        System.out.println(apellido+" - Nómina: "+nomina);

        apellido = objPersona3.getApellido();
        nomina = objPersona3.calcular_nomina(10);
        System.out.println(apellido+" - Nómina: "+nomina);

        apellido = objPersona4.getApellido();
        nomina = objPersona4.calcular_nomina(10);
        System.out.println(apellido+" - Nómina: "+nomina);

        apellido = objPersona5.getApellido();
        nomina = objPersona5.calcular_nomina(10);
        System.out.println(apellido+" - Nómina: "+nomina);

        objPersona1.crear_carro();
    }
}
