package DAO;

import java.util.List;

public interface LocationDAO<T> {
	
	public List<T> findByAddress(String address);

}
