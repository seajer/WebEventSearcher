package ua.gmail.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/")
	public String home(){
		return "home";
	}
	
	@RequestMapping(value = "/login")
	private String login(){
		return "loginpage";
	}
}
