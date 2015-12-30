package ua.gmail.project.service;

import java.util.List;

import ua.gmail.project.entity.EventType;



public interface EventTypeService {
	void insertEventType(String typeName);
	
List<EventType> getAllEventTypes();
	
	EventType getEventTypeByTypeName(String typeName);

}
