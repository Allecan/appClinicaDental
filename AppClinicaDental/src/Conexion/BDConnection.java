/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Erick
 */
public class BDConnection {

    private String url = "";
    private String user = "";
    private String bdName = "";
    private String password = "";
    private static int instanceLimiter = 4;
    private static Connection instance = null;

    private BDConnection() throws SQLException {

        url = "jdbc:mysql://localhost:3306";
        bdName = "bdclinicadental";
        user = "root";
        password = "suis moi camille";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            instance = DriverManager.getConnection(url + "/" + bdName, user, password);   //url, user, password
        } catch (ClassNotFoundException | SQLException e) {
            e.getCause();
        }
    }

    public static Connection createInstance() throws SQLException {

        if (instanceLimiter != 0) {
            new BDConnection();
            instanceLimiter--;
            return instance;
        } else {
            System.out.println("ERROR 00 -- Limite de conexiones superado");
        }
        return instance;
    }

}
