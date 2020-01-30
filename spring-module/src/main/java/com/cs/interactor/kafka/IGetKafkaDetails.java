package com.cs.interactor.kafka;

import com.cs.model.kafka.IGetKafkaDetailsModel;

public interface IGetKafkaDetails {
  
  public IGetKafkaDetailsModel process(IGetKafkaDetailsModel requestModel);
  
}
