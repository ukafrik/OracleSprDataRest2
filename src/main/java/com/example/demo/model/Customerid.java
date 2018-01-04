package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;


public class Customerid implements Serializable {
	private static final long serialVersionUID = 1L;

	private long customerid;

	private BigDecimal drvLicNo;

	public Customerid() {
	}

	public long getCustomerid() {
		return this.customerid;
	}

	public void setCustomerid(long customerid) {
		this.customerid = customerid;
	}

	public BigDecimal getDrvLicNo() {
		return this.drvLicNo;
	}

	public void setDrvLicNo(BigDecimal drvLicNo) {
		this.drvLicNo = drvLicNo;
	}

}