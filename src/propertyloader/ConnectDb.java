package propertyloader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectDb {
    public static Connection connectToDb() throws SQLException {
        LoadPropertyFile.loadingProperties();
        return DriverManager.getConnection(
                LoadPropertyFile.properties.getProperty("database_url"),
                LoadPropertyFile.properties.getProperty("database_username"),
                LoadPropertyFile.properties.getProperty("database_password")
        );
    }
}