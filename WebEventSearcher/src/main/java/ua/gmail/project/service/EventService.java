package ua.gmail.project.service;

import java.util.List;

import ua.gmail.project.entity.Event;

public interface EventService {
	
	public void add (Event event);
	
	public void update(Event event);
	
	public void delete (Event event);
	
	public Event findById(String id);
	
	public List<Event> findAll();
	
	
}
