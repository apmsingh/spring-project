package com.cs.transaction.logs.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogAspects {
  
  //@Before("execution(* com.cs..*..(..))")
  public void doAccessCheck()
  {
    System.out.println("Inside the transaction");
  }
}
