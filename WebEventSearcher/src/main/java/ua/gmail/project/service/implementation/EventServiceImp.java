package ua.gmail.project.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.gmail.project.dao.EntityDAO;
import ua.gmail.project.dao.EventDAO;
import ua.gmail.project.dto.EventDTO;
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
	public void delete (String id){
		Event event = findById(id);
		eventDao.remove(event);
	}
	
	@Transactional
	public List<EventDTO> findAll(){
		List<Event> list =  eventDao.findAll(Event.class);
		List<EventDTO> listDTO = new ArrayList<EventDTO>();
		for (Event event : list) {
			listDTO.add(new EventDTO(
					Integer.toString(event.getId()), 
					event.getName(), 
					event.getEventStart().toString(), 
					event.getEventEnd().toString(), 
					Integer.toString(event.getPrice()), 
					event.getDescription(), 
					event.getLocation().getName(),
					event.getEventType().getTypeName()));
		}
		return listDTO;
		
	}

	@Transactional
	public Event findById(String id) {
		Event event =eventDao.findByKey(Event.class, Integer.parseInt(id));
		if(event!=null){
			Hibernate.initialize(event.getEventType());
			Hibernate.initialize(event.getLocation());
		}
		return event; 
		
	}
	
}
