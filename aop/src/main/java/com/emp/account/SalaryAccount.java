package com.emp.account;

public class SalaryAccount implements Account
{
	public void withDraw(int amt) throws Exception
	{
		if(amt>100)
		System.out.println("withdrawing from SalaryAccount ...");
		else
		throw new Exception();
	}
}
