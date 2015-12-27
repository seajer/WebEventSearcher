package DAO;

import java.util.List;

import javax.persistence.EntityManager;

public abstract class EntityDAOAbstract<T, PK> implements EntityDAO<T, PK>{
	
	private EntityManager entityManager;
		
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	private void openEntityManager(){
		entityManager = HibernateUtil.getSessionFactory().createEntityManager();
	}
	
	private void closeEntityManager(){
		if(entityManager != null && entityManager.isOpen()){
			entityManager.close();
		}
	}
	

	public void add(T obj) {
		try {
			openEntityManager();
			entityManager.getTransaction().begin();
			entityManager.persist(obj);
			entityManager.getTransaction().commit();			
		} finally{
			closeEntityManager();
		}		
	}

	public void update(T obj) {
		try {
			openEntityManager();
			entityManager.getTransaction().begin();
			entityManager.merge(obj);
			entityManager.getTransaction().commit();			
		} finally{
			closeEntityManager();
		}		
	}

	public void remove(T obj) {
		try {
			openEntityManager();
			entityManager.getTransaction().begin();
			entityManager.remove(obj);
			entityManager.getTransaction().commit();			
		} finally{
			closeEntityManager();
		}	
	}

	public T findByKey(Class<T> T,PK key) {
		T obj = null;
		try {
			openEntityManager();
			entityManager.getTransaction().begin();
			obj = (T) entityManager.find(T, key);
			entityManager.getTransaction().commit();			
		} finally{
			closeEntityManager();
		}	
		return obj;
	}
	
	public List<T> findAll(Class<T> T) {
		List<T> list = null;
		try {
			openEntityManager();
			entityManager.getTransaction().begin();
			list = entityManager.createQuery("FROM "+T.getName()).getResultList();
			entityManager.getTransaction().commit();			
		} finally{
			closeEntityManager();
		}
		return list;
	}


	public List<T> findByName(Class<T> T,String name) {
		List<T> list = null;
		try {
			openEntityManager();
			entityManager.getTransaction().begin();
			list = entityManager.createQuery("SELECT t FROM "+T.getName()+" t WHERE t.name like :name").setParameter("name", name).getResultList();
			entityManager.getTransaction().commit();			
		} finally{
			closeEntityManager();
		}	
		return list;
	}

	
	

}
