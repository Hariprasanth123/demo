package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Properties {
public String mobilenumber;
public String customerid;
public String getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(String mobilenumber) {
	this.mobilenumber = mobilenumber;
}
public String getCustomerid() {
	return customerid;
}
public void setCustomerid(String customerid) {
	this.customerid = customerid;
}

  
}
