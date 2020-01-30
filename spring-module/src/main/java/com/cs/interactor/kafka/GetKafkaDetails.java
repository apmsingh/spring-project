package com.cs.interactor.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cs.model.kafka.IGetKafkaDetailsModel;
import com.cs.strategy.kafka.IGetKafkaDetailsStrategy;

@Component
public class GetKafkaDetails implements IGetKafkaDetails {
  
  @Autowired
  IGetKafkaDetailsStrategy getKafkaDetailsStrategy;
  
  @Override
  public IGetKafkaDetailsModel process(IGetKafkaDetailsModel requestModel)
  {
    return getKafkaDetailsStrategy.process(requestModel);
  }
  
}
