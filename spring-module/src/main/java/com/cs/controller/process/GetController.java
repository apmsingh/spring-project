package com.cs.controller.process;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cs.initialize.operations.BeanInitializeOperation;
import com.cs.model.base.EmployeeModel;
import com.cs.model.base.ManagerModel;
import com.cs.model.base.SalaryModel;

/**
 * @author Abhaypratap.Singh
 * @description: This is the test url page for an application
 * */
@RestController
public class GetController {
  
  /**
   * Inject the application context bean to fetch all the beans available
   * */
  @Autowired
  private ApplicationContext context;
  
  @RequestMapping(value = "/get", method = RequestMethod.GET)
  public String getTest()
  {
    BeanInitializeOperation beanInitializeOperation = context.getBean(BeanInitializeOperation.class);
    return method().toString();
  }
  
  public StringBuffer method() {
    opearationTested();
    StringBuffer strBuffer = new StringBuffer();
    strBuffer.append("In case of single class");
    strBuffer.append("When scope is singelton --> SAME instance every time");
    strBuffer.append("When scope is singelton --> NEW instance every time");
    strBuffer.append("\n\n");

    strBuffer.append("In case of double class");
    strBuffer.append("When scope of Outer is single and inner is prototype respectively");
    strBuffer.append("When scope is singelton and prototype --> SAME instance every time outer and inner both");
    strBuffer.append("\n\n");

    strBuffer.append("In case of double class");
    strBuffer.append("When scope of Outer is prototype and inner is prototype respectively");
    strBuffer.append("When scope is prototype and prototype --> NEW instance for outer and SAME instance for inner");
    strBuffer.append("\n\n");

    strBuffer.append("In case of double class");
    strBuffer.append("When scope of Outer is prototype and inner is singelton respectively");
    strBuffer.append("When scope is prototype and singelto --> NEW instance for outer and SAME instance for inner");
    strBuffer.append("\n\n");
    
    return strBuffer;
  }

  private void opearationTested()
  {
    ManagerModel managerBeanFirst = context.getBean(ManagerModel.class);
    EmployeeModel employeeModelFirst = managerBeanFirst.getEmployeeModel();
    System.out.println(managerBeanFirst.toString());
    
    System.out.println("\n\n Checking the singelton scope of Data --");
    System.out.println("-----------Singelton Demo----------");
    ManagerModel managerBean = context.getBean(ManagerModel.class);
    EmployeeModel employeeModel = managerBean.getEmployeeModel();
    
    ManagerModel managerBean1 = context.getBean(ManagerModel.class);
    EmployeeModel employeeModel1 = managerBean.getEmployeeModel();
    System.out.println("Manager Bean"+ managerBean.toString());
    System.out.println("Manager Bean"+ managerBean1.toString());

    System.out.println("-----------Prototype Demo----------");
    System.out.println("Salary Bean"+ context.getBean(SalaryModel.class).toString());
    System.out.println("Salary Bean"+ context.getBean(SalaryModel.class).toString());

    System.out.println("-----------Prototype Demo----------");
    System.out.println("Employee Bean"+ context.getBean(EmployeeModel.class).toString());
    System.out.println("Employee Bean"+ context.getBean(EmployeeModel.class).toString());
    
    System.out.println("-------- Singleton with Prototype inside Manager is singelton and Employee is prototype ---");
    System.out.println("Manager Bean"+ managerBean.toString());
    System.out.println("Manager Bean"+ managerBean.toString());
  }
}
