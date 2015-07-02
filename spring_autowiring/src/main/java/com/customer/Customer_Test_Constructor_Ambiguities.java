package com.customer;

import java.io.FileInputStream;
import org.springframework.core.io.Resource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import com.customer.Customer;


public class Customer_Test_Constructor_Ambiguities 
{
		public static void main(String[] args) 
		{
			try
			{
				//following line is traditional way of creating an Employee
				//Employee emp = new Employee("Amit");

			//	Resource resource = new FileSystemResource(".\\config\\employees.xml");
				
				Resource resource = new FileSystemResource(".\\config\\app-context1.xml");
				BeanFactory factory = new XmlBeanFactory(resource);
	            Customer cust = (Customer) factory.getBean("Customer");

				System.out.println("The Details of created Customer is :: "+ cust);

			}
			catch(Exception exp)
			{
				exp.printStackTrace();
			}
		}
	}



