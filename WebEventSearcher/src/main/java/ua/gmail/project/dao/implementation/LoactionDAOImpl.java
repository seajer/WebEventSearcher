package ua.gmail.project.dao.implementation;

import org.springframework.stereotype.Repository;

import ua.gmail.project.dao.LocationDAO;
import ua.gmail.project.entity.Location;

@Repository
public class LoactionDAOImpl extends EntityDAOAbstract<Location, Integer> implements LocationDAO{

}
