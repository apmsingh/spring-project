package com.cs.custom.annotation;

import java.time.Clock;
import java.time.ZoneId;

import javax.validation.ClockProvider;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ConstructorAnnotationValidator implements ConstraintValidator<ConstructorAnnotation, String> {

  @Override
  public void initialize(ConstructorAnnotation constructorAnnotation) {
    System.out.println("\n\n Inside Initialization of custom Annotationn\n\n");
  }
  
  @Override
  public boolean isValid(String value, ConstraintValidatorContext context)
  {
    ClockProvider clockProvider = context.getClockProvider();
    Clock clock = clockProvider.getClock();
    ZoneId zone = clock.getZone();
    System.out.println("\n\nIn which zone we are" + zone.getId() + "\n\n");
    System.out.println("\n\n\n" + value + "\n\n");
    System.out.println("\n\n\n" + context + "\n\n");
    return false;
  }
  
}
