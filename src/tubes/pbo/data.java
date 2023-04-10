/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes.pbo;
import java.sql.*;
/**
 *
 * @author Harits Rahman
 */
public class data {
    static final String url = "jdbc:mysql://localhost:3306/atmos";
    static final String user = "root";
    static final String pass = "";
    
    public static Connection connectDB(){
        Connection connect = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(url, user, pass);
            return connect;
        }
        catch(Exception ex){
            System.out.println("error while connect to database");
            return null;
        }
    }
}
