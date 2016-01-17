package ua.gmail.project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.gmail.project.entity.EventType;
import ua.gmail.project.service.EventTypeService;


@Controller
public class EventTypeController {

	@Autowired
	private EventTypeService eventTypeService; 
	
	
	@RequestMapping(value = "/showAllEventTypes")
	public String getEventTypes (Model model){
		List<EventType> allEventTypes = eventTypeService.getAllEventTypes();
		model.addAttribute("eventTypes", allEventTypes);
		return "eventType-all";
	}
		
		
	@RequestMapping(value = "/createNewEventType")
	public String createEventTypePage(){
		return "eventType-new";
	}
	
	@RequestMapping(value = "/showAllEventTypes", method = RequestMethod.POST)
	public String createEventType(@RequestParam(value = "typeName") String typeName){
		eventTypeService.insertEventType(typeName);
		return "redirect:/showAllEventTypes";
	}
		

	
}
