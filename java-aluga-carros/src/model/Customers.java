package model;

import java.sql.Date;
import java.util.ArrayList;

public class Customers {
  private String name;
  private Date birthDate;
  private String email;
  private String driverLicense;
  private String adress;
  private int phoneNumber;
  private Date createdAt;
  private Date updatedAt;
  private ArrayList<Rentals> rentalHistory = new ArrayList<Rentals>();
}
