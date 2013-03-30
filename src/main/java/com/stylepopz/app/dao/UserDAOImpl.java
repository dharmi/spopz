package com.stylepopz.app.dao;

import java.util.Iterator;
import java.util.List;

 
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stylepopz.app.model.UserProfile;
 
@Repository
public class UserDAOImpl implements UserDAO {
 
    @Autowired
    private SessionFactory sessionFactory;
 
    public void addUser(UserProfile contact) {
        sessionFactory.getCurrentSession().save(contact);
    }
 
    public List<UserProfile> listUser() {
 
        List<UserProfile> users = sessionFactory.getCurrentSession().createQuery("from UserProfile")
                .list();
        
        for(int i=0;i<users.size();i++) {
        	UserProfile user = users.get(0);
        	System.out.println("User: "+user.toString());
        }
        return users;
    }
 
    public void removeUser(String id) {
    	UserProfile contact = (UserProfile) sessionFactory.getCurrentSession().load(
    			UserProfile.class, id);
        if (null != contact) {
            sessionFactory.getCurrentSession().delete(contact);
        }
 
    }
}
