package com.example.demo.model;

import java.io.Serializable;


public class Wso2customer implements Serializable {
	private static final long serialVersionUID = 1L;

	private String customerid;

	private String name;

	private String nid;

	public Wso2customer() {
	}

	public String getCustomerid() {
		return this.customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNid() {
		return this.nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

}