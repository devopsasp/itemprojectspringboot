package com.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.*;

@Service

public class UserService {

@Autowired
UserDAO userDAOImpl;


public void add(User user)
{
	userDAOImpl.addUser(user);
}


public boolean update(User user)
{
	return userDAOImpl.updateUser(user);
}

public boolean delete(String id)
{
	return userDAOImpl.deleteUser(id);
}

public User find(String id)
{
	return userDAOImpl.findUser(id);
}


public List<User> findAll()
{
	return userDAOImpl.findAllUsers();
}











}
