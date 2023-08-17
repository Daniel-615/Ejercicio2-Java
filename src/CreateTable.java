package src;
import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {
    public static void Table() {
        Connection c = BDConnection.getConnection();
        Statement stmt = null;

        try {
            stmt = c.createStatement();
            String sql = "CREATE TABLE COMPANY " +
                    "(ID INT PRIMARY KEY NOT NULL," +
                    " NAME TEXT NOT NULL, " +
                    " AGE INT NOT NULL, " +
                    " ADDRESS CHAR(50), " +
                    " SALARY REAL)";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
            System.out.println("Table created successfully");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}
