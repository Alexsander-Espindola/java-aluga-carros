package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import model.Customers;



public class CustomerController {
  
  public boolean registerCustomer(String name, String birthDate, String email, String driverLicense, String adress, String phoneNumber) {
    boolean bolName = name != null && name.length() > 0;
    boolean bolBirtDate = verifyBirthDate(birthDate);
    boolean bolEmail = verifyEmail(email);
    boolean bolDriverLicense = driverLicense != null && driverLicense.length() > 0;
    boolean bolAdress = adress != null && adress.length() > 0;
    boolean bolPhoneNumber = verifyPhoneNumber(phoneNumber);
    
    if (bolName && bolBirtDate && bolEmail && bolDriverLicense && bolAdress && bolPhoneNumber) {
      DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
      LocalDate dateBirth = LocalDate.parse(birthDate, formato);
      Customers customer = new Customers(name, dateBirth, email, driverLicense, adress, phoneNumber);
      customer.addCustomerInDB(customer);

      return true;
    }
    
    return false;  
  }
  
  public boolean verifyEmail(String email) {
    String regexEmail = "^(.+)@(.+)$";
    Pattern pattern = Pattern.compile(regexEmail);
    Matcher matcherEmail = pattern.matcher(email);

    if (matcherEmail.matches()) return true;
    
    return false;
  }
  
  public boolean verifyPhoneNumber(String phoneNumber) {
    String regexPhoneNumber = "^((\\(\\d{2}\\))|\\d{5})[- .]?\\d{5}[- .]?\\d{4}$";
    Pattern pattern = Pattern.compile(regexPhoneNumber);
    Matcher matcherPhoneNumber = pattern.matcher(phoneNumber);
    if (matcherPhoneNumber.matches()) return true;
    
    return false;
  }
  
  public boolean verifyBirthDate(String birthDate) {
    if (birthDate.matches("\\\\d{2}/\\\\d{2}/\\\\d{4}")) return true;
    
    return false;
  }
}
