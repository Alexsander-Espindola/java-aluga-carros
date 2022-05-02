package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import dao.ExceptionDAO;
import model.Customers;

public class CustomerController {

  public boolean registerCustomer(String name, String birthDate, String email, String driverLicense, String adress,
      String phoneNumber) throws ExceptionDAO {
    boolean bolName = name != null && name.length() > 0;
    boolean bolEmail = verifyEmail(email);
    boolean bolAdress = adress != null && adress.length() > 0;
    boolean bolPhoneNumber = verifyPhoneNumber(phoneNumber);
    boolean bolDriverLicense = driverLicense != null && driverLicense.length() > 0;
    boolean bolBirtDate = verifyBirthDate(birthDate);

    if (bolName && bolBirtDate && bolEmail && bolDriverLicense && bolAdress && bolPhoneNumber) {
      System.out.println("Estra aki");
      DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      LocalDate dateBirth = LocalDate.parse(birthDate, formato);
      System.out.println("Entra aki");
      Customers customer = new Customers(name, dateBirth, email, driverLicense, adress, phoneNumber);
      customer.addCustomerInDB(customer);

      return true;
    }

    return false;
  }

  public boolean verifyEmail(String email) {
    String regexEmail = "^(.+)@(.+)$";

    if (email.matches(regexEmail)) {      
      return true;
    }

    return false;
  }

  public boolean verifyPhoneNumber(String phoneNumber) {
    String regexPhoneNumber = "^((\\(\\d{2}\\))|\\d{5})[- .]?\\d{5}[- .]?\\d{4}$";

    if (phoneNumber.matches(regexPhoneNumber)) {      
      return true;
    }

    return false;
  }

  public boolean verifyBirthDate(String birthDate) {
    String regerBirthDate = "\\d{2}/\\d{2}/\\d{4}";
    if (birthDate.matches(regerBirthDate)) {
      return true;      
    }

    return false;
  }
}
