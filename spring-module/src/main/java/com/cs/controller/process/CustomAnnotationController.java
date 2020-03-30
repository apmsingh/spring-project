package com.cs.controller.process;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cs.initialize.operations.CustomAnnotationConstructor;

@RestController
public class CustomAnnotationController {
  
  @Autowired
  private CustomAnnotationConstructor customAnnotationConstructor;
  
  @RequestMapping(value = "/anno", method = RequestMethod.GET)
  public String getTest()
  {
    customAnnotationConstructor.printMessage();
    return "Custom Annotation Validation";
  }
}
