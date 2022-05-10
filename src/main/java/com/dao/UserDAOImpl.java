package com.dao;

import com.model.*;
import java.util.*;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.hibernate.Query;
import org.hibernate.Session;
@Component
public class UserDAOImpl  implements UserDAO{

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addUser(User user) {
		
		Session session=sessionFactory.openSession();
        session.getTransaction().begin();
        session.save(user);
        session.flush();
        session.getTransaction().commit();
        session.close();
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean updateUser(User user) {
		
		Session session=sessionFactory.openSession();
        session.getTransaction().begin();
        session.update(user);
        session.flush();
        session.getTransaction().commit();
        session.close();
		
		
		
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean deleteUser(String id) {
		Session session=sessionFactory.openSession();
        User user=session.find(User.class, id);
		session.getTransaction().begin();
        session.delete(user);
        session.flush();
        session.getTransaction().commit();
        session.close();
		
		
		
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public User findUser(String id) {
		Session session=sessionFactory.openSession();
        User user=session.find(User.class, id);

		// TODO Auto-generated method stub
		return user;
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		
		Query query=session.createQuery("Select u from User u");
		
		return query.list();
	}
	
	
}
