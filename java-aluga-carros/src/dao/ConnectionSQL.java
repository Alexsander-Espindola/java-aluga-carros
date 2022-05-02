package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSQL {

  public static Connection getConnection() {
    Connection connection = null;
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException error) {
      // TODO: handle exception
      error.printStackTrace();
    }
    
    try {
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/alucar?"
          + "useSSL=false", "alexsander", "Alexs35961592!");
    } catch (SQLException error) {
      // TODO: handle exception
      error.printStackTrace();
    }
    
    return connection;
  }
}
