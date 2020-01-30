package com.cs.model.base;

import java.io.Serializable;

public interface IModel extends Serializable {
  
  public static final String ID = "id";
  
  public String getId();
  public void setId(String id);
  
}
