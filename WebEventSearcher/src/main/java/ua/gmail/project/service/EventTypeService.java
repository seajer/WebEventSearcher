package ua.gmail.project.service;

import java.util.List;

import ua.gmail.project.entity.EventType;



public interface EventTypeService {
	
	void addEventType(String typeName);
	
	void updateEventType (String typeName);
	
	void removeEventType (EventType eventType);
	
	EventType getEventTypeByName(String typeName);
	
	EventType getEventTypeById(int id);
	
	List<EventType> getAllEventTypes();

}
