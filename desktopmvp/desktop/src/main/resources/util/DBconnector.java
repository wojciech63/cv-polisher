package com.desktopmvp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnector {

    private static final String DB_URL = DbVarStore.getDB_URL();
    private static final String DB_USER = DbVarStore.getDB_USER();
    private static final String DB_PASSWORD = DbVarStore.getDB_PASSWORD();

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        System.out.println("Connecting to the database...");

        try {
            connection = DriverManager.getConnection(DB_URL + "?useSSL=false", DB_USER, DB_PASSWORD);

            if (connection != null) {
                System.out.println("Database connection successful");

                statement = connection.createStatement();

                String sqlQuery = "SELECT VERSION()";
                resultSet = statement.executeQuery(sqlQuery);

                if (resultSet.next()) {
                    System.out.println("MySQL Version: " + resultSet.getString(1));
                }
            } else {
                System.out.println("Failed to make connection");
            }
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Closing resources...");
            try {
                if (resultSet != null) resultSet.close();
                System.out.println("ResultSet closed");
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (statement != null) statement.close();
                System.out.println("Statement closed");
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (connection != null) connection.close();
                System.out.println("Connection closed");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Finished.");
    }
}