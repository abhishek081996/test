package com.springboot.abhibootdemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {
	

	@GetMapping(value="/book")
	@ResponseBody
	public ResponseEntity<List<Book>> getAllBooks() {
	
		return new ResponseEntity<List<Book>> ( (Arrays.asList(
				new Book(1354l, "Mastering Spring 5.66", "Ranga Karanam"))), HttpStatus.OK);
	}
	

}
