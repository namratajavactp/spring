


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.emp.IEmployee;

public class EmployeeTest
{
	public static void main(String[] args) 
	{
		try
		{
			ApplicationContext ctx=new ClassPathXmlApplicationContext("employees1.xml");
		   
		     IEmployee emp = (IEmployee) ctx.getBean("emloyee");

           	emp.depositAccount(300);
			System.out.println("employee is going to withDraw amount...");
			emp.withDrawFromAccount(400);
			//if any method is called on emp e.g getName() , then also before
			//every method, the before() method of Advice will be called.
			//System.out.println(emp.getName() + "  has withDrawn successfully...");
			System.out.println("employee has withDrawn successfully...");
			
			System.out.println("employee withDrawing amt less than 1oo ...");
			try
			{
			emp.withDrawFromAccount(90);
			}
			catch(Exception e)
			{
				System.out.println("amt less than 100");
			
			} 
			
			
		/*
			springidol.Thinker t=(springidol.Thinker)ctx.getBean("volunteer");
			springidol.MindReader m=(springidol.MindReader)ctx.getBean("magician");
			t.thinkOfSomething("hi eating burger");
			System.out.println("volunteer's thoughts:"+m.getThoughts());    */
			
		}
		catch(Exception exp)
		{
			exp.printStackTrace();
		} 
			
			
			
	}
}
