package springmvcdemo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	String message="Welcome to spring MVC";
	
	@RequestMapping("/hello")
	public ModelAndView showMessage(@RequestParam(value = "name", required = false, defaultValue = "World") String name){
		System.out.println("Inside helloWorld Controller");
		ModelAndView mv=new ModelAndView("hellworld");
		mv.addObject("message",message);
		mv.addObject("name",name);
		return mv;
	}
}
