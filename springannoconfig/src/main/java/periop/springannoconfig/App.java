package periop.springannoconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import helloI.HelloWorld;
 
public class App {
	public static void main(String[] args) {
	    
		//ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	    HelloWorld obj = (HelloWorld) context.getBean("helloBean");
	    
	    obj.printHelloWorld("Spring3 Java Config");

	}
}