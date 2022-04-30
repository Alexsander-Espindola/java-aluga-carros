package aluga;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String regexPhoneNumber = "^((\\(\\d{2}\\))|\\d{5})[- .]?\\d{5}[- .]?\\d{4}$";
    Pattern pattern = Pattern.compile(regexPhoneNumber);
    Matcher matcher = pattern.matcher("(62) 99360-5888");
    System.out.println(matcher.matches());
  }

}
