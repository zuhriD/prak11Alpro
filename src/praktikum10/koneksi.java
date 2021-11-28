/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum10;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class koneksi {
    public static Connection con;
    
    public static Connection koneksiDB() throws SQLException{
        if (con == null) {
            try {
            String url = "jdbc:mysql://localhost/data_mahasiswa";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = (Connection) DriverManager.getConnection(url,user,pass); 
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"gagal koneksi");
        }
        }
        return con;
    }  
}
