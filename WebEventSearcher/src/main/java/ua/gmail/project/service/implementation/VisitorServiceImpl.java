package ua.gmail.project.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.gmail.project.dao.VisitorDao;
import ua.gmail.project.entity.Visitor;
import ua.gmail.project.service.VisitorService;

@Service
public class VisitorServiceImpl implements VisitorService{
	
	@Autowired
	private VisitorDao visitorDao;
	
	@Autowired
	 private BCryptPasswordEncoder encoder;

	@Transactional
	 public void addVisitor(Visitor visitor) {
	  visitor.setPassword(encoder.encode(visitor.getPassword()));
	  visitorDao.add(visitor);
	 }
	
	@Transactional
	public void updateVisitor(Visitor visitor) {
		visitor.setPassword(encoder.encode(visitor.getPassword()));
		visitorDao.update(visitor);
		
	}

	@Transactional
	public void removeVisitor(String id) {
		Visitor visitor = visitorDao.findById(Integer.parseInt(id));
		visitorDao.remove(visitor);
		
	}
	
	@Transactional
	public Visitor getVisitorById(int id) {
		return visitorDao.findById(id);
	}
	
	@Transactional
	public List<Visitor> getAllVisitors() {
		return visitorDao.findAll(Visitor.class);
	}




}
