package ua.gmail.project.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.gmail.project.dao.LocationDAO;
import ua.gmail.project.entity.EventType;
import ua.gmail.project.entity.Location;
import ua.gmail.project.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationDAO loactionDao; 
	
	
	@Transactional
	public void add(Location location) {
		if(location != null)
			loactionDao.add(location);
		
	}
	
	
	
	@Transactional
	public void update(Location location) {
		if(location != null)
			loactionDao.update(location);
		
	}
	
	@Transactional
	public List<Location> findAll() {
		return loactionDao.findAll(Location.class);
	}


	@Transactional
	public Location findById(String id) {
		return loactionDao.findByKey(Location.class, Integer.parseInt(id));
	}


	@Transactional
	public void remove(String id) {
		Location location = loactionDao.findByKey(Location.class, Integer.parseInt(id));
		loactionDao.remove(location);
		
	}

}
