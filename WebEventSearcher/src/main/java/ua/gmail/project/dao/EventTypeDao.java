package ua.gmail.project.dao;

import java.util.List;

import ua.gmail.project.entity.EventType;


public interface EventTypeDao {

	void insertEventType(EventType eventType);
	
	List<EventType> findAll();
	
	EventType findByEventTypeName(String typeName);
	
	//TODO: Writing remove methods and so on!
	
	
}
