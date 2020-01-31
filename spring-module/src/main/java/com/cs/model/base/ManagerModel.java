package com.cs.model.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ManagerModel extends Model implements IManagerModel {
  
  private static final long serialVersionUID = 1L;
  
  /**
   * If we are not going to add @Autowired than by default it won't create an
   * instance of employeeModel
   */
  @Autowired
  private EmployeeModel     employeeModel;
  private String            manageRank;
  
  public EmployeeModel getEmployeeModel()
  {
    return employeeModel;
  }
  
  public void setEmployeeModel(EmployeeModel employeeModel)
  {
    this.employeeModel = employeeModel;
  }
  
  public String getManageRank()
  {
    return manageRank;
  }
  
  public void setManageRank(String manageRank)
  {
    this.manageRank = manageRank;
  }
  
}
