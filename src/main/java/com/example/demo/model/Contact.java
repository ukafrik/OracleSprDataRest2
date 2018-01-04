package com.example.demo.model;

import java.io.Serializable;


public class Contact implements Serializable {
	private static final long serialVersionUID = 1L;

	private String contactid;

	private String address;

	private String city;

	private String phone;

	private String testflag;

	private String zipcode;

	private Customer customer;

	public Contact() {
	}

	public String getContactid() {
		return this.contactid;
	}

	public void setContactid(String contactid) {
		this.contactid = contactid;
	}
	

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTestflag() {
		return this.testflag;
	}

	public void setTestflag(String testflag) {
		this.testflag = testflag;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}