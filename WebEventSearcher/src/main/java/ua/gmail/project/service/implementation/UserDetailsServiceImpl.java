package ua.gmail.project.service.implementation;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.gmail.project.dao.VisitorDao;
import ua.gmail.project.entity.Visitor;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private VisitorDao visitorDao;

	@Transactional
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		System.out.println("Oops!");
		Visitor visitor = null;
		try {
			visitor = visitorDao.findByLogin(login);
		} catch (NoResultException e) {
			return null;
		}
		Collection<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
		return new User(String.valueOf(visitor.getId()), visitor.getPassword(), authorities);
	}

}
