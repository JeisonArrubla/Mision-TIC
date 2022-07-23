import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {

        try {

            // Objeto de conexión
            // Con este objeto podremos ejecutar instrucciones de tipo SQL
            // Me va retornar un objeto de tipo result set
            // Result set es una tabla que nos va mostrar el resultado, lo vamos a iterar
            Connection conn = DriverManager.getConnection("jdbc:sqlite:hr.db");
            if (conn != null) {
                System.out.println("Conexión exitosa a la base de datos");
                // Crear objeto Statement
                Statement statement = conn.createStatement();
                // Ejecutar consulta sql
                ResultSet result = statement.executeQuery("SELECT * FROM employees");
                // Iterar mientras tenga registros
                while (result.next()){
                    // Obtener los datos del ResultSet
                    int id = result.getInt("employee_id");
                    String nombre = result.getString("first_name");
                    String apellido = result.getString("last_name");
                    // Mostrar información en consola
                    String info = "Id: "+id;
                    info += "\nNombre: "+nombre;
                    info += "\nApellido: "+apellido;
                    info += "\n------------------------------------";
                    System.out.println(info);
                
                }
            }

        } catch (SQLException error) {
            System.out.println(error.getMessage());
        }

    }
}

