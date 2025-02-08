package com.chary.database;

import lombok.Data;

 
public class Admin
{
 private String name,email,fname,lname,phno,pass;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public String getPhno() {
	return phno;
}

public void setPhno(String phno) {
	this.phno = phno;
}

public String getPass() {
	return pass;
}

public void setPass(String pass) {
	this.pass = pass;
}
 
}
