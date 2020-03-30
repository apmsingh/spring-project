package com.cs.custom.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = ConstructorAnnotationValidator.class)
@Target({ ElementType.CONSTRUCTOR, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface ConstructorAnnotation
{
  
  public String value() default "Hello";
  
  String message() default "{Testing}";
  
  Class<?>[] groups() default {};
  
  Class<? extends Payload>[] payload() default {};
}
