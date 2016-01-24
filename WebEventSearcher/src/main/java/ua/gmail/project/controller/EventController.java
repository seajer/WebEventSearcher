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
import ua.gmail.project.entity.EventType;
import ua.gmail.project.entity.Location;
import ua.gmail.project.service.EventService;

@Controller
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@RequestMapping(value = "/events")
	public String getEvents(Model model){
		List<Event> allEvents = eventService.findAll();
		model.addAttribute("events", allEvents);
		return "event-all";
	}
	
	@RequestMapping(value = "/newEvent")
	public String addEventPage(Model model){
		model.addAttribute("event", new Event());
		return "event-new";
	}
	
	@RequestMapping(value="/deleteEvent")
	public String deleteEvent(@RequestParam (value = "id") String id){
		eventService.delete(eventService.findById(id));
		return "redirect:/events";
	}
	
	@RequestMapping(value = "/events", method = RequestMethod.POST)
	public String createEvent(@RequestParam String name, @RequestParam Integer price,
					@RequestParam Date eventStart, @RequestParam Date eventEnd,
					@RequestParam Location location, @RequestParam EventType eventType){
		Event newEvent = new Event();
		newEvent.setName(name);
		newEvent.setPrice(price);
		newEvent.setEventStart(eventStart);
		newEvent.setEventEnd(eventEnd);
		newEvent.setEventLocation(location);
		newEvent.setEventType(eventType);
		eventService.add(newEvent);
		return "redirect:/event-all";
		
	}
}
