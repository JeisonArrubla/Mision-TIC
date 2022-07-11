public class Persona {

    /*
    Las clases tienen 5 secciones:
    -Atributos
    -Métodos constructores
    -Métodos consultores
    -Métodos modificadores
    -Acciones
    */

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
    // Nombrar con get por estandar
    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    // MÉTODOS MODIFICADORES
    // Nombrar con set por estandar
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    // ACCIONES
}
