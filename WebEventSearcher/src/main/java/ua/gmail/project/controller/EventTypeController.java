package ua.gmail.project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.gmail.project.entity.Event;
import ua.gmail.project.entity.EventType;
import ua.gmail.project.entity.Location;
import ua.gmail.project.service.EventTypeService;

@Controller
public class EventTypeController {

	@Autowired
	private EventTypeService eventTypeService; 
	
	@RequestMapping(value = "/types")
	public String getEventTypes (Model model){
		model.addAttribute("types", eventTypeService.getAllEventTypes());
		return "type-all";
	}
	
	@RequestMapping(value = "/newType")
	public String newType(Model model){
		model.addAttribute("type", new EventType());
		return "type-new";
	}
	
	@RequestMapping(value = "/createType", method = RequestMethod.POST)
	public String createType(
			@ModelAttribute(value = "type") EventType eventType){
		eventTypeService.updateEventType(eventType);
		return "redirect:/types";
	}
	
	 @RequestMapping(value="/editType")
	public String editType(Model model, @RequestParam(value="id") String id){
		EventType eventType = eventTypeService.getEventTypeById(Integer.parseInt(id));
		model.addAttribute("type", eventType);
		return "type-edit";
	}

	@RequestMapping(value = "/updateType")
	public String updateType(
			@ModelAttribute(value = "type") EventType eventType){
		eventTypeService.updateEventType(eventType);
		return "redirect:/types";
	}
	
	@RequestMapping(value = "/deleteType", method = RequestMethod.POST)
	public String deleteType(@RequestParam(value="id") String id){
		eventTypeService.removeEventType(id);
		return "redirect:/types";
	}
	
}
