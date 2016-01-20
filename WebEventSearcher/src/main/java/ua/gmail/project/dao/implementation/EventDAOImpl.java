package ua.gmail.project.dao.implementation;

import java.util.List;

import org.springframework.stereotype.Repository;

import ua.gmail.project.dao.EventDAO;
import ua.gmail.project.entity.Event;
import ua.gmail.project.entity.Location;

@Repository
public class EventDAOImpl extends EntityDAOAbstract<Event, Integer> implements EventDAO{


}
