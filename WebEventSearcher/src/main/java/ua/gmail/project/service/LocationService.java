package ua.gmail.project.service;

import java.util.List;

import ua.gmail.project.entity.EventType;
import ua.gmail.project.entity.Location;

public interface LocationService {
	
	public void add(Location location);
	
	public void update(Location location);
		
	public List<Location> findAll();

}
