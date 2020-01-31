package com.cs.initialize.operations;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanInitializeOperation implements InitializingBean, DisposableBean {
  
  public void init()
  {
    System.out.println("\n\n\nInside init() Before bean has created method...\n\n\n");
  }
  
  @Override
  public void afterPropertiesSet() throws Exception
  {
    System.out
        .println("\n\nThis is cllabck method for bean lifecycle and it is tightlt coupled\n\n");
  }
  
  @Override
  public void destroy() throws Exception
  {
    System.out.println("\n\nThis is callback mehtod for bean cleaning and closing process\n\n");
  }
  
}
