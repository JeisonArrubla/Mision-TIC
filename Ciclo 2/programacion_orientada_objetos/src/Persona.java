public class Persona {

    // ATRIBUTOS
    private String nombre;
    private String apellido;
    
    // MÉTODO CONSTRUCTOR
    public Persona(String nombre, String apellido){
        // this.nombre -> Atributo
        // nombre (solo) -> Parámetro
        this.nombre = nombre; 
        this.apellido = apellido;
        // Con this accedemos a los atributos y métodos de la clase
        // System.out.println("Hola, soy una persona, soy "+this.nombre+" "+this.apellido);
    }

    // MÉTODOS CONSULTORES
    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }
}
