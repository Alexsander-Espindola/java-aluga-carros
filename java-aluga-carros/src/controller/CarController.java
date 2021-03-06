package controller;

import dao.ExceptionDAO;
import model.Cars;

public class CarController {
  public boolean registerCar(String name, String description, double dailyRate, double avaliable, String licensePlate,
      String color) throws ExceptionDAO {
    boolean bolName = name != null && name.length() > 0;
    boolean bolDescription = description != null && description.length() > 0;
    boolean bolLicensePlate = licensePlate != null && licensePlate.length() > 0;
    boolean bolColor = color != null && color.length() > 0;

    if (bolName && bolDescription && bolLicensePlate && bolColor) {
      Cars car = new Cars(name, description, dailyRate, avaliable, licensePlate, color);
      car.addCarInDB(car);
      return true;
    }    
    return false;

  }
}
