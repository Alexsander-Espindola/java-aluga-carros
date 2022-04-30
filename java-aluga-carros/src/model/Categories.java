package model;

import java.sql.Date;
import java.util.ArrayList;

public class Categories {
  private String name;
  private Date createdAt;
  private String description;
  private ArrayList<Cars> cars = new ArrayList<Cars>();
}
