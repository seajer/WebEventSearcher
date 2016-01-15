package ua.gmail.project.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.gmail.project.entity.Event;
import ua.gmail.project.service.EventService;

@Controller
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@RequestMapping(value = "/showAllEvents")
	public String getEvents(Model model){
		List<Event> allEvents = eventService.findAll();
		model.addAttribute("event", allEvents);
		return "event-all";
	}
	
	@RequestMapping(value = "/addNewEvent")
	public String addEventPage(){
		return "event-addNew";
	}
	
	@RequestMapping(value = "/showAllEvents", method = RequestMethod.POST)
	public String addEvent(@RequestParam(value = "name") String name, @RequestParam(value = "price") Integer price,
					@RequestParam(value = "dateStart") Date eventStart, @RequestParam(value = "eventEnd") Date eventEnd){
		eventService.add(new Event(name, eventStart, eventEnd, price));
		return "redirect:/event-all";
		
	}
}
