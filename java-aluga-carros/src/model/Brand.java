package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import dao.BrandDAO;
import dao.ExceptionDAO;

public class Brand {
  private String name;
  private LocalDate createdAt;
  private ArrayList<Cars> cars = new ArrayList<Cars>();
 
  public Brand(String name) {
    this.name = name;
    this.createdAt = LocalDate.now();
  }
  
  public void addBrandInDB(Brand brand) throws ExceptionDAO {
    new BrandDAO().addBrandInDB(brand);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<Cars> getCars() {
    return cars;
  }

  public void addCar(Cars car) {
    this.cars.add(car);
  }

  public String getCreatedAt() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    return createdAt.format(formatter);
  }
  
  
}
