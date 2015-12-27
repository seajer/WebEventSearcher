package DAOImpl;

import java.util.List;

import javax.persistence.EntityManager;

import DAO.EntityDAOAbstract;
import DAO.HibernateUtil;
import DAO.LocationDAO;
import Entity.Event;
import Entity.Location;

public class LocationDAOImpl extends EntityDAOAbstract<Location, Integer> implements LocationDAO<Location>{

private EntityManager entityManager;
	
	private void openEntityManager(){
		entityManager = HibernateUtil.getSessionFactory().createEntityManager();
	}
	
	private void closeEntityManager(){
		if(entityManager != null && entityManager.isOpen()){
			entityManager.close();
		}
	}
	
	public List<Location> findByAddress(String address) {
		List<Location> list = null;
		try {
			openEntityManager();
			entityManager.getTransaction().begin();
			list = entityManager.
					createQuery("SELECT t FROM "+Location.class.getName()+" t WHERE t.address = :address").
					setParameter("address", address).
					getResultList();
			entityManager.getTransaction().commit();			
		} finally{
			closeEntityManager();
		}	
		return list;
	}

}
