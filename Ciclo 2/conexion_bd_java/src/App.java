import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
            }

        } catch (SQLException error) {
            System.out.println(error.getMessage());
        }

    }
}
