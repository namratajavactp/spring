package com.emp.employee;

import com.emp.account.Account;


public class Employee implements IEmployee
{
	private String name;

	private Account account;
	//private SalaryAccount account;
	//private DematAccount account;

    //following line is a traditional way, without making use of IoC
	//Instead of using loggingService here its better to treat it as
	//another Aspect and apply LoggingServiceAdvice to this Employee declaratively.
	//LoggingService loggingservice = new LoggingService();
	

	public Employee(Account acct,String name)
	{  
		this.account=acct;
		this.name = name;
		//following line introduces the strong coupling between
		//Employee and one of the Account class i.e. SalaryAccount
        //account = new SalaryAccount();
	}

	public void withDrawFromAccount(int amt)throws Exception // throws LowBalanceException 
	{
		/* following line is going to give call to logging service
		  limitations of tight-coupling this LoggingService with Employee
		  1.If tommorrow if this concern changes, one has to modify all the
		    components having following line in it.
		  2. Employee is coupled with this LoggingService which is actually 
		     not core functionality of this Bean. */
		//loggingservice.audit(name);

		
		
		account.withDraw(amt);
		
		
		
	}

	
	public void depositAccount(int amt)
	{
		System.out.println("amt deposited");
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
	}



    public Account getAccount()
	{
		return this.account;
	}
	public void setAccount(Account account)
	{
		System.out.println("am inside setAccount(), the dependency is getting injected...");
		//here the dependent object Account has been injected into
		//this Employee class. Depending on XML configuration, any
		//subclass of Account can be injected into this Employee.
		this.account = account;


	}

	

	
}