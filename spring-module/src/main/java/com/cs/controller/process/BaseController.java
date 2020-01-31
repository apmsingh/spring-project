package com.cs.controller.process;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * This controller has used to display the home page of an application.
 * @author Abhaypratap.Singh
 * */
@RestController
public class BaseController {
  
  @RequestMapping(value = "/")
  public ModelAndView getDisplay()
  {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("index");
    return modelAndView;
  }
}
