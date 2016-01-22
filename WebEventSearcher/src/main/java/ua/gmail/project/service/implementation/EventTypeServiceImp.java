package ua.gmail.project.service.implementation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.gmail.project.dao.EventTypeDao;
import ua.gmail.project.entity.EventType;
import ua.gmail.project.service.EventTypeService;


@Service
public class EventTypeServiceImp implements EventTypeService{
	
	@Autowired
	private EventTypeDao eventTypeDao;

	@Transactional
	public void addEventType(String typeName) {
		if(typeName != null){
			EventType eventType = new EventType(typeName);
			eventTypeDao.add(eventType);
		}else{
			System.out.println("Name of EventType is empty.");
		}
		
	}
	@Transactional
	public void updateEventType(EventType eventType) {
		eventTypeDao.update(eventType);
	}
	@Transactional
	public void removeEventType(String id) {
		EventType eventType = eventTypeDao.findById(Integer.parseInt(id));
		eventTypeDao.remove(eventType);
		
	}
	
	@Transactional
	public EventType getEventTypeByName(String typeName) {
		return eventTypeDao.findByName(typeName);
	}


	@Transactional
	public EventType getEventTypeById(int id) {
		return eventTypeDao.findById(id);
	}

	@Transactional
	public List<EventType> getAllEventTypes() {
		return eventTypeDao.findAll(EventType.class);
	}

}
