package com.cs.initialize.operations;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;

@Configuration
public class PreAndPostInitialization {
  
  @PostConstruct
  public void postConstruct()
  {
    System.out.println("\n\nInside the post construct method...\n\n");
  }
  
  public void preDestory() {
    System.out.println("\n\nInside the pre destroy method...\n\n");
  }
}
