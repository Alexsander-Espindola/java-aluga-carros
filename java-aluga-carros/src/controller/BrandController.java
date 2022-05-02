package controller;

import dao.ExceptionDAO;
import model.Brand;

public class BrandController {
  
  public boolean registerBrand(String nome) throws ExceptionDAO {
    if (nome != null && nome.length() > 0) {
      Brand brand = new Brand(nome);
      brand.addBrandInDB(brand);
      return true;
    }
    return false;

  }
}
