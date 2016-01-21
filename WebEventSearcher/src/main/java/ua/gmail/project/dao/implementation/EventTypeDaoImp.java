package ua.gmail.project.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.gmail.project.dao.EventTypeDao;
import ua.gmail.project.entity.EventType;


@Repository
public class EventTypeDaoImp extends EntityDAOAbstract<EventType, Integer> implements EventTypeDao {
	
@PersistenceContext(unitName = "Primary")
private EntityManager entityManager;


				
	@Transactional
	public void addEventType(EventType eventType) {
		entityManager.persist(eventType);
	
	}
	@Transactional
	public void updateEventType(EventType eventType) {
		entityManager.merge(eventType);
	}
	@Transactional
	public void removeEventType(EventType eventType) {
		entityManager.remove(eventType);
	
	}

	@Transactional
	public EventType findByName(String typeName) {
		return entityManager.createNamedQuery("EventType.findByName", EventType.class)
				.setParameter("typeName", typeName).setMaxResults(1).getSingleResult();
	}
	@Transactional
	public EventType findById(int id) {
		return entityManager.find(EventType.class, id);
	}

	@Transactional
	public List<EventType> findAllEventTypes() {
		return entityManager.createQuery("from EventType", EventType.class).getResultList();
	}
	
	
	
}
