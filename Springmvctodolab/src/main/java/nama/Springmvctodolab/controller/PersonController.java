package nama.Springmvctodolab.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;  
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;  

@Controller
public class PersonController {

	
	 @RequestMapping(value="/personform",method = RequestMethod.GET)  
	    public ModelAndView personPage() {  
	        return new ModelAndView("personpage", "personentity", new Person());  
	    }  
	      
	   @RequestMapping(value="/processperson")  
	    public ModelAndView processPerson(@ModelAttribute Person person) {  
	        ModelAndView modelAndView = new ModelAndView();  
	        modelAndView.setViewName("personresultpage");  
	          
	        modelAndView.addObject("pers", person);  
	          
	        return modelAndView;  
	    }  
	    
	    
}
