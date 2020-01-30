package com.cs.strategy.kafka;

import java.util.UUID;

import org.springframework.stereotype.Component;

import com.cs.model.kafka.IGetKafkaDetailsModel;

@Component
public class GetKafkaDetailsStrategy implements IGetKafkaDetailsStrategy {
  
  @Override
  public IGetKafkaDetailsModel process(IGetKafkaDetailsModel requestModel)
  {
    requestModel.setId(UUID.randomUUID().toString());
    return requestModel;
  }
  
}
