package ua.gmail.project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.gmail.project.entity.EventType;
import ua.gmail.project.service.EventTypeService;



@Controller
public class EventTypeController {

	@Autowired
	private EventTypeService eventTypeService; 
	
	
	@RequestMapping(value = "/createNewEventType")
	public String createEventTypePage(Model model){
		model.addAttribute("eventTypeObject", new EventType());
		return "eventType-new";
	}
	
	@RequestMapping(value = "/createEventType", method = RequestMethod.POST)
	public String createEventType(
			@ModelAttribute(value = "eventTypeObject") EventType eventType){
		eventTypeService.addEventType(eventType.getTypeName());
		return "redirect:/showAllEventTypes";
	}
	
	@RequestMapping(value = "/editOldEventType")
	public String editEventType(Model model,
			@RequestParam(value="id") String id,
			@RequestParam(value="operation") String operation){
		EventType eventType = eventTypeService.getEventTypeById(Integer.parseInt(id));
		if(operation.equals("edit")){
			model.addAttribute("eventType", eventType);
			return "eventType-edit";
		}else if (operation.equals("delete")){
			eventTypeService.removeEventType(id);
		}
		return "redirect:/showAllEventTypes";
		
	}
	
	@RequestMapping(value = "/editEventType", method = RequestMethod.POST)
	public String editEventType(
			@ModelAttribute(value = "eventType") EventType eventType){
		eventTypeService.updateEventType(eventType);
		return "redirect:/showAllEventTypes";
	}
	
	@RequestMapping(value = "/deleteOldEventType")
	public String deleteEventTypePage(Model model){
		model.addAttribute("eventTypeObject", new EventType());
		return "eventType-delete";
	}
	
	@RequestMapping(value = "/deleteEventType", method = RequestMethod.POST)
	public String deleteEventType(
			@ModelAttribute(value = "eventTypeObject") EventType eventType){
		//eventTypeService.removeEventType(eventType);
		return "redirect:/showAllEventTypes";
	}
		
	@RequestMapping(value = "/showAllEventTypes")
	public String getEventTypes (Model model){
		List<EventType> allEventTypes = eventTypeService.getAllEventTypes();
		model.addAttribute("eventTypes", allEventTypes);
		return "eventType-all";
	}
		
		

	

		

	
}
