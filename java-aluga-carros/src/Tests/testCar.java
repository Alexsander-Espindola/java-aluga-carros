package Tests;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

import model.Cars;

public class testCar {

  @Test
  public void test() {
    Cars car = new Cars("Fiesta", "Grande", 10, 10, "99-9999", "Preto");
    LocalDate date = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    String dateString = date.format(formatter);
    
    assertEquals(dateString, car.getCreatedAt());
    assertEquals("Fiesta", car.getName());
    assertEquals("Grande", car.getDescription());
    assertEquals("99-9999", car.getLicensePlate());
    assertEquals("Preto", car.getColor());
    
    car.setColor("Verde");
    assertEquals("Verde", car.getColor());
  }

}
