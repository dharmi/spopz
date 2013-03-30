package com.stylepopz.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.stylepopz.app.dao.UserDAO;
import com.stylepopz.app.model.UserProfile;

public class UserServiceImpl implements UserService {
	
	@Autowired
    private UserDAO userDAO;
  
	  @Transactional
	public void addUser(UserProfile user) {
		userDAO.addUser(user);

	}

	  @Transactional  
	public List<UserProfile> listUser() {
		  return userDAO.listUser();
	}

	  @Transactional  
	public void removeUser(String id) {
		  userDAO.removeUser(id);

	}

}
