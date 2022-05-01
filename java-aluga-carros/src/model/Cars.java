package model;

import java.time.LocalDate;

public class Cars {
  private String name;
  private String description;
  private double dailyRate;
  private double avaliable;
  private String licensePlate;
  private Brand brand;
  private Categories category;
  private String color;
  private LocalDate createdAt;
  
  public Cars(String name, String description, double dailyRate, double avaliable, String licensePlate,
      String color) {
    this.name = name;
    this.description = description;
    this.dailyRate = dailyRate;
    this.avaliable = avaliable;
    this.licensePlate = licensePlate;
//    this.brand = brand;
//    this.category = category;
    this.color = color;
    this.createdAt = LocalDate.now();
  }
  
  public void addCarInDB(Cars car) {
    
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public double getDailyRate() {
    return dailyRate;
  }

  public void setDailyRate(double dailyRate) {
    this.dailyRate = dailyRate;
  }

  public double getAvaliable() {
    return avaliable;
  }

  public void setAvaliable(double avaliable) {
    this.avaliable = avaliable;
  }

  public String getLicensePlate() {
    return licensePlate;
  }

  public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

  public Brand getBrand() {
    return brand;
  }

  public void setBrand(Brand brand) {
    this.brand = brand;
  }

  public Categories getCategory() {
    return category;
  }

  public void setCategory(Categories category) {
    this.category = category;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public LocalDate getCreatedAt() {
    return createdAt;
  }
}
