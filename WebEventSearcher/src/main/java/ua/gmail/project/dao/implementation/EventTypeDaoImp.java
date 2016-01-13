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
	public EventType findByEventTypeName(String typeName) {
		return entityManager.createNamedQuery("EventType.findByEventTypeName", EventType.class)
				.setParameter("typeName", typeName).setMaxResults(1).getSingleResult();
	}
	
}
