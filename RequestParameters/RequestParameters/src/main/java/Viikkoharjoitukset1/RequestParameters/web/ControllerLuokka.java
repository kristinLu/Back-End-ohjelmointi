package Viikkoharjoitukset1.RequestParameters.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerLuokka {
	
	@RequestMapping("hello")
	@ResponseBody
	public String sayHello(@RequestParam(name="location") String location, @RequestParam(name="name") String name) {
		return "Welcome to the " + location + " " + name + "!";
	}

}
