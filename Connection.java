/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg_module;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Kamlesh Lovewanshi
 */
public class Connection {
    public static void main(String[] args) {
       Admin_Registration rgf = new Admin_Registration();
        rgf.setVisible(true);
        getConnection();
        
    }

    static Connection getConnection()  {
         Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tg_module","root","root");
            System.out.println("Connected database successfully...");
            //return con;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return con;
        
    }
    
    
    
    
}
