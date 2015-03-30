package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBWorker {

    private final String URL = "jdbc:mysql://localhost:3306/myDBTest";
    private final String USERNAME = "root";
    private final String PASSWRD = "Dra23Gon2011";

    private Connection connection;

    public DBWorker() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWRD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
