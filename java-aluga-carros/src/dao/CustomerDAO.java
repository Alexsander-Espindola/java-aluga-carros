package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Customers;

public class CustomerDAO {
  
  public void addCustomerInDB(Customers customer) throws ExceptionDAO {
    String sql = "iinsert into CUSTOMERS (name, birthDate, email, driverLicense, adress, phoneNumber, createdAt)"
        + " value (?,?,?,?,?,?,?)";
    PreparedStatement pStatement = null;
    Connection conn = null;

    try {
      conn = new ConnectionSQL().getConnection();
      pStatement = conn.prepareStatement(sql);
      pStatement.setString(1, customer.getName());
      pStatement.setString(2, customer.getBirthDate());
      pStatement.setString(3, customer.getEmail());
      pStatement.setString(4, customer.getDriverLicense());
      pStatement.setString(5, customer.getAdress());
      pStatement.setString(6, customer.getPhoneNumber());
      pStatement.setString(7, customer.getCreatedAt());
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
