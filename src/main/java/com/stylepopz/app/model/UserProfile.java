package com.stylepopz.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class UserProfile {
	
	    @Id @GeneratedValue
	    @Column(name="ID")
	   // @GeneratedValue
	    private Integer id;
	    
	    @Column(name="NAME")
	    private String name;
 
	    @Column(name="gender")
	    private String gender;
	 
	    @Column(name="EMAIL")
        private String email;
	    
	    @Column(name="telephone")
        private String telephone;


		public String getTelephone() {
			return telephone;
		}

		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
}
