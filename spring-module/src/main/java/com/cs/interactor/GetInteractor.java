package com.cs.interactor;

import org.springframework.stereotype.Component;

@Component
public class GetInteractor implements IGetInteractor {

  @Override
  public void process()
  {
    System.out.println("Processing the Request");
  }
  
}
