package designpattern.singleton;

public class DbHelper {


    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null)
            connection = new Connection("localhost", "root", "root");

        return connection;
    }
}
