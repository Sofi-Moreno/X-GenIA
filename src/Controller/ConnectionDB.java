/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConnectionDB {
    //datos de la conexion a la base de datos
    private static Connection connection;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://uuq8ibvppiscjmq9:1JmUFsE2SGaXVSOxOCSF@bawo7zlm1ztu7a3lplyi-mysql.services.clever-cloud.com:3306/bawo7zlm1ztu7a3lplyi";
    private static final String user= "uuq8ibvppiscjmq9";
    private static final String pass= "1JmUFsE2SGaXVSOxOCSF";
    
    
    public ConnectionDB(){
        connection = null;
        try{
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, pass);
            if(connection!=null){
                System.out.println("Conexion exitosa...");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("No se pudo conectar "+e);
        }
    }
    
    public Connection getConnection(){
        return connection;
    }
    
    public void desconectar(){
        connection = null;
        if(connection==null){
            System.out.println("Conexion cerrada...");
        }
    }
    
}
