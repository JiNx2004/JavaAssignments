import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Q2 {

    private static final String jdbcUrl = "jdbc:mysql://localhost:3306/abcd";
    private static final String username = "root";
    private static final String password = "1234";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            if (connection != null) {
                System.out.println("Connected to the database!");

                // Example: Query all available Persons
                String query = "SELECT * FROM Persons ";
                try (PreparedStatement preparedStatement = connection.prepareStatement(query);
                     ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        int PersonId = resultSet.getInt("PersonID");
                        String LastName = resultSet.getString("LastName");
                        String FirstName = resultSet.getString("FirstName");
                        String Address = resultSet.getString("Address");
  
                        System.out.println("Person ID: " + PersonId);
                        System.out.println("Last Name: " + LastName);
                        System.out.println("First Name: " + FirstName);
                        System.out.println("Address: " + Address);
                        System.out.println();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Failed to connect to the database.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


