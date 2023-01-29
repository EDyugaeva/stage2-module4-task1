package com.mjc.stage2.impl;

import com.mjc.stage2.ConnectionFactory;
import org.h2.jdbc.JdbcConnection;

import java.sql.Connection;
import java.sql.ConnectionBuilder;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2ConnectionFactory implements ConnectionFactory {
    @Override
    public Connection createConnection(String url) {
        try {
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    // Write your code here!
}

