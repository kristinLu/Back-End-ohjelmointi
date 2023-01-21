package Viikkoharjoitukset1.ControllerAndEndpoints.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerLuokka {
	
	@RequestMapping("index")
	@ResponseBody
	public String returnMainPage() {
		return "This is the main page";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String returnContactPage() {
		return "This is the contact page";
	}

}
