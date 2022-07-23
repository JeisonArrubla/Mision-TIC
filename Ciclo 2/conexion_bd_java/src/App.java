import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {

        Connection conn = conectar_bd();

        mostrarEmpleados(conn);

        // crearPuestoTrabajo(conn, "Marketing", 2000, 8000);
        /*
        * Reutilizamos código
        * Ya no tenemos que poner INSERT INTO... VALUES
        * Solo pasamos los valores por parámetro
        */

        // eliminarPuestoTrabajoXId(conn, 18);

        // actualizarPuestoTrabajoXId(conn, 17, "Encargado de Envíos", 5000, 12000);
        // actualizarPuestoTrabajoXId(conn, 19, "Administrador de inventarios", 5000, 12000);

        System.out.println("\n-------------JOBS-----------\n");
        mostrarPuestosTrabajo(conn);

        

    }

    public static Connection conectar_bd() {
        Connection conn;
        try {
            // Objeto de conexión
            // Con este objeto podremos ejecutar instrucciones de tipo SQL
            // Me va retornar un objeto de tipo result set
            // Result set es una tabla que nos va mostrar el resultado, lo vamos a iterar
            conn = DriverManager.getConnection("jdbc:sqlite:hr.db");

        } catch (SQLException error) {
            conn = null;
            error.printStackTrace();
            System.out.println(error.getMessage());
        }
        return conn;
    }

    public static void mostrarEmpleados(Connection conn) {
        try {
            System.out.println("Conexión exitosa a la base de datos");

            // Crear objeto Statement
            Statement statement = conn.createStatement();
            // Solo se usa para consultas fijas, si la consulta lleva WHERE no se utiliza
            // por seguridad Statement porque podría haber vulnerabilidad
            // Para esos casos usaremos un PreparedStatement, completa la consulta de forma
            // segura

            // Ejecutar consulta sql
            ResultSet result = statement.executeQuery("SELECT * FROM employees");

            System.out.println("\n-------------EMPLEADOS-----------\n");
            // Iterar mientras tenga registros
            while (result.next()) {
                // result.next() -> Mientras existan resultados hacer...
                // Obtener los datos del objeto tipo ResultSet (result)
                int id = result.getInt("employee_id");
                String nombre = result.getString("first_name");
                String apellido = result.getString("last_name");
                // Mostrar información en consola
                String info = "Id: " + id;
                info += "\nNombre: " + nombre;
                info += "\nApellido: " + apellido;
                info += "\n------------------------------------";
                System.out.println(info);
            }
        } catch (SQLException error) {
            System.out.println(error.getMessage());
        }
    }

    public static void crearPuestoTrabajo(Connection conn, String job_title, int min_salary, int max_salary) {
        try {
            // Estructura del QUERY
            String query = "INSERT INTO jobs(job_title, min_salary, max_salary) VALUES(?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            // Setear los signos de interrogación / indicar los valores que tendrá el query
            ps.setString(1, job_title);
            ps.setInt(2, min_salary);
            ps.setInt(3, max_salary);
            // Ejecutar consulta
            ps.executeUpdate();
        } catch (SQLException error) {
            System.out.println(error.getMessage());
        }
    }

    public static void mostrarPuestosTrabajo(Connection conn) {
        try {
            Statement st = conn.createStatement();
            ResultSet result = st.executeQuery("SELECT * FROM jobs");

            while (result.next()) { // Mientras existan resultados hacer...
                int id = result.getInt("job_id");
                String titulo = result.getString("job_title");
                int salario_minimo = result.getInt("min_salary");
                int salario_maximo = result.getInt("max_salary");

                System.out.println("ID: "+id+"\tTÍTULO: " + titulo+"\tSALARIO MÍNIMO: "+salario_minimo+"\tSALARIO MÁXIMO: "+salario_maximo);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Método para eliminar un puesto de trabajo por id
    public static void eliminarPuestoTrabajoXId(Connection conn, int id) {
        // Desarrollar este método, desde sus parámetros hasta su lógica
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM jobs WHERE job_id=?");
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException error) {
            System.out.println(error.getMessage());
        }
    }

    // Desarrollar método para actualizar por id los valores de la tabla jobs
    public static void actualizarPuestoTrabajoXId(Connection conn, int id, String titulo, int salario_minimo, int salario_maximo) {
        
        try {
            PreparedStatement ps = conn.prepareStatement("UPDATE jobs SET job_title=?, min_salary=?, max_salary=? WHERE job_id=?");
            ps.setString(1, titulo);
            ps.setInt(2, salario_minimo);
            ps.setInt(3, salario_maximo);
            ps.setInt(4, id);
            // Ejecutar
            ps.executeUpdate();
        } catch (SQLException error) {
            System.out.println(error.getMessage());
        }
    }
}