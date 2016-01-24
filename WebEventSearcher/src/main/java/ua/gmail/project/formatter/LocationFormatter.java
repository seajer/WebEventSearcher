package ua.gmail.project.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import ua.gmail.project.entity.Location;
import ua.gmail.project.service.LocationService;

@Component
public class LocationFormatter implements Formatter<Location> {

	@Autowired
	private LocationService locationService;
	
	public String print(Location object, Locale locale) {
		
		return object.toString();
	}

	public Location parse(String text, Locale locale) throws ParseException {
		return locationService.findById(text);
	}

}
