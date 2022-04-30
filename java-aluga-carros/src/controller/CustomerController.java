package controller;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class CustomerController {
  
  public boolean registerCustomer(String name, LocalDate birthDate, String email, String driverLicense, String adress, String phoneNumber) {
    boolean bolName = name != null && name.length() > 0;
    boolean bolBirtDate = birthDate != null;
    boolean bolEmail = verifyEmail(email);
    boolean bolDriverLicense = driverLicense != null && driverLicense.length() > 0;
    boolean bolAdress = adress != null && adress.length() > 0;
    boolean bolPhoneNumber = verifyPhoneNumber(phoneNumber);
    
    if (bolName && bolBirtDate && bolEmail && bolDriverLicense && bolAdress && bolPhoneNumber) return true;
    
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
}
