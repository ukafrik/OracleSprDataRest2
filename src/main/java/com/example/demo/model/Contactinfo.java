package com.example.demo.model;

import java.io.Serializable;


public class Contactinfo implements Serializable {
	private static final long serialVersionUID = 1L;

	private long id;

	private String email;

	private String name;

	private String phonenumber;

	public Contactinfo() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonenumber() {
		return this.phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

}