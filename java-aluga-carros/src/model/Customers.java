package model;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class Customers {
  private String name;
  private Date birthDate;
  private String email;
  private String driverLicense;
  private String adress;
  private int phoneNumber;
  private LocalDate createdAt;
  private LocalDate updatedAt;
  private ArrayList<Rentals> rentalHistory = new ArrayList<Rentals>();
 
  public Customers(String name, Date birthDate, String email, String driverLicense, String adress, int phoneNumber) {
    this.name = name;
    this.birthDate = birthDate;
    this.email = email;
    this.driverLicense = driverLicense;
    this.adress = adress;
    this.phoneNumber = phoneNumber;
    this.createdAt = LocalDate.now();
    this.updatedAt = LocalDate.now();
  }
  
  public void addCustomerInDB(Customers customer) {
    
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getDriverLicense() {
    return driverLicense;
  }

  public void setDriverLicense(String driverLicense) {
    this.driverLicense = driverLicense;
  }

  public String getAdress() {
    return adress;
  }

  public void setAdress(String adress) {
    this.adress = adress;
  }

  public int getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public LocalDate getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt() {
    this.updatedAt = LocalDate.now();
  }

  public ArrayList<Rentals> getRentalHistory() {
    return rentalHistory;
  }

  public void setRentalHistory(Rentals rentalHistory) {
    this.rentalHistory.add(rentalHistory);
  }

  public LocalDate getCreatedAt() {
    return createdAt;
  }
  
  
}
