package ua.gmail.project.dao;


import ua.gmail.project.entity.EventType;


public interface EventTypeDao extends EntityDAO<EventType, Integer>{
	
	EventType findByEventTypeName(String typeName);
	
}
