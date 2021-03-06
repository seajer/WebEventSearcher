package ua.gmail.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ua.gmail.project.entity.EventType;
import ua.gmail.project.entity.Location;
import ua.gmail.project.service.LocationService;

@Controller
public class LocationController {
	
	@Autowired
	private LocationService locationService;
	
	
	@RequestMapping(value="/locations")
	public String showAllLocations(Model model){
		model.addAttribute("locations", locationService.findAll());
		return "location-all";
	}
	
	@RequestMapping(value="/newLocation")
	public String newLocation(Model model){
		model.addAttribute("location", new Location());
		return "location-new";
	}
	
	@RequestMapping(value="/createLocation")
	public String createLocation(@ModelAttribute(value = "location") Location location){
		locationService.update(location);
		return "redirect:/locations";
	}
	
	@RequestMapping(value="/updateLocation")
	public String updateLocation(@ModelAttribute(value = "location") Location location){
		locationService.update(location);
		return "redirect:/locations";
	}
	
	@RequestMapping(value="/deleteLocation")
	public String deleteLocation(@RequestParam(value="id") String id){
		locationService.remove(id);
		return "redirect:/locations";
	}
	
	@RequestMapping(value="/editLocation")
	public String editLocation(Model model,
			@RequestParam(value="id") String id){
		Location location = locationService.findById(id);
		model.addAttribute("location", location);
		return "location-edit";
	}

}
