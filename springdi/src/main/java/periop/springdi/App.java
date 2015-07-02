package periop.springdi;

/**
 * Hello world!
 *
 */

import java.io.FileInputStream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;



public class App 
{
    public static void main( String[] args )
    {
    	
    	try
		{
			//following line is traditional way of creating an Employee
			//Employee emp = new Employee("Amit");
            ApplicationContext context = new ClassPathXmlApplicationContext("employees.xml");
			
			
            Employee emp = (Employee) context.getBean("employee");

			System.out.println("The Details of created Employee is :: "+ emp);
			//emp.computeSal()
			
	             emp.getD().addMonth(4);
	         	System.out.println("The Details of created Employee is :: "+ emp);
	             

		}
		catch(Exception exp)
		{
			exp.printStackTrace();
		}
	}
        
 }

