package com.mypkg.controllers;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/welcome")
public class WelcomeController {
	@RequestMapping("/")
	@ResponseBody
	public String welcome(){
		return "welcome to spring boot";
	}
}
