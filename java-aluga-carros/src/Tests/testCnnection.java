package Tests;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

import com.mysql.cj.jdbc.result.ResultSetMetaData;


import dao.ConnectionSQL;

public class testCnnection {

  @Test
  public void testOpenConnection() {
    Connection result = ConnectionSQL.getConnection();
    assertEquals(result != null, true);
  }
  
  @Test
  public void testeInsertData() {
    String insertData = "insert into CARS "
        + "(name, description, dailyRate, avaliable, licensePlate, color, createdAt)"
        + " value ('Fiat','Grande', 10, 10, '99-9999','Black', '2000/12/05')";
    
    try {
      new ConnectionSQL();
      Connection conn = ConnectionSQL.getConnection();
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(insertData);
      String name = rs.getString("name");
      String description = rs.getString("description");
      int dailyRate = rs.getInt("dailyRate");
      int avaliable = rs.getInt("avaliable");
      String licensePlate = rs.getString("licensePlate");
      String color = rs.getString("color");
      String createdAt = rs.getString("createdAt");
      assertEquals("Fiat", name);
      assertEquals("Grande", description);
      assertEquals(10, dailyRate);
      assertEquals(10, avaliable);
      assertEquals("99-9999", licensePlate);
      assertEquals("Black", color);
      assertEquals("2000/12/05", createdAt);
      
    } catch (Exception error) {
      error.printStackTrace();
    }
  }

}
