package springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


//todo: declare StockReport class as an Aspect

-----------
public class StockReport implements StockTransactionTracker
{
	private String stockName;
	
	
	//todo: declare the pointcut using pointcut expression
	@Before("----------------------")
	public void interceptTransac(String stock)
	{
		System.out.println("intercepting stock transacion");
		this.stockName=stock;
		System.out.println("intercepting stock transaction"+stock);
	}
	
	
	
 }

	

	
