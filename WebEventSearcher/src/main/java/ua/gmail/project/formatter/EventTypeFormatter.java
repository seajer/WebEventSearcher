package ua.gmail.project.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import ua.gmail.project.entity.EventType;
import ua.gmail.project.service.EventTypeService;

@Component
public class EventTypeFormatter implements Formatter<EventType> {

	@Autowired
	private EventTypeService eventTypeService; 
	
	public String print(EventType object, Locale locale) {
		return object.toString();
	}

	public EventType parse(String text, Locale locale) throws ParseException {
		if(text.isEmpty()){
			return null;
		}
		return eventTypeService.getEventTypeById(Integer.parseInt(text));
	}

}
