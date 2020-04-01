package com.moviecruiser.userprofile.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Register {
	
	@Id
	private String id;
	
	private String username;
	
	private String password;
	
	private String rptpassword;
	
	private String email;
	
	public Register() {
		super();
	}

	public Register(String id, String username, String password, String rptpassword, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.rptpassword = rptpassword;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRptpassword() {
		return rptpassword;
	}

	public void setRptpassword(String rptpassword) {
		this.rptpassword = rptpassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	


	
	
	
	
	

}
