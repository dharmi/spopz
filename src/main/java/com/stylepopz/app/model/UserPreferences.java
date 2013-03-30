package com.stylepopz.app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class UserPreferences {
	
	 @Id
	    @Column(name="ID")
	    @GeneratedValue
	    private Integer id;
	 
	   @Column(name = "PREFERENCES")
   		private String preferences;
    
	   
	   public String getPreferences() {
		   return preferences;
	   }


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public void setPreferences(String preferences) {
		this.preferences = preferences;
	}
}
