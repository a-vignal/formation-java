package com.azqore.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

        private static Connection S_CONNECTION;

        public static Connection getConnection() {

        String url = "jdbc:mysql://localhost:3306/example?serverTimezone=UTC";
        String user = "root";
        String password = "";
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Driver MySQL introuvable");
        }
        if(S_CONNECTION == null) {
            try {
                System.out.println("Tentative connexion");
                S_CONNECTION = DriverManager.getConnection(url, user, password);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
            return S_CONNECTION;
        }
    public static boolean closeConnection (Connection connection){

        try {
             if (connection != null && connection.isClosed()) {
                 connection.close();
             }
         } catch (SQLException e) {
             System.err.println("Fermeture connexion impossible");
         }
        return true;
    }
}
