package ua.gmail.project.dao;

import java.util.List;

import ua.gmail.project.entity.EventType;


public interface EventTypeDao extends EntityDAO<EventType, Integer>{
	
	EventType findByEventTypeName(String typeName);
	
}
