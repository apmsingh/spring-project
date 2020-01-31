package com.cs.model.base;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SalaryModel extends Model implements ISalaryModel {
  
  private static final long serialVersionUID = 1L;
  private Double            amount;
  
  public Double getAmount()
  {
    return amount;
  }
  
  public void setAmount(Double amount)
  {
    this.amount = amount;
  }
  
}
