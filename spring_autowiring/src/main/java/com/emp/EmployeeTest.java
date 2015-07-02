
package com.emp;

import java.io.FileInputStream;
import org.springframework.core.io.Resource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import com.emp.Employee;

public class EmployeeTest
{
	public static void main(String[] args) 
	{
		try
		{
			//following line is traditional way of creating an Employee
			//Employee emp = new Employee("Amit");

		//	Resource resource = new FileSystemResource(".\\config\\employees.xml");
			
			
			
			
			
			Resource resource = new FileSystemResource(".\\config\\app-context.xml");
			BeanFactory factory = new XmlBeanFactory(resource);
            Employee emp = (Employee) factory.getBean("emloyee");

			System.out.println("The Details of created Employee is :: "+ emp);

		}
		catch(Exception exp)
		{
			exp.printStackTrace();
		}
	}
}
