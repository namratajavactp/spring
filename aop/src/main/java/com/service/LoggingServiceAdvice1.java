package com.service;

//import org.apache.log4j.Logger;


import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.emp.Employee;
@Aspect
public class LoggingServiceAdvice1 
{
	//Logger emplogger = Logger.getLogger(Employee.class);
	@Pointcut("execution(* com.emp.account.Account.withDraw(..))")
	public void withDraw(){}

	public LoggingServiceAdvice1()
	{

	}
	
	@AfterReturning("withDraw()")
	public void afterSuccess()  {
		// TODO Auto-generated method stub
		  System.out.println("inside afterReturning method withdrawn and returning from the method !!");
		
	}


	@Before("withDraw()")
    public void beforeSuccess()
	{
      System.out.println("inside before method and  is going to withDraw !!");
	}
    
	@AfterThrowing("withDraw()")
    public void failureExc()
    {
    	System.out.println("inside afterThrowing and exception has occured while withdrawing...");
    }

}
