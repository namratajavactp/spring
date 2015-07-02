package nama.Springaoplab_todo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	try
    	{
    		//todo:create container to read configuration file from classpath
    		ApplicationContext ctx=new ------------------("----------.xml");
    	
    		//todo: get the aspect bean 'StockReport' from the container
			springidol.StockReport m = -------------------------;
			
			//todo: get the Volenteer bean from container (chk the id of bean in container)
			springidol.--------   t=(springidol.Stock)ctx.getBean(------------);
			
			//todo:purchase the stock using stock bean
			t.-----------("citiustech shares");
			
   		 
    	}
    	catch(Exception exp)
		{
			exp.printStackTrace();
		} 
			
			
    }
}
