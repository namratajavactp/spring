package springidol;

public class Volunteer implements Stock{
  private String stockName;
  

public void purchaseStock(String stockName)
  {System.out.println("Name of stock is..."+stockName);
	  this.stockName=stockName;
	  
  }

public String getStockName() {
	return stockName;
}
}