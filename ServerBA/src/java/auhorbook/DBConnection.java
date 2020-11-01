/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auhorbook;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.ejb.Stateless;
import javax.swing.JOptionPane;

/**
 *
 * @author assim
 */
@Stateless
public class DBConnection {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
        public static Connection serverConnect()
    {
        Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/webtest?","root","");
       
         
        } catch (Exception e) {
            System.out.println("inter.DBConnect.connect()");
            JOptionPane.showConfirmDialog(null,e);
        }
       return con;
    }
        
}