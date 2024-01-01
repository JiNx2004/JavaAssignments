import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class App {

    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String jdbcUrl = "jdbc:mysql://localhost:3306/";
        String username = "root";
        String password = "1234";

        try {
            // Establish a connection to the database
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            if (connection != null) {
                System.out.println("Connected to the database!");
                // You can perform database operations here
                // Remember to close the connection when done
                connection.close();
            } else {
                System.out.println("Failed to connect to the database.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
