public class App {
    public static void main(String[] args) throws Exception {
        // Construir un objeto de tipo Persona
        Persona objPersona1 = new Persona("Jeison","Arrubla",27,"1039",'M');
        //Obtener el nombre y apellido
        String nombre = objPersona1.getNombre();
        String apellido = objPersona1.getApellido();
        // Imprimir en consola
        System.out.println("Nombre: "+nombre+"\nApellido: "+apellido);

        // Cambiar nombre y apellido
        objPersona1.setNombre("JEISON");
        objPersona1.setApellido("ARRUBLA");
        nombre = objPersona1.getNombre();
        apellido = objPersona1.getApellido();
        // Imprimir en consola
        System.out.println("Nombre: "+nombre+"\nApellido: "+apellido);

        // Obtener valor nómina
        double nomina = objPersona1.calcular_nomina(10);
        System.out.println("Nómina: "+nomina);

        // Crear más personas
        Persona objPersona2 = new Persona("Juliana","Sandoval",20,"1152",'F');
        objPersona2.setTelefono("3123546789");
        objPersona2.setEmail("juliana@gmail.com");

        Persona objPersona3 = new Persona("Laila","Narváez",26,"1139",'F');
        objPersona3.setTelefono("3205667890");
        objPersona3.setEmail("laila@gmail.com");
    }
}
