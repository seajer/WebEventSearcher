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
	public void insertEventType(String typeName) {
		if(typeName != null){
			EventType eventType = new EventType(typeName);
			eventTypeDao.add(eventType);
		}else{
			System.out.println("Name of EventType is empty.");
		}
		
	}
	
	@Transactional
	public List<EventType> getAllEventTypes() {
		return eventTypeDao.findAll(EventType.class);
	}
	
	@Transactional
	public EventType getEventTypeByTypeName(String typeName) {
		return eventTypeDao.findByEventTypeName(typeName);
	}

}
