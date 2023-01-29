package com.mjc.stage2.impl;

import com.mjc.stage2.ConnectionFactory;
import lombok.Value;
import org.h2.jdbc.JdbcConnection;

import java.sql.Connection;
import java.sql.ConnectionBuilder;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2ConnectionFactory implements ConnectionFactory {
    public static Connection connection;
    public static String driver;
    public static String connectionURL;
    public static String user;
    public static String password;
    @Override
    public Connection createConnection() {
        try {
            // Loading the driver
            Class.forName(driver);
            // Creating a connection
            connection = DriverManager.getConnection(connectionURL, user, password);
        } catch (ClassNotFoundException exception) {
            System.out.println("Driver not found");
        } catch (SQLException exception) {
            System.out.println("Connection exception" + exception);
        }

        return connection;

    }

    // Write your code here!
}

