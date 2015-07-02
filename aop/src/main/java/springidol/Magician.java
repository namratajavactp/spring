package springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;



@Aspect
public class Magician implements MindReader
{
	private String thoughts;
	
	@Pointcut("execution(* springidol.Thinker.thinkOfSomething(String)) && args(thoughts)")
    public void thinking(String thoughts){}
	
	@Before("thinking(thoughts)")
	public void interceptThoughts(String thoughts)
	{
		System.out.println("intercepting volunteers thoughts");
		this.thoughts=thoughts;
		System.out.println("intercepting volunteers thoughts"+thoughts);
	}


	public String getThoughts() {
		return thoughts;
	}

	
 }

	

	
