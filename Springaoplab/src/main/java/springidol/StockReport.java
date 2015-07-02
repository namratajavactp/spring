package springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;



@Aspect
public class StockReport implements StockTransactionTracker
{
	private String stockName;
	
//	@Pointcut("execution(* springidol.Stock.purchaseStock(String)) && args(stock)")
  //  public void tracking(String stock){}
	
	
	//@Before("tracking(stock)")
	@Before("execution(* springidol.Stock.purchaseStock(String)) && args(stock)")
	public void interceptTransac(String stock)
	{
		System.out.println("intercepting stock transacion");
		this.stockName=stock;
		System.out.println("intercepting stock transaction"+stock);
	}
	
	



	
 }

	

	
