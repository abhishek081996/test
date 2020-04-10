package com.example.demo.customer;

import org.springframework.stereotype.Component;

@Component
public class customer {
	private long id;
	private String Name;
	private String location;
	private String birth_date;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}
	@Override
	public String toString() {
		return "customer [id=" + id + ", Name=" + Name + ", location=" + location + ", birth_date=" + birth_date + "]";
	}
	
	
	

}
