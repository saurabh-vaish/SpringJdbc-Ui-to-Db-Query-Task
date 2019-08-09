package com.app.model;

import org.springframework.stereotype.Component;

@Component
public class User {

	private String userQuery;

	
	public User() {
		super();
	}

	public User(String userQuery) {
		this.userQuery = userQuery;
	}

	public String getUserQuery() {
		return userQuery;
	}

	public void setUserQuery(String userQuery) {
		this.userQuery = userQuery;
	}

	@Override
	public String toString() {
		return "User [userQuery=" + userQuery + "]";
	}
	
	
	
	
	
}
