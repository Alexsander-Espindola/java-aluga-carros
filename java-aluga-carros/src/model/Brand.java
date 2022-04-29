package model;

import java.sql.Date;
import java.util.ArrayList;

public class Brand {
  private String name;
  private Date createdAt;
  private ArrayList<Cars> cars = new ArrayList<Cars>();
}
