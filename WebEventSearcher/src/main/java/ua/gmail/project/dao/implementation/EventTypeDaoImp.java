package ua.gmail.project.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ua.gmail.project.dao.EventTypeDao;
import ua.gmail.project.entity.EventType;


@Repository
public class EventTypeDaoImp implements EventTypeDao {
	
@PersistenceContext(unitName = "Primary")
private EntityManager entityManager;

	public void insertEventType(EventType eventType) {
		entityManager.persist(eventType);
		
	}

	public List<EventType> findAll() {
		return entityManager.createQuery("from EventType", EventType.class).getResultList();
	}

	public EventType findByEventTypeName(String typeName) {
		return entityManager.createNamedQuery("EventType.findByEventTypeName", EventType.class)
				.setParameter("typeName", typeName).setMaxResults(1).getSingleResult();
	}



	
}
