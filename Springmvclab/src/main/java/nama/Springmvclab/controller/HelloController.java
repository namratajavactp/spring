package nama.Springmvclab.controller;


import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HelloController {

//	@RequestMapping("/helloWorld")
	@RequestMapping(value="/hi1")
	public String handleMyRequest(Map<String, Object> model) {
		String now = new java.util.Date().toString();
		model.put("now", now);
		
		return "hello";
	}
};