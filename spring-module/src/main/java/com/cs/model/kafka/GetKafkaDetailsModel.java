package com.cs.model.kafka;

public class GetKafkaDetailsModel implements IGetKafkaDetailsModel {
  
  private static final long serialVersionUID = 1L;
  private String            id;
  
  @Override
  public String getId()
  {
    return id;
  }
  
  @Override
  public void setId(String id)
  {
    this.id = id;
  }
  
}
