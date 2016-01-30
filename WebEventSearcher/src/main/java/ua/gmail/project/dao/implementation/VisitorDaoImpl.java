package ua.gmail.project.dao.implementation;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.gmail.project.dao.VisitorDao;
import ua.gmail.project.entity.Visitor;

@Repository
public class VisitorDaoImpl implements VisitorDao {
@PersistenceContext(unitName ="Primary")
private EntityManager entityManager;

	@Transactional
	public Visitor findByLogin(String login) {
		return entityManager.createQuery("select v from Visitor v where v.login like :login", Visitor.class).setParameter("login", login).getSingleResult();
	}


}
