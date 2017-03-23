package quanlisv;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author virus
 */
public class MySQLConnect {
    static String DB_URL="jdbc:mysql://localhost/java"; 
    //user name va pass cua database
    static String USER="root";
    static String PASS="1234";
    Connection con=null;
    public static Connection connectDB() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(DB_URL, USER, PASS);
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
