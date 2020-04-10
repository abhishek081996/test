package com.springboot.abhibootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class bdi {
	
	
	@Autowired
	public Book book;
	
	public bdi(Book k)
	{
		this.book = k;
	}

	public void setbdi(Book ook) {
		this.book=ook;
		
	}
	
	public String details() {
		return (book.Detail());
	}

}
