package DAOImpl;

public class DAOFactory {
	
	private EventDAOImpl eventDAOImpl = null;
	private LocationDAOImpl locationDAOImpl = null;
	private EventTypeDAOImpl eventTypeDAOImpl = null;
    private static DAOFactory instance = null;

    private DAOFactory() {
    	eventDAOImpl = new EventDAOImpl();
    	locationDAOImpl = new LocationDAOImpl();
    	eventTypeDAOImpl = new EventTypeDAOImpl();
    }


    public static synchronized DAOFactory getInstance() {
        if (instance == null) {
            instance = new DAOFactory();
        }
        return instance;
    }


	public EventDAOImpl getEventDAOImpl() {
		return eventDAOImpl;
	}

	public LocationDAOImpl getLocationDAOImpl() {
		return locationDAOImpl;
	}


	public EventTypeDAOImpl getEventTypeDAOImpl() {
		return eventTypeDAOImpl;
	}
}
