package com.mypkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	@RequestMapping(value="/hello",method = RequestMethod.GET)
	public String sayhello(){
		return "hello user";
	}
}
