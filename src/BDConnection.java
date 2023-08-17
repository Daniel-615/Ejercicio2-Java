package src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class BDConnection {
    public static Connection getConnection() {
        Connection connection = null;
        try {
            ResourceBundle resourceBundle = ResourceBundle.getBundle("config"); 
            String dbUrl = resourceBundle.getString("db.url");
            String dbUser = resourceBundle.getString("db.user");
            String dbPassword = resourceBundle.getString("db.password");

            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            System.out.println("Opened database successfully");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return connection;
    }
}
