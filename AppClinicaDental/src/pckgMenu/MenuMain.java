/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgMenu;

import Conexion.BDConnection;
import java.sql.*;

/**
 *
 * @author allec
 */
public class MenuMain {

    /**
     * @param args the command line arguments
     */
    static Connection instance;
    static Menu frame;

    public static void main(String[] args) throws SQLException {
        instance = BDConnection.createInstance();
        frame = new Menu();
        menuVisible();
    }

    public static Connection getInstance() {
        return instance;
    }

    public static void menuVisible() {
        frame.setVisible(true);
    }
}
