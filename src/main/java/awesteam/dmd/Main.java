package awesteam.dmd;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, SQLException {
        DriverManager.registerDriver(org.postgresql.Driver.class.newInstance());
        System.out.println("Ok, system can run");
    }

}
