package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Cars;

public class CarDAO {

  public void addCarInDB(Cars car) throws ExceptionDAO {
    String sql = "insert into CARS (name, description, dailyRate, avaliable, licensePlate, color, createdAt)"
        + " value (?,?,?,?,?,?,?)";
    PreparedStatement pStatement = null;
    Connection conn = null;

    try {
      conn = new ConnectionSQL().getConnection();
      pStatement = conn.prepareStatement(sql);
      pStatement.setString(1, car.getName());
      pStatement.setString(2, car.getDescription());
      pStatement.setDouble(3, car.getDailyRate());
      pStatement.setDouble(4, car.getAvaliable());
      pStatement.setString(5, car.getLicensePlate());
      pStatement.setString(6, car.getColor());
      pStatement.setString(7, car.getCreatedAt());
      pStatement.execute();
    } catch (SQLException error) {
      // TODO: handle exception
      throw new ExceptionDAO("Erro ao cadastrar o carro: " + error.getMessage());
    } finally {

      try {
        if (pStatement != null) {
          pStatement.close();
        }
      } catch (SQLException error) {
        // TODO: handle exception
        throw new ExceptionDAO("Erro ao fechar o statement: " + error.getMessage());
      }

      try {
        if (conn != null) {
          conn.close();
        }
      } catch (SQLException error) {
        // TODO: handle exception
        throw new ExceptionDAO("Erro ao fechar a conexão: " + error.getMessage());
      }
    }
  }
}
