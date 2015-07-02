package springidol;

public class Volunteer implements Thinker{
  private String thoughts;
  
  public void thinkOfSomething(String thoughts)
  {System.out.println("I am thinking..."+thoughts);
	  this.thoughts=thoughts;
	  
  }

public String getThoughts() {
	return thoughts;
}
}
