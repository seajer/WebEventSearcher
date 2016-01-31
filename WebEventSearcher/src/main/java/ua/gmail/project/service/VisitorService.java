package ua.gmail.project.service;

import java.util.List;

import ua.gmail.project.entity.Visitor;


public interface VisitorService {
	
	
	void addVisitor(Visitor visitor);
	
	void updateVisitor (Visitor visitor);
	
	void removeVisitor (String id);
	
	Visitor getVisitorById(int id);
	
	List<Visitor> getAllVisitors();
	

}
