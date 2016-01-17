package ua.gmail.project.dao;
 
import java.util.List;

import ua.gmail.project.dao.EntityDAO;
import ua.gmail.project.entity.Event;
import ua.gmail.project.entity.Location;

public interface EventDAO extends EntityDAO<Location, Integer>{

	void add(Event event);

	void update(Event event);

	void remove(Event event);

	List<Event> findAllEvents(Class<Event> class1);

}