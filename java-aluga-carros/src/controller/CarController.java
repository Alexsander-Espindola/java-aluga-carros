package controller;

import java.sql.Date;

import model.Brand;
import model.Cars;
import model.Categories;

public class CarController {
  public boolean registerCar(String name, String description, short dailyRate, short avaliable, String licensePlate,
      Brand brand, Categories category, String color, Date createdAt) {
    boolean bolName = name != null && name.length() < 0;
    boolean bolDescription = description != null && description.length() < 0;
    boolean bolLicensePlate = licensePlate != null && licensePlate.length() < 0;
    boolean bolColor = color != null && color.length() < 0;

    if (bolName || bolDescription || bolLicensePlate || bolColor) {
      Cars car = new Cars(name, description, dailyRate, avaliable, licensePlate,
          brand, category, color, createdAt);
      car.registerCar(car);
      return true;
    }

    return false;
  }
}
