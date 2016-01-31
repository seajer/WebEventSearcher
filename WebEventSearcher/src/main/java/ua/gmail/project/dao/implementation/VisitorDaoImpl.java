package ua.gmail.project.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.gmail.project.dao.VisitorDao;
import ua.gmail.project.entity.Visitor;

@Repository
public class VisitorDaoImpl extends EntityDAOAbstract<Visitor, Integer> implements VisitorDao {
	
@PersistenceContext(unitName ="Primary")
private EntityManager entityManager;

	@Transactional
	public Visitor findByLogin(String login) {
		
		return entityManager.createQuery("select v from Visitor v where v.login like :login", Visitor.class).setParameter("login", login).getSingleResult();
	}

	@Transactional
	public void addVisitor(Visitor visitor) {
		entityManager.persist(visitor);
	
	}
	@Transactional
	public void updateVisitor(Visitor visitor) {
		entityManager.merge(visitor);
	}
	@Transactional
	public void removeVisitor(Visitor visitor) {
		entityManager.remove(visitor);
	
	}

	@Transactional
	public Visitor findById(int id) {
		return entityManager.find(Visitor.class, id);
	}

	@Transactional
	public List<Visitor> findVisitors() {
		return entityManager.createQuery("from Visitor", Visitor.class).getResultList();
	}


}
