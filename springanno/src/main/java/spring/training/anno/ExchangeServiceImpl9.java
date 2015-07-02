package spring.training.anno;
import org.springframework.stereotype.Component;

import spring.training.ExchangeService;


@Component
public class ExchangeServiceImpl9 implements ExchangeService {

	public ExchangeServiceImpl9() {
		System.out.println("ExchangeServiceImpl()");
	}
	public double getExchangeRate() {
		System.out.println("getExchangeRate()");
		return 44.25;
	}
}
