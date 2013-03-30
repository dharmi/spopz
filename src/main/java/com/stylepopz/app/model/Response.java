package com.stylepopz.app.model;

import java.util.ArrayList;


public class Response {
	
	public String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ArrayList<Item> getKeywords() {
		return keywords;
	}
	public void setKeywords(ArrayList<Item> keywords) {
		this.keywords = keywords;
	}
	public ArrayList<Item> keywords;

}
