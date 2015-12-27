package DAO;

import java.util.Date;
import java.util.List;

import Entity.EventType;
import Entity.Location;

public interface EventDAO<T> {
	
	public List<T> findByInterval(Date begin, Date end);
	
	public List<T> findByLocation(Location location);
	
	public List<T> findByType(EventType eventType);

}
