package com.mypkg.application;
import java.util.*;
import java.text.DateFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String  hello(Locale locale,Model model){
		Date date=new Date();
		DateFormat dateFormat=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG, locale);
		String formattedDate=dateFormat.format(date);
		model.addAttribute("serverTime",formattedDate);
		return "home";
	}
}
