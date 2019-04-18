package com.mypkg.controller;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/hello")
public class WelcomeController {
	@RequestMapping("/")
	@ResponseBody
	String hello(){
		return "welcome to welcomecontroller in springboot";
	}
	@RequestMapping("/hi")
	@ResponseBody
	String hi(){
		return "saying hi";
	}
	@RequestMapping("/welcome")
	@ResponseBody
	String welcome(){
		return "welcome welcome";
	}
}
