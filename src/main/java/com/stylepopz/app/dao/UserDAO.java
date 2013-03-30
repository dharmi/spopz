package com.stylepopz.app.dao;

import java.util.List;

import com.stylepopz.app.model.UserProfile;

public interface UserDAO {
	
	public void addUser(UserProfile contact);
    public List<UserProfile> listUser();
    public void removeUser(String id);

}
