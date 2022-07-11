public class App {
    public static void main(String[] args) throws Exception {
        // Construir un objeto de tipo Persona
        Persona objPersona1 = new Persona("Jeison","Arrubla");
        //Obtener el nombre y apellido
        String nombre = objPersona1.getNombre();
        String apellido = objPersona1.getApellido();
        // Imprimir en consola
        System.out.println("Nombre: "+nombre+"\nApellido: "+apellido);
    }
}
