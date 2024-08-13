package creational.factoryMethod;

abstract class DatabaseConnection {  //bu kısmı interface olarakta verebilirdik.
    public abstract void connect();
}

class MySQLConnection extends DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }
}

class SQLiteConnection extends DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connecting to SQLite database...");
    }
}

abstract class DatabaseConnectionFactory {
    public abstract DatabaseConnection createConnection();

    public void connectToDatabase() {
        DatabaseConnection connection = createConnection();
        connection.connect();
    }
}

class MySQLConnectionFactory extends DatabaseConnectionFactory {
    @Override
    public DatabaseConnection createConnection() {
        return new MySQLConnection();  //oluşturma işlemi gerçek factoryde yapılır.
    }
}

class SQLiteConnectionFactory extends DatabaseConnectionFactory {
    @Override
    public DatabaseConnection createConnection() {
        return new SQLiteConnection();
    }
}

public class Main {
    public static void main(String[] args) {
        DatabaseConnectionFactory factory;

        // Dinamik olarak fabrika seçimi
        String dbType = System.getenv("DB_TYPE");
        if ("MySQL".equals(dbType)) {
            factory = new MySQLConnectionFactory();
        } else {
            factory = new SQLiteConnectionFactory();
        }

        factory.connectToDatabase();
    }
}
