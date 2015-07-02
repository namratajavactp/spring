package nama.Springmvctodolab.controller;

//todo:do the necessary imports for validation

public class Person {

	//todo:
	@Pattern(regexp="^[a-zA-Z0-9]+$", message = "Firstname must be alphanumeric with no spaces")
	 private String firstName;  
	
	
	    private Integer age;  
	      
	    public String getFirstName() {  
	        return firstName;  
	    }  
	      
	    public void setFirstName(String firstName) {  
	        this.firstName = firstName;  
	    }  
	      
	    public Integer getAge() {  
	        return age;  
	    }  
	      
	    public void setAge(Integer age) {  
	        this.age = age;  
	    }  
	
	
}
