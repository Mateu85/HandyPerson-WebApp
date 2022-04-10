package com.HandyPerson.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.HandyPerson.util.Constants.*;



public class Database {
    private Connection connection;

    public Connection getConnection() {

            try {
                Class.forName(MYSQL_DRIVER);
                connection = DriverManager.getConnection(MYSQL_URL, USERNAME, PASSWORD);
                System.out.println("✅ Connected!");
            } catch (ClassNotFoundException cnfe) {
                System.out.println("❌ The connection driver could not be loaded. Verify that the drivers are available");
                cnfe.printStackTrace();
            } catch (SQLException sqle) {
                System.out.println("❌ Could not connect to the database server. Check that the data is correct and that the server has been started");
                sqle.printStackTrace();
            }

            return connection;
        }

        public void close() {
            try {
                connection.close();
            } catch (SQLException sqle) {
                System.out.println("No se ha podido conectar con el servidor de base de datos. Comprueba que los datos son correctos y que el servidor se ha iniciado");
                sqle.printStackTrace();
            }
        }
    }

