package ua.gmail.project.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.gmail.project.dao.EntityDAO;
import ua.gmail.project.dao.EventDAO;
import ua.gmail.project.entity.Event;
import ua.gmail.project.service.EventService;


@Service
public class EventServiceImp implements EventService {
	
	@Autowired
	private EventDAO eventDao;
	
	@Transactional
	public void add(Event event){
		if (event != null){
			eventDao.add(event);
		}
	}
	
	@Transactional
	public void update(Event event){
		if(event != null){
			eventDao.update(event);
		}
	}
	
	@Transactional
	public void delete (Event event){
		if(event != null){
			eventDao.remove(event);
		}
	}
	
	@Transactional
	public List<Event> findAll(){
		return eventDao.findAll(Event.class);
	}

	@Transactional
	public Event findById(String id) {
		return eventDao.findByKey(Event.class, Integer.parseInt(id));
		
	}
	
}
