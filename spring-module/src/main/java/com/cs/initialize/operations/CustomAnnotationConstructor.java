package com.cs.initialize.operations;

import org.springframework.stereotype.Component;

import com.cs.custom.annotation.ConstructorAnnotation;

@Component
public class CustomAnnotationConstructor {
  
  @ConstructorAnnotation(value="hi")
  String value;
  
  //@ConstructorAnnotation
  public CustomAnnotationConstructor()
  {
    this.value = "200Value";
  }
  
  public void printMessage() {
    System.out.println("\n\nThis is ." + CustomAnnotationConstructor.class.getName() + ". Inside the printMessage method\n\n");
  }
}
