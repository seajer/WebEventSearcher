package ua.gmail.project.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.gmail.project.service.VisitorService;

@Controller
public class HomeController {
	
	@Autowired
	private VisitorService visitorService;
	
	@RequestMapping(value = "/")
	public String home(Model model, Principal principal, HttpServletRequest request) {
		  HttpSession session = request.getSession(false);
		  	try {
		session.setAttribute("Visitor", visitorService.getVisitorById(Integer.parseInt(principal.getName())).getLogin());
		  } catch (Exception e) {
		   System.out.println("No authentication.");
		  }
		  return "home";
		 }
	
	@RequestMapping(value = "/login")
	private String login(){
		return "loginpage";
	}
}
