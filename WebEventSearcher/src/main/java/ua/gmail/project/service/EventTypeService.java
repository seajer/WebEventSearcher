package ua.gmail.project.service;

import java.util.List;

import ua.gmail.project.entity.EventType;



public interface EventTypeService {
	
	void addEventType(EventType eventType);
		
	void updateEventType (EventType eventType);
	
	void removeEventType (String id);
	
	EventType getEventTypeByName(String typeName);
	
	EventType getEventTypeById(int id);
	
	List<EventType> getAllEventTypes();

}
