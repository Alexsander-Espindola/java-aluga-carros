package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Brand;

public class BrandDAO {

  public void addBrandInDB(Brand brand) throws ExceptionDAO {
    String sql = "insert into BRAND (name, createdAt) value (?, ?)";
    PreparedStatement pStatement = null;
    Connection conn = null;

    try {
      conn = new ConnectionSQL().getConnection();
      pStatement = conn.prepareStatement(sql);
      pStatement.setString(1, brand.getName());
      pStatement.setString(2, brand.getCreatedAt());
      pStatement.execute();
    } catch (SQLException error) {
      // TODO: handle exception
      throw new ExceptionDAO("Erro ao cadastrar a marca: " + error.getMessage());
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
