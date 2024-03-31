package src;
import java.sql.*;
import  javax.swing.*;
import javax.swing.JOptionPane;


public class DataBase {

    Connection conn =null;
    public static Connection javaDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:C:/Users/ihadj/OneDrive/Bureau/TPpoo/HotelManager/mydatabase.db";
            Connection conn= DriverManager.getConnection(url); 
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
