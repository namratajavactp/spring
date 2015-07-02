package com.emp.employee;

import com.emp.account.Account;


public interface IEmployee 
{
	public void withDrawFromAccount(int amt) throws Exception; // throws LowBalanceException 
	public void depositAccount(int amt);
	public String getName();
	public void setName(String name);
	
    public Account getAccount();
	public void setAccount(Account account);
	
}