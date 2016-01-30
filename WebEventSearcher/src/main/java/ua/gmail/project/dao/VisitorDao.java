package ua.gmail.project.dao;

import ua.gmail.project.entity.Visitor;

public interface VisitorDao {
Visitor findByLogin(String login);


}
