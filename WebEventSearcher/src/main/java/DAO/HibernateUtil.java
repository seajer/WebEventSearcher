package DAO;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

	private static EntityManagerFactory emFactory = null;
   
    static {
    	try {
       		emFactory = Persistence.createEntityManagerFactory("Primary");
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }

    public static EntityManagerFactory getSessionFactory() {
    	return emFactory;
    }    
    
    public static void CloseSessionFactory() {
    	if ((emFactory != null) && (emFactory.isOpen())) {
    		emFactory.close();
        }
    }
} 