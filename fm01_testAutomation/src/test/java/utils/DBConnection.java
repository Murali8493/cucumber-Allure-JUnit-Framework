package utils;

import javax.sound.midi.Soundbank;
import java.sql.*;

public class DBConnection {

    public static Connection connection;
    Statement statement;
    ResultSet resultSet;

    public DBConnection createConnection(String driver, String connectionUrl, String userName, String pwd) throws ClassNotFoundException, SQLException {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(connectionUrl, userName, pwd);
            System.out.println("Connection is successful and the database name is: " + connection.getMetaData().getDatabaseProductName());
        } catch (Exception e) {
            System.out.println("Unable to make connection with DB");
            e.printStackTrace();
        }
        return new DBConnection();
    }

    public ResultSet executeQuery(String query) throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery(query);
        return resultSet;
    }

    public void closeDBConnection() throws SQLException {
        connection.close();
    }
}
