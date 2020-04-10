package com.springboot.abhibootdemo;

import org.springframework.stereotype.Component;

@Component
public class Book implements myinterface{
	long id;
	String Name;
	String author;
	public Book(long id, String name, String author) {
		super();
		this.id = id;
		this.Name = name;
		this.author = author;
	}
	public Book() {
		id=310024l;
		Name="abi";
		author="hisj";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return this.Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String Detail()
	{
		return "book [id=" + id + ", Name=" + Name + ", author=" + author + "]";
	}
	
	@Override
	public String toString() {
		return "book [id=" + id + ", Name=" + Name + ", author=" + author + "]";
	}
	

}
