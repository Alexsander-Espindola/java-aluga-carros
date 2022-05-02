package model;

import java.util.Date;

import dao.CustomerDAO;
import dao.ExceptionDAO;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Customers {
  private String name;
  private LocalDate birthDate;
  private String email;
  private String driverLicense;
  private String adress;
  private String phoneNumber;
  private LocalDate createdAt;
  private LocalDate updatedAt;
  private ArrayList<Rentals> rentalHistory = new ArrayList<Rentals>();
 
  public Customers(String name, LocalDate birthDate, String email, String driverLicense, String adress, String phoneNumber) {
    this.name = name;
    this.birthDate = birthDate;
    this.email = email;
    this.driverLicense = driverLicense;
    this.adress = adress;
    this.phoneNumber = phoneNumber;
    this.createdAt = LocalDate.now();
    this.updatedAt = LocalDate.now();
  }
  
  public void addCustomerInDB(Customers customer) throws ExceptionDAO {
    new CustomerDAO().addCustomerInDB(customer);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBirthDate() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    return birthDate.format(formatter);
  }

  public void setBirthDate(LocalDate birthDate) {
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

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
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

  public String getCreatedAt() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    return createdAt.format(formatter);
  }
  
  
}
