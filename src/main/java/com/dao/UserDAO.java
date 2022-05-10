package com.dao;
import com.model.User;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface UserDAO {

	public void addUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(String id);
	public User findUser(String id);
	public List<User> findAllUsers();
}
