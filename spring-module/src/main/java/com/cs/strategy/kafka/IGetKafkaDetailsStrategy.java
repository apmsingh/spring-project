package com.cs.strategy.kafka;

import com.cs.model.kafka.IGetKafkaDetailsModel;

public interface IGetKafkaDetailsStrategy {
  
  public IGetKafkaDetailsModel process(IGetKafkaDetailsModel requestModel);
}
