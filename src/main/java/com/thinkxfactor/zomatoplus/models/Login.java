package com.thinkxfactor.zomatoplus.models;

public class Login {
private String name, password;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Login(String name, String password) {
	super();
	this.name = name;
	this.password = password;
}

public Login() {
	super();
	// TODO Auto-generated constructor stub
}

}
