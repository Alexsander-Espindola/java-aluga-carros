package aluga;

public class main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String regexDate = "62993665888";
    System.out.println(regexDate.matches("^\\d{11}$"));
    
    String regexEmail = "^(.+)@(.+)$";
    String email = "Alexs@gmail.com";
    System.out.println(email.matches(regexEmail));
    
    String birthDate = "02/05/2000";
    String regerBirthDate = "\\d{2}/\\d{2}/\\d{4}";
    System.out.println(birthDate.matches(regerBirthDate));
  }

}
