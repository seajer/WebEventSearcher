package ua.gmail.project.dao;


import java.util.List;

import ua.gmail.project.entity.EventType;


public interface EventTypeDao extends EntityDAO<EventType, Integer>{
	
	void addEventType(EventType eventType);
	
	void updateEventType (EventType eventType);
	
	void removeEventType (EventType eventType);
	
	EventType findByName(String typeName);
	
	EventType findById(int id);
	
	List<EventType> findAllEventTypes();
	
}
