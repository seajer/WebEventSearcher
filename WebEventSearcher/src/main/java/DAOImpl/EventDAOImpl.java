package DAOImpl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import DAO.EntityDAOAbstract;
import DAO.EventDAO;
import DAO.HibernateUtil;
import Entity.Event;
import Entity.Location;
import Entity.EventType;

public class EventDAOImpl extends EntityDAOAbstract<Event, Integer> implements EventDAO<Event> {

	private EntityManager entityManager;
	
	private void openEntityManager(){
		entityManager = HibernateUtil.getSessionFactory().createEntityManager();
	}
	
	private void closeEntityManager(){
		if(entityManager != null && entityManager.isOpen()){
			entityManager.close();
		}
	}
	
	public List<Event> findByInterval(Date begin, Date end) {
		List<Event> list = null;
		try {
			openEntityManager();
			entityManager.getTransaction().begin();
			list = entityManager.
					createQuery("SELECT t FROM "+Event.class.getName()+" t WHERE t.begin >= :begin AND t.end <= :end ").
					setParameter("begin", begin).
					setParameter("end", end).
					getResultList();
			entityManager.getTransaction().commit();			
		} finally{
			closeEntityManager();
		}	
		return list;
	}

	public List<Event> findByLocation(Location location) {
		List<Event> list = null;
		try {
			openEntityManager();
			entityManager.getTransaction().begin();
			list = entityManager.
					createQuery("SELECT t FROM "+Event.class.getName()+" t WHERE t.location = :location").
					setParameter("location", location).
					getResultList();
			entityManager.getTransaction().commit();			
		} finally{
			closeEntityManager();
		}	
		return list;
	}

	public List<Event> findByType(EventType eventType) {
		List<Event> list = null;
		try {
			openEntityManager();
			entityManager.getTransaction().begin();
			list = entityManager.
					createQuery("SELECT t FROM "+Event.class.getName()+" t WHERE t.eventType = :eventType").
					setParameter("eventType", eventType).
					getResultList();
			entityManager.getTransaction().commit();			
		} finally{
			closeEntityManager();
		}	
		return list;
	}

}
