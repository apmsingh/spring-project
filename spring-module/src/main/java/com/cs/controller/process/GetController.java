package com.cs.controller.process;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class GetController {
  
  @RequestMapping(value = "/get", method = RequestMethod.GET)
  public String getTest()
  {
    return "Insdie the Controller";
  }
}
