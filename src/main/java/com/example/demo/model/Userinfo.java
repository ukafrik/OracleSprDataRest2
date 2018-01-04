package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;


public class Userinfo implements Serializable {
	private static final long serialVersionUID = 1L;

	private String email;

	private String password;

	private BigDecimal userId;

	private String username;

	public Userinfo() {
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public BigDecimal getUserId() {
		return this.userId;
	}

	public void setUserId(BigDecimal userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}