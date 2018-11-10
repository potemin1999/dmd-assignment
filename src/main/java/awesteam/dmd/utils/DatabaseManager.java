package awesteam.dmd.utils;

import lombok.extern.java.Log;
import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

@Log
public class DatabaseManager {

    private static DatabaseManager instance;

    public static DatabaseManager getInstance() {
        if (instance == null) {
            instance = new DatabaseManager();
        }
        return instance;
    }

    private Connection connection;

    private DatabaseManager() {
        try {
            DriverManager.registerDriver(Driver.class.newInstance());
            log.log(Level.FINE, "postgres driver found and registered");
        } catch (SQLException | InstantiationException | IllegalAccessException e) {
            log.log(Level.SEVERE, "unable to register driver", e);
        }
        final String dbAddress = getStr("MUpSSjFPUklHNVJITTk=");
        final String dbPort = getStr("NU1MMg==");
        final String dbName = getStr("ZA0fXxwTcw==");
        final String dbUsername = getStr("cBsOGQwNEXM=");
        final String dbPassword = getStr( "aBsOGXANEXQbExFz");

        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://" + dbAddress + ":" + dbPort + "/" + dbName,
                    dbUsername, dbPassword);
            log.log(Level.FINEST,"connection to database established");
        } catch (Throwable t) {
            log.log(Level.SEVERE, "unable to connect to database", t);
        }
    }

    public String getStr(String str){
        return SecurityManager.decodeString(str);
    }

}
