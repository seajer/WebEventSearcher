package ua.gmail.project.controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.gmail.project.entity.Event;
import ua.gmail.project.entity.EventType;
import ua.gmail.project.entity.Location;
import ua.gmail.project.service.EventService;
import ua.gmail.project.service.EventTypeService;
import ua.gmail.project.service.LocationService;

@Controller
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@Autowired
	private LocationService locationService;
	
	@Autowired
	private EventTypeService eventTypeService;
	
	
	@RequestMapping(value = "/events")
	public String getEvents(Model model){
		model.addAttribute("events", eventService.findAll());
		return "event-all";
	}
	
	@RequestMapping(value = "/newEvent")
	public String newEvent(Model model){
		model.addAttribute("event", new Event());
		model.addAttribute("locations", locationService.findAll());
		model.addAttribute("types", eventTypeService.getAllEventTypes());
		return "event-new";
	}
	
	@RequestMapping(value="/createEvent" ,method = RequestMethod.POST)
	public String createEvent(
			@ModelAttribute(value = "event") @Valid Event event,BindingResult result, 
			Model model){
		eventService.update(event);
		return "redirect:/events";
	}
	
	@RequestMapping(value="/editEvent")
	public String editEvent(Model model, @RequestParam(value="id") String id){
		Event event = eventService.findById(id);
		model.addAttribute("event", event);
		return "event-edit";
	}

	@RequestMapping(value = "/updateEvent")
	public String updateEvent(
			@ModelAttribute(value = "event") Event event){
		eventService.update(event);
		return "redirect:/events";
	}
	@RequestMapping(value="/deleteEvent")
	public String deleteEvent(@RequestParam (value = "id") String id){
		eventService.delete(eventService.findById(id));
		return "redirect:/events";
	}
	
//	@RequestMapping(value = "/events", method = RequestMethod.POST)
//	public String createEvent(@RequestParam String name, @RequestParam Integer price,
//					@RequestParam Date eventStart, @RequestParam Date eventEnd,
//					@RequestParam Location location, @RequestParam EventType eventType){
//		Event newEvent = new Event();
//		newEvent.setName(name);
//		newEvent.setPrice(price);
//		newEvent.setEventStart(eventStart);
//		newEvent.setEventEnd(eventEnd);
//		newEvent.setEventLocation(location);
//		newEvent.setEventType(eventType);
//		eventService.add(newEvent);
//		return "redirect:/events";
//		
//	}
}
