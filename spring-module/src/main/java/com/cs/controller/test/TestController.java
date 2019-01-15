package com.cs.controller.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
  
  @RequestMapping(value = "/get", method = RequestMethod.GET)
  public @ResponseBody String getTest()
  {
    return "Insdie the Controller";
  }
}
