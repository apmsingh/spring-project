package com.cs.controller.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cs.interactor.kafka.IGetKafkaDetails;
import com.cs.model.kafka.GetKafkaDetailsModel;
import com.cs.model.kafka.IGetKafkaDetailsModel;

@RestController
@RequestMapping("/kafka")
public class GetKafkaDetailsController {
  
  @Autowired
  IGetKafkaDetails getKafkaDetails;
  
  @RequestMapping(value = "/getdetails", method = RequestMethod.GET)
  public IGetKafkaDetailsModel getTest()
  {
    IGetKafkaDetailsModel requestModel = new GetKafkaDetailsModel();
    return getKafkaDetails.process(requestModel);
  }
}
