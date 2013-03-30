package com.stylepopz.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="user")
public class User {
     
    @Id
    @Column(name="ID")
    @GeneratedValue
    private Integer id;
    
    @Column(name="token")
    private String token;
    
    public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	//     
//    @Column(name="FIRSTNAME")
//    private String firstname;
// 
//    @Column(name="LASTNAME")
//    private String lastname;
// 
//    @Column(name="EMAIL")
//    private String email;
//     
//    @Column(name="TELEPHONE")
//    private String telephone;
//     
//    @Column(name = "PREFERENCES")
//    private String preferences;
//     
//    public String getPreferences() {
//		return preferences;
//	}
//	public void setPreferences(String preferences) {
//		this.preferences = preferences;
//	}
//	public String getEmail() {
//        return email;
//    }
//    public String getTelephone() {
//        return telephone;
//    }
//    public void setEmail(String email) {
//        this.email = email;
//    }
//    public void setTelephone(String telephone) {
//        this.telephone = telephone;
//    }
//    public String getFirstname() {
//        return firstname;
//    }
//    public String getLastname() {
//        return lastname;
//    }
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

}
