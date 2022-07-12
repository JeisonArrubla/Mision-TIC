public class Persona {

    /*
     * Las clases tienen 5 secciones:
     * -Atributos
     * -Métodos constructores
     * -Métodos consultores
     * -Métodos modificadores
     * -Acciones
     * 
     * No es obligatorio tenerlas todas
     */

    // ATRIBUTOS
    private String nombre;
    private String apellido;
    private int edad;
    private String cedula;
    private String telefono;
    private String email;
    private char genero;

    // MÉTODO CONSTRUCTOR
    public Persona(String nombre, String apellido, int edad, String cedula, char genero) {
        // Pedimos por parámetro los datos obligatorios
        // this.nombre -> Atributo
        // nombre (solo) -> Parámetro
        this.nombre = nombre;
        this.apellido = apellido;
        // Con this accedemos a los atributos y métodos de la clase
        // System.out.println("Hola, soy una persona, soy "+this.nombre+"
        // "+this.apellido);
        this.edad = edad;
        this.cedula = cedula;
        this.genero = genero;
    }

    // MÉTODOS CONSULTORES
    // Nombrar con get por estandar
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getCedula() {
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public char getGenero() {
        return genero;
    }

    // MÉTODOS MODIFICADORES
    // Nombrar con set por estandar
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    // ACCIONES
    public double calcular_nomina(double cant_hora) {
        int valor_hora = 0;
        double nomina = 0;
        // && -> and
        if (edad >= 18 && edad < 20) {
            valor_hora = 10;
        } else if(edad >= 20 && edad < 30){
            valor_hora = 15;
        }else if(edad >= 30 && edad < 50){
            valor_hora = 20;
        }else if(edad >= 50){
            valor_hora = 25;
        }

        nomina = valor_hora * cant_hora;

        return nomina;
    }
}
