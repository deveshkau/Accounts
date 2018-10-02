/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adi
 */
public class Dbconnection {
       public Connection Connect() throws ClassNotFoundException, SQLException
    {
        try{
        String url ="jdbc:mysql://localhost:3306/mainTable";
        String user = "root";
        String password = "";
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn =DriverManager.getConnection(url, user, password);
        
        return conn;
    } catch (ClassNotFoundException | SQLException ex)
    {
        Logger.getLogger(Dbconnection.class.getName()).log(Level.SEVERE,null,ex);
    }
        return null;
        
    } 
}
