package ua.gmail.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.gmail.project.entity.Visitor;
import ua.gmail.project.service.VisitorService;

@Controller
public class VisitorController {
	
	
	 @Autowired
	private VisitorService visitorService; 
	
	@RequestMapping(value = "/visitors")
	public String getVisitors (Model model){
		model.addAttribute("visitors", visitorService.getAllVisitors());
		return "visitor-all";
	}
	
	@RequestMapping(value = "/newVisitor")
	public String newVisitor(Model model){
		model.addAttribute("visitor", new Visitor());
		return "visitor-new";
	}
	
	@RequestMapping(value = "/createVisitor", method = RequestMethod.POST)
	public String createVisitor(
			@ModelAttribute(value = "visitor") Visitor visitor){
		visitorService.updateVisitor(visitor);
		return "loginpage";
	}
	
	 @RequestMapping(value="/editVisitor")
	public String editVisitor(Model model, @RequestParam(value="id") String id){
		Visitor visitor = visitorService.getVisitorById(Integer.parseInt(id));
		model.addAttribute("visitor", visitor);
		return "visitor-edit";
	}

	@RequestMapping(value = "/updateVisitor")
	public String updateVisitor(
			@ModelAttribute(value = "visitor") Visitor visitor){
		visitorService.updateVisitor(visitor);
		return "redirect:/visitors";
	}
	
	@RequestMapping(value = "/deleteVisitor", method = RequestMethod.POST)
	public String deleteVisitor(@RequestParam(value="id") String id){
		visitorService.removeVisitor(id);
		return "redirect:/visitors";
	}
	 
}
