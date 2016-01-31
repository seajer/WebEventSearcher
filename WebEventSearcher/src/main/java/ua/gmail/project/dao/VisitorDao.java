package ua.gmail.project.dao;

import java.util.List;

import ua.gmail.project.entity.Visitor;

public interface VisitorDao extends EntityDAO<Visitor, Integer>{
	
Visitor findByLogin(String login);

void addVisitor(Visitor visitor);

void updateVisitor (Visitor visitor);

void removeVisitor (Visitor visitor);

Visitor findById(int id);

List<Visitor> findVisitors();


}
