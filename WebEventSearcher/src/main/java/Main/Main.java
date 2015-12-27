package Main;

import java.util.Date;
import java.util.List;

import org.hibernate.Hibernate;

import DAO.HibernateUtil;
import DAOImpl.DAOFactory;
import Entity.Event;
import Entity.EventType;
import Entity.Location;

public class Main {

	public static void main(String[] args) {

		DAOFactory daoFactory = DAOFactory.getInstance();
		daoFactory.getLocationDAOImpl().add(new Location("Arena Lviv","Struyska street, 199, Lviv, Lviv obl, 79000"));
		daoFactory.getLocationDAOImpl().add(new Location("PLANETA KINO King Cross Leopolis","King Cross Leopolis, Struyska street, 30, Lviv, Lviv obl, 81130"));
		
		daoFactory.getEventTypeDAOImpl().add(new EventType("Football match"));
		daoFactory.getEventTypeDAOImpl().add(new EventType("Movie"));
		
		daoFactory.getEventDAOImpl().update(new Event("Match UKRAINE - ENGLAND",
				new Date(116, 4, 11, 20, 00), 
				new Date(116, 4, 11, 21, 30), 
				250.0,
		daoFactory.getLocationDAOImpl().findByKey(Location.class, 1), 
		daoFactory.getEventTypeDAOImpl().findByKey(EventType.class, 1)));
		
		daoFactory.getEventDAOImpl().update(new Event("STAR WARS 7",
				new Date(116, 1, 29, 20, 00), 
				new Date(116, 1, 29, 23, 30),
				150.0,
				daoFactory.getLocationDAOImpl().findByKey(Location.class, 2), 
				daoFactory.getEventTypeDAOImpl().findByKey(EventType.class, 2)));
		
		daoFactory.getEventDAOImpl().update(new Event("Warcraft: begin",
		new Date(116, 3, 29, 20, 00), 
		new Date(116, 3, 29, 23, 30),
		150.0,
		daoFactory.getLocationDAOImpl().findByKey(Location.class, 2), 
		daoFactory.getEventTypeDAOImpl().findByKey(EventType.class, 2)));
			
		List<Event> list = daoFactory.getEventDAOImpl().findByInterval(
				new Date(116, 1, 29, 20, 00),
				new Date(116, 1, 29, 23, 30));
		
		for (Event event : list) {
			System.out.println(event.toString());
		}
		
		System.out.println("==============================================================================");
		list = daoFactory.getEventDAOImpl().findByInterval(
				new Date(116, 1, 29, 20, 00), new Date(116, 4, 11, 21, 30));
		
		for (Event event : list) {
			System.out.println(event.toString());
		}
		System.out.println("==============================================================================");
		list = daoFactory.getEventDAOImpl().findByLocation(daoFactory.getLocationDAOImpl().findByKey(Location.class, 2));
		
		for (Event event : list) {
			System.out.println(event.toString());
		}
				
		HibernateUtil.CloseSessionFactory(); 
	}

}
