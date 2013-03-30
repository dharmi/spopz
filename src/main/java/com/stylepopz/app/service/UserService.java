package com.stylepopz.app.service;

import java.util.List;

import com.stylepopz.app.model.UserProfile;

public interface UserService {
	
	public void addUser(UserProfile contact);
    public List<UserProfile> listUser();
    public void removeUser(String id);

}
