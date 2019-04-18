package com.mypkg;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	String message="welcome to Spring MVC";
	
	@RequestMapping("/hello")
	public ModelAndView showMessage(@RequestParam(value = "name", required = false, defaultValue = "World") String name){
		System.out.println("inside the helloworld controller");
		ModelAndView mv=new ModelAndView("helloworld");
		mv.addObject("message",message);
		mv.addObject("name",name);
		return mv;
	}

}
