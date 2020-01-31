package com.cs.model.base;

import org.springframework.stereotype.Component;

@Component
public class EmployeeModel extends Model implements IEmployeeModel {
  
  private static final long serialVersionUID = 1L;
  private String            employeeId;
  
  public String getEmployeeId()
  {
    return employeeId;
  }
  
  public void setEmployeeId(String employeeId)
  {
    this.employeeId = employeeId;
  }
  
}
