package infraestructure;

import java.sql.Connection;

public class DataBasePersistence {
    protected Connection connection;
    protected String dbUrl = "jdbc:postgresql://berry.db.elephantsql.com:5432/wsaazocg";
    protected String dbUser = "wsaazocg";
    protected String  dbPassword = "U6TWULcvZyVsl6zceCMYk8Z35lKpCo-Y";
    public Connection getConnection(){
        Connection connection1 = null;
        return connection1;
    }
    public void closeConnection(){}
}

