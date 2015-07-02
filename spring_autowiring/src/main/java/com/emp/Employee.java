package com.emp;

import com.util.MyDate;

public class Employee 
{
	private String firstname="dude";
	private String lastname="dude";
	private MyDate birthdate=null;

	public MyDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(MyDate birthdate) {
		this.birthdate = birthdate;
	}

	public Employee()
	{
		System.out.println("inside default constructor of Employee()");
	}

    public Employee(String firstname)
	{
		System.out.println("inside constructor Employee(String)");
		this.firstname = firstname;
	}
	
	public Employee(String firstname,String lastname)
	{
		System.out.println("inside constructor Employee(String,String)");
		this.firstname = firstname;
		this.lastname = lastname;
	}

    public Employee(String firstname,String lastname,MyDate birthdate)
	{
		System.out.println("inside constructor Employee(String,String,MyDate)");
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthdate = birthdate;
	}

	public String toString()
	{
		return "FullName :: "+ this.firstname + this.lastname + "\n" + "BirthDate :: " + this.birthdate.toString();
	}

	
}