package com.springboot.abhibootdemo.entity;

import java.sql.Date;

public class Person {
	private int id;
	private String name;
	private String loc;
	private Date bd;
	public Person(int id, String name, String loc, Date bd) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
		this.bd = bd;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Date getBd() {
		return bd;
	}
	public void setBd(Date bd) {
		this.bd = bd;
	}
	

}
