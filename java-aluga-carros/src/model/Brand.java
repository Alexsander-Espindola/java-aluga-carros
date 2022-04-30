package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Brand {
  private String name;
  private LocalDate createdAt;
  private ArrayList<Cars> cars = new ArrayList<Cars>();
 
  public Brand(String name) {
    this.name = name;
    this.createdAt = LocalDate.now();
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

  public LocalDate getCreatedAt() {
    return createdAt;
  }
  
  
}
